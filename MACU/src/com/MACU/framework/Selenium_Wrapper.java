package com.MACU.framework;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.io.Files;

//com.MACU.framework - Contains the Base Framework around which the MACU Testing project is build.
//Hierarchy of Classes in the com.MACU.framework is as follows(Class to the right inherits/extends the class to the left):
//GlobalVariable >> GlobalObjectRepository >> ReUsableMethods >> Selenium_Wrapper >> MACU_Wrapper >> BaseClass

// This class contains all the UI related actions performed using selenium wrapped in a custom method.

public class Selenium_Wrapper extends ReUsableMethods {


		public static void openBrowser() throws Exception {
			openBrowser(BROWSER);
		}

		private static void openBrowser(String browserName) throws Exception {
			try {
				browserName = browserName.toLowerCase();
				switch (browserName) {

				case "chrome": {
					System.setProperty("webdriver.chrome.driver", WEBDRIVER_EXECUTABLES_PATH + "chromedriver.exe");
					driver = new ChromeDriver(getChromeBrowserProfile());
					log.info("Opening {} browser.", browserName);
					break;
				}
				case "msedgedriver": {
					System.setProperty("webdriver.edge.driver", WEBDRIVER_EXECUTABLES_PATH + "msedgedriver.exe");
					driver = new EdgeDriver();
					log.info("Opening {} browser.", browserName);
					break;
				}
 
				case "firefox": {
					System.setProperty("webdriver.gecko.driver", WEBDRIVER_EXECUTABLES_PATH + "geckodriver.exe");
					System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
					driver = new FirefoxDriver();
					log.info("Opening {} browser.", browserName);
					break;
				}
				default:
					log.error("Pass a proper name for the Browser i.e. Chrome, firefox, IE");
					System.exit(0);
				}
				actions = new Actions(driver); // Initialisied Actions
				jse = (JavascriptExecutor) driver;// Initialisied JavaScriptExecutor
				wait = new WebDriverWait(driver, WEBDRIVER_WAIT_TIME);
			} catch (Exception e) {
				log.error(e);
				throw e;
			}
		}

	//This method is used to enter the url in the browser
		public static void enterURL(String url) {
			try {
				driver.navigate().to(url);
				log.info("Entering url :{}", url);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static String getPageTitle() {
			return driver.getTitle();
		}

	// Click Method
		public static void click(By by) throws Exception {
			hardWait(2);
			click(getWebElement(by));
		}

		public static WebElement getWebElement(By locator) throws Exception {
			WebElement webElement;
			try {
				webElement = driver.findElement(locator);
			} catch (StaleElementReferenceException e) {
				hardWait(1);
				webElement = driver.findElement(locator);
				System.err.println("stale element handled");
			}

			return getWebElement(webElement);
		}
		
		public static WebElement getWebElement(String locator) throws Exception {
			return getWebElement(getByLocator(locator));
	}
		public static WebElement getWebElement(WebElement webElement) throws Exception {
			try {
				wait.until(ExpectedConditions.visibilityOf(webElement));
				return wait.until(ExpectedConditions.elementToBeClickable(webElement));
			} catch (StaleElementReferenceException e) {
				hardWait(5);
				System.err.println("stale element handled");
				return wait.until(ExpectedConditions.elementToBeClickable(webElement));

			} catch (Exception e) {
				log.error(e);
				throw e;
			}
		}
		
		public static String getTextOfWebelement(By by) throws Exception {
			return getTextOfWebelement(getWebElement(by));
		}
		
		public static String getTextOfWebelement(String locator) throws Exception {
			return getTextOfWebelement(getWebElement(locator));
		}

		public static String getTextOfWebelement(WebElement webElement) throws Exception {
			try {
				return webElement.getText();
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		
		public static By getByLocator(String locator) throws Exception {

			// Splitting locator to extract the Locator_type and Locator_Value
			String locatorType = locator.split(":", 2)[0]; // Example: locator = id:ABC, then locatorType = id
			String locatorValue = locator.split(":", 2)[1]; // Example: locator = id:ABC, then locatorValue = ABC

			By by;

			locatorType = locatorType.toLowerCase();
			switch (locatorType) {
			case "id":
				by = By.id(locatorValue);
				break;

			case "name":
				by = By.name(locatorValue);
				break;

			case "classname":
				by = By.className(locatorValue);
				break;

			case "tagname":
				by = By.tagName(locatorValue);
				break;

			case "linktext":
				by = By.linkText(locatorValue);
				break;

			case "partiallinktext":
				by = By.partialLinkText(locatorValue);
				break;

			case "cssselector":
				by = By.cssSelector(locatorValue);
				break;

			case "xpath":
				by = By.xpath(locatorValue);
				break;

			default:
				by = null;
				log.error("Unknown Locator type: {} ", locatorType);
			}
			return by;
		}

		// This method Clicks on the WebElement
		public static void click(WebElement webElement) throws Exception {
			try {
				waitTillVisible(webElement).click();
				log.info("Clicking on :{}", webElement);
			} catch (ElementClickInterceptedException elementClickInterceptedException) {
				int attempts = 0;
				while (attempts < WEBDRIVER_WAIT_TIME) {
					try {
						hardWait(1);
						wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
					} catch (ElementClickInterceptedException e) {
					}
					attempts++;
				}
				log.debug("Handled ElementClickInterceptedException and Clicked on :{}", webElement);
			} catch (StaleElementReferenceException staleElementException) {
				int attempts = 0;
				while (attempts < WEBDRIVER_WAIT_TIME) {
					try {
						hardWait(1);
						wait.until(ExpectedConditions.visibilityOf(webElement)).click();
						hardWait(1);
					} catch (ElementClickInterceptedException e) {
					}
					attempts++;
				}
				log.debug("Handled the StaleElementException and Clicked on :{}", webElement);
			} catch (WebDriverException e) {
				int attempts = 0;
				while (attempts < WEBDRIVER_WAIT_TIME) {
					try {
						hardWait(1);
						wait.until(ExpectedConditions.visibilityOf(webElement)).click();
						hardWait(1);
					} catch (WebDriverException e1) {
					}
					attempts++;
				}
				log.debug("Handled the WebDriverException and Clicked on :{}", webElement);
			} catch (Exception e) {
				log.error(e);
				throw e;
			}
		}

	// Click by Action method [if normal click method is not working this can be used instead]
		public static void clickUsingActions(By by) throws Exception {
			clickUsingActions(getWebElement(by));
		}

		public static void clickUsingActions(WebElement webElement) throws Exception {
			try {
				actions.moveToElement(webElement).click().perform();
				log.info("Clicking on :{}", webElement);
			} catch (StaleElementReferenceException staleElementException) {
				hardWait(1);
				actions.moveToElement(webElement).click().perform();
				log.debug("Handled the StaleElementException and Clicked on :{}", webElement);
			} catch (Exception e) {
				log.error(e);
				throw e;
			}
		}

		public static WebElement waitTillVisible(WebElement webElement) throws Exception {
			try {
				return wait.until(ExpectedConditions.visibilityOf(webElement));
			} catch (Exception e) {
				log.error(e);
				throw e;
			}
		}
	// DoubleClick
		public static void doubleClick(By by) throws Exception {
			try {
				doubleClick(getWebElement(by));
			} catch (Exception e) {
				log.error(e);
				throw e;
			}
		}
		public static void doubleClick(WebElement webElement) {
			try {
				actions.doubleClick(webElement).perform();
				log.info("Double clicking on :{}" , webElement);
			} catch (Exception e) {
				log.error(e);
			}
		}

	// Enter & Clear Text [ex: send keys]

		public static void clearTextBox(By by) throws Exception {
			clearTextBox(getWebElement(by));
		}

		public static void clearTextBox(WebElement webElement) throws Exception {
			try {
				waitTillVisible(webElement).clear();
				log.info("Cleared TextBox Field: {}", webElement);
			} catch (NoSuchElementException e) {
				log.error(e);
				throw e;
			}
		}

		public static void enterText(By by, String text) throws Exception {
			hardWait(1);
			enterText(getWebElement(by), text);
		}

		public static void enterText(WebElement webElement, String text) throws Exception {
			try {
				waitTillVisible(webElement).clear();
				webElement.sendKeys(text);
				log.info("Entering Text :{} in WebElement :{}", text, webElement);
			} catch (StaleElementReferenceException staleElementException) {
				hardWait(1);
				wait.until(ExpectedConditions.visibilityOf(webElement)).sendKeys(text);
				log.info("Handled StaleElement Exception, Entering Text :{} in WebElement :{}", text, webElement);
			} catch (Exception e) {
				log.error(e);
				throw e;
			}
		}

	//enter text using java script [if normal enter text method is not working then this could be used instead]
		public static void enterTextUsingJavaScript(By by, String text) throws Exception {
			try {
				enterTextUsingJavaScript(getWebElement(by), text);
			} catch (Exception e) {
				log.error(e);
				throw e;
			}
		}

		public static void enterTextUsingJavaScript(WebElement webElement, String text) {
			jse.executeScript("arguments[0].value='" + text + "';", webElement);
		}

	// Dropdown Methods
		public static void selectDropdownByIndex(By by, int index) throws Exception {
			selectDropdownByIndex(getWebElement(by), index);
		}

		public static void selectDropdownByIndex(WebElement webElement, int index) throws Exception {
			try {
				Select select = new Select(webElement);
				select.selectByIndex(index);
				log.info("Selecting Dropdown :{} by Index:{}", webElement, index);
			} catch (Exception e) {
				log.error(e);
				throw e;
			}
		}

		public static void selectDropdownByVisbileText(By by, String value) throws Exception {
			selectDropdownByVisbileText(getWebElement(by), value);
		}

		public static void selectDropdownByVisbileText(WebElement webElement, String value) throws Exception {
			try {
				Select select = new Select(getWebElement(webElement));
				select.selectByVisibleText(value);
				log.info("Selecting Dropdown :{} by visible text:{}", webElement, value);
			} catch (ElementClickInterceptedException elementClickInterceptedException) {
				int attempts = 0;
				while (attempts < WEBDRIVER_WAIT_TIME) {
					try {
						hardWait(1);
						wait.until(ExpectedConditions.elementToBeClickable(webElement));
						Select select = new Select(getWebElement(webElement));
						select.selectByVisibleText(value);
					} catch (ElementClickInterceptedException e) {
					}
					attempts++;
				}
				log.info("Handled StaleElementException and Selecting Dropdown :{} by visible text:{}", webElement, value);
			} catch (Exception e) {
				log.error(e);
				throw e;
			}
		}

	// If above dropdown methods are not working then this could be used instead

		public static void selectDropDownUsingActions(By by, String dropdownValueToBeSelected) throws Exception {
			try {
				actions.click(getWebElement(by)).sendKeys(dropdownValueToBeSelected).sendKeys(Keys.ENTER).perform();
			} catch (Exception e) {
				log.error(e);
				throw e;
			}
		}

	//Time stamp
		public static String getTimeStamp() {
			return currDateTimeddMMYYHHmmss();
		}

		public static String currDateTimeddMMYYHHmmss() {
			DateFormat dateFormat = new SimpleDateFormat("ddMMYYHHmmss");
			Date date = new Date();
			String currDateTimeddMMYYHHmmss = dateFormat.format(date);

			return currDateTimeddMMYYHHmmss;
		}

	// To get List of WebElements 
		public static List<WebElement> getWebElements(By by) throws Exception {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
			return driver.findElements(by);

		}

	// Highlight of webelement
		public static void highlightWebElement(By by) throws InterruptedException {
			try {
				hardWait(3);
				highlightWebElement(getWebElement(by));
			} catch (Exception e) {
				log.error(e);
			}
		}

		public static void highlightWebElement(WebElement element) throws InterruptedException {
			for (int i = 0; i < 6; i++) {
				jse = (JavascriptExecutor) driver;
				jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
						"color: orange; border: 3px solid orange;");
				Thread.sleep(125);
				jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
						"color: pink; border: 4px solid pink;");
				Thread.sleep(125);
				jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
						"color: yellow; border: 4px solid yellow;");
				Thread.sleep(125);
				jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
			}
		}

	//Move to webelement to click
		public static void moveToThenClick(By by) throws Exception {
			try {
				moveToThenClick(getWebElement(by));
			} catch (Exception e) {
				log.error(e);
				throw e;
			}
		}

		public static void moveToThenClick(WebElement webElement) throws Exception {
			try {
				actions.moveToElement(webElement).perform();
				webElement.click();
			} catch (Exception e) {
				log.error(e);
				throw e;
			}
		}

		public static void moveTo(By by) throws Exception {
			moveTo(getWebElement(by));
		}

		public static void moveTo(WebElement webElement) throws Exception {
			try {
				actions.moveToElement(webElement).perform();
			} catch (Exception e) {
				log.error(e);
				throw e;
			}
		}

	// Options for Chrome browser [ex: Maximized window, Disable Pop-ups, notifications etc.]
		public static ChromeOptions getChromeBrowserProfile() {
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("chrome.switches", "--disable-extensions");
			chromeOptions.addArguments("--start-maximized");
			chromeOptions.addArguments("--disable-save-password");
			chromeOptions.addArguments("disable-infobars");
			chromeOptions.addArguments("--disable-notifications");
			return chromeOptions;
		}

	// Scroll Methods

		public static void scrollToWebElement(By by) throws Exception {
			try {
				scrollToWebElement(getWebElement(by));
			} catch (Exception e) {
				log.error(e);
				throw e;
			}
		}

		public static void scrollToWebElement(WebElement we) {
			try {
				jse.executeScript("arguments[0].scrollIntoView();", we);
			} catch (Exception e) {
				log.error(e);
			}
		}

		public static void scrollByPixel(int xnum, int ynum) {
			try {
				jse.executeScript("window.scrollBy(" + xnum + "," + ynum + ")");
				// Example : jse.executeScript("window.scrollBy(x,y)");
			} catch (Exception e) {
				log.error(e);
			}
		}

	// Select CheckBox
		public static void selectCheckBox(By by) throws Exception {
			try {
				selectCheckBox(getWebElement(by));
			} catch (Exception e) {
				log.error(e);
				throw e;
			}
		}

		public static void selectCheckBox(WebElement webElement) throws Exception {
			try {
				if (!webElement.isSelected()) {
					webElement.click();
				}
				log.info("Selected the checkbox " + webElement);
			} catch (Exception e) {
				log.error(e);
				throw e;
			}
		}

	// Select Radio button
		public static void selectRadioButton(By by) throws Exception {
			selectRadioButton(getWebElement(by));
		}

		public static void selectRadioButton(WebElement webElement) throws Exception {
			try {
				if (!webElement.isSelected()) {
					webElement.click();
				}
				log.info("Selecting the Radio Button: {}", webElement);
			} catch (Exception e) {
				log.error(e);
				throw e;
			}
		}

	// Switch to Frame
		public static void switchToFrame(By by) throws Exception {
			switchToFrame(getWebElement(by));
		}

		public static void switchToFrame(WebElement webElement) throws Exception {
			try {
				driver.switchTo().frame(webElement);
			} catch (Exception e) {
				log.error(e);
				throw e;
			}
		}

	// Switch window
		public static void switchToWindowWithHandle(String handle) {
			driver.switchTo().window(handle);
		}

	// Wait methods

		public static void hardWait(int seconds) {
			try {
				Thread.sleep(1000 * seconds);
			} catch (InterruptedException e) {
				log.error(e);
			}
		}

		public static WebElement waitTillEnabled(By by) throws Exception {
			return waitTillEnabled(getWebElement(by));
		}

		public static WebElement waitTillEnabled(WebElement webElement) throws Exception {
			try {
				for (int i = 0; i < WEBDRIVER_WAIT_TIME; i++) {
					if (webElement.isEnabled()) {
						break;
					}
					Thread.sleep(500);
				}
				log.info("{} is enabled", webElement);
				return webElement;
			} catch (NoSuchElementException e) {
				log.error(e);
				throw e;
			}
		}

		public static WebElement waitTillPresent(By by) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, WEBDRIVER_WAIT_TIME);
				return wait.until(ExpectedConditions.presenceOfElementLocated(by));
			} catch (NoSuchElementException e) {
				log.error(e);
				throw e;
			}
		}

	// Assert Methods
		public static void assertActualAndExpectedText(String locator, String expectedText) throws Exception {
			assertActualAndExpectedText(getWebElement(locator), expectedText);
		}

		public static void assertActualAndExpectedText(By by, String expectedText) throws Exception {
			assertActualAndExpectedText(getWebElement(by), expectedText);
		}

		public static void assertActualAndExpectedText(WebElement webElement, String expectedText) throws Exception {
			String actualText = null;
			try {
				actualText = getTextOfWebelement(webElement);
				Assert.assertEquals(actualText, expectedText, "Assert for text on the WebElement FAILED");
				log.info("Assert for text on the WebElement PASSED: Locator:{} ,Actual Text:{} ,Expected Text:{}",
						webElement, actualText, expectedText);
			} catch (Exception e) {
				log.error("Assert for text on the WebElement FAILED: Locator:{} ,Actual Text:{} ,Expected Text:{}",
						webElement, actualText, expectedText);
				throw e;
			}
		}
		public static void softAssertActualAndExpectedText(String locator, String expectedText) throws Exception {
			assertActualAndExpectedText(getWebElement(locator), expectedText);
		}

		public static void softAssertActualAndExpectedText(By by, String expectedText) throws Exception {
			assertActualAndExpectedText(getWebElement(by), expectedText);
		}

		public static void softAssertActualAndExpectedText(WebElement webElement, String expectedText) throws Exception {
			String actualText = null;
			try {
				actualText = getTextOfWebelement(webElement);
				softAssert.assertEquals(actualText, expectedText,"Assert for text on the WebElement FAILED");
				log.info("Assert for text on the WebElement PASSED: Locator:{} ,Actual Text:{} ,Expected Text:{}", webElement, actualText, expectedText);
			} catch (Exception e) {
				log.error("Assert for text on the WebElement FAILED: Locator:{} ,Actual Text:{} ,Expected Text:{}", webElement, actualText, expectedText);
				throw e;
			}
		}
		public static void closeCurrentBrowser() {
			driver.close();
			//driver.browserClose();
			log.info("Closing the current Browser");
		}
		public static void getScreen() throws IOException {
			//String timeStamp     = new SimpleDateFormat("HH-mm a - dd MMM YYYY").format(new Date());
			File sourceFile 	 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File destinationFile = new File("./resources/reports/" + "_emailable-report.html" );
			Files.copy(sourceFile , destinationFile );
			//driver.close();
			//driver.browserClose();
			//log.info("Closing the current Browser");
		}
	}

