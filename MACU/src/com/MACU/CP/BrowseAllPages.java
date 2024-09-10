package com.MACU.CP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrowseAllPages extends BrowseAllPages_POM{
	@BeforeClass
	public void testSignIn() throws Exception {
		try {
			openBrowser();
			signIntoCP();
			
		} catch (Exception e) {
			log.error("Login/SignIn un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@Test (priority = 1, description = "Browser All Pages testing")
	public void testHighlightedKeyWords() throws Exception {
		try {
			hardWait(5);
			highlightWebElement(byClickBrowserAllPagesXpath);
			click(byClickBrowserAllPagesXpath);
			String ActualResultAllPagesText = getTextOfWebelement(byAllPagesXpath);
			String ExpectedResultAllPagesText="All Pages";
			String ActualResultViewAToZ = getTextOfWebelement(byViewAToZXpath);
			String ExpectedResultVIEWAZINDEXText="VIEW A-Z INDEX";
			String ActualResultFilterProduct = getTextOfWebelement(byFilterProductXpath);
			String ExpectedResultFilterProduct="FILTER BY PRODUCT";
			String ActualResultTitle = getTextOfWebelement(byTitleXpath);
			String ExpectedResultTitle="TITLE";
			String ActualResultPublishDate = getTextOfWebelement(byPublishDateXpath);
			String ExpectedResultPublishDate="PUBLISH DATE";

		if(ActualResultAllPagesText.contains(ExpectedResultAllPagesText) && (ActualResultViewAToZ.contains(ExpectedResultVIEWAZINDEXText)) && 
				(ActualResultFilterProduct.contains(ExpectedResultFilterProduct)) && (ActualResultTitle.contains(ExpectedResultTitle)) && 
				(ActualResultPublishDate.contains(ExpectedResultPublishDate))) {
		        Assert.assertEquals(ActualResultAllPagesText, ExpectedResultAllPagesText);
	            Assert.assertEquals(ActualResultViewAToZ, ExpectedResultVIEWAZINDEXText);
	            Assert.assertEquals(ActualResultFilterProduct, ExpectedResultFilterProduct);
		        Assert.assertEquals(ActualResultTitle, ExpectedResultTitle);
			    Assert.assertEquals(ActualResultPublishDate, ExpectedResultPublishDate);
		        System.out.println("All Verifications Done Successfully");
		}
		else
		{
			System.out.println("Verifications are Un-Successfull");
		}
			
		} catch (Exception e) {
			log.error("Browser All Pages Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@Test (priority = 2, description = "Filter By Product And Filter By Category testing")
	public void testFilterByProductAndFilterByCategory() throws Exception {
		try {
			hardWait(5);
			highlightWebElement(byOperationsXpath);
			List<WebElement> FilterByCategory=driver.findElements(By.xpath("//div[@id='category']//following-sibling::ul//a"));
			System.out.println("Count of Filter By Category :" + FilterByCategory.size());
			int j=1;
			if(FilterByCategory.size()>0) {
				for(int i=0;i<FilterByCategory.size();i++) {	
					
					if(i<=2) {
						i++;
						WebElement FilterByCategorylink= driver.findElement(By.xpath("(//div[@id='category']//following-sibling::ul//a)["+i+"]"));
						click(FilterByCategorylink);
						hardWait(5);
						String ActualResultActText = getTextOfWebelement(FilterByCategorylink);
						WebElement FilterByCategoryTitle= driver.findElement(By.xpath("(//ul[@class='all_pages_list']//li//div//p//a)["+j+"]"));
						String ExpectedResultActText = getTextOfWebelement(FilterByCategoryTitle);
						i--;
						System.out.println("ActualResultTitleText:"+ActualResultActText);
						System.out.println("ExpectedResultTitleText:"+ExpectedResultActText);
						Assert.assertEquals(ActualResultActText, ExpectedResultActText);
					}
							break;		
				}
			}
			hardWait(5);
			
			
			highlightWebElement(byBusinessXpath);
			click(byBusinessXpath);
			hardWait(5);
			if(FilterByCategory.size()>0) {
				for(int i=0;i<FilterByCategory.size();i++) {	
					
					if(i<=2) {
						i++;
						WebElement FilterByCategorylink= driver.findElement(By.xpath("(//div[@id='category']//following-sibling::ul//a)["+i+"]"));
						click(FilterByCategorylink);
						hardWait(5);
						String ActualResultActText = getTextOfWebelement(FilterByCategorylink);
						WebElement FilterByCategoryTitle= driver.findElement(By.xpath("(//ul[@class='all_pages_list']//li//div//p//a)["+j+"]"));
						String ExpectedResultActText = getTextOfWebelement(FilterByCategoryTitle);
						i--;
						System.out.println("ExpectedResultTitleText:"+ActualResultActText);
						System.out.println("ExpectedResultTitleText:"+ExpectedResultActText);
						Assert.assertEquals(ActualResultActText, ExpectedResultActText);
					}
						break;			
				}
			}
			highlightWebElement(byEmployeeExperienceXpath);
			click(byEmployeeExperienceXpath);
			hardWait(10);
			if(FilterByCategory.size()>0) {
				for(int i=0;i<FilterByCategory.size();i++) {	
					
					if(i<=2) {
						i++;
						System.out.println(i);
						WebElement FilterByCategorylink= driver.findElement(By.xpath("(//div[@id='category']//following-sibling::ul//a)["+i+"]"));
						hardWait(10);
						click(byEmployeeExperienceXpath);
						driver.findElement(By.xpath("(//div[@id='category']//following-sibling::ul//a)["+i+"]")).click();
						//click(FilterByCategorylink);
						hardWait(5);
						String ActualResultActText = getTextOfWebelement(FilterByCategorylink);
						WebElement FilterByCategoryTitle= driver.findElement(By.xpath("(//ul[@class='all_pages_list']//li//div//p//a)["+j+"]"));
						String ExpectedResultActText = getTextOfWebelement(FilterByCategoryTitle);
						i--;
						System.out.println("ExpectedResultTitleText:"+ActualResultActText);
						System.out.println("ExpectedResultTitleText:"+ExpectedResultActText);
						Assert.assertEquals(ActualResultActText, ExpectedResultActText);
					}
					break;
				}
			}
									
			highlightWebElement(byPersonalAccountsXpath);
			click(byPersonalAccountsXpath);
			hardWait(5);
			if(FilterByCategory.size()>0) {
				for(int i=0;i<FilterByCategory.size();i++) {	
					
					if(i<=2) {
						i++;
						WebElement FilterByCategorylink= driver.findElement(By.xpath("(//div[@id='category']//following-sibling::ul//a)["+i+"]"));
						click(FilterByCategorylink);
						hardWait(5);
						String ActualResultActText = getTextOfWebelement(FilterByCategorylink);
						WebElement FilterByCategoryTitle= driver.findElement(By.xpath("(//ul[@class='all_pages_list']//li//div//p//a)["+j+"]"));
						String ExpectedResultActText = getTextOfWebelement(FilterByCategoryTitle);
						i--;
						System.out.println("ExpectedResultTitleText:"+ActualResultActText);
						System.out.println("ExpectedResultTitleText:"+ExpectedResultActText);
						Assert.assertEquals(ActualResultActText, ExpectedResultActText);
					}
					break;
				}
			}
						
			highlightWebElement(byServicesXpath);
			click(byServicesXpath);
			hardWait(5);
			
			if(FilterByCategory.size()>0) {
				for(int i=0;i<FilterByCategory.size();i++) {	
					
					if(i<=2) {
						i++;
						WebElement FilterByCategorylink= driver.findElement(By.xpath("(//div[@id='category']//following-sibling::ul//a)["+i+"]"));
						
						hardWait(15);
						click(byServicesXpath);
						driver.findElement(By.xpath("(//div[@id='category']//following-sibling::ul//a)["+i+"]")).click();
						//click(FilterByCategorylink);
						hardWait(10);
//						String ActualResultActText = getTextOfWebelement(FilterByCategorylink);
//						WebElement FilterByCategoryTitle= driver.findElement(By.xpath("(//ul[@class='all_pages_list']//li//div//p//a)["+j+"]"));
//						String ExpectedResultActText = getTextOfWebelement(FilterByCategoryTitle);
//						i--;
//						System.out.println("ExpectedResultTitleText:"+ActualResultActText);
//						System.out.println("ExpectedResultTitleText:"+ExpectedResultActText);
//						Assert.assertEquals(ActualResultActText, ExpectedResultActText);
					}
						break;			
				}
			}					            
    		highlightWebElement(byTechnologyXpath);
			click(byTechnologyXpath);
			hardWait(5);
			if(FilterByCategory.size()>0) {
				for(int i=0;i<FilterByCategory.size();i++) {	
					
					if(i<=2) {
						i++;
						WebElement FilterByCategorylink= driver.findElement(By.xpath("(//div[@id='category']//following-sibling::ul//a)["+i+"]"));
						click(FilterByCategorylink);
						hardWait(5);
						String ActualResultActText = getTextOfWebelement(FilterByCategorylink);
						WebElement FilterByCategoryTitle= driver.findElement(By.xpath("(//ul[@class='all_pages_list']//li//div//p//a)["+j+"]"));
						String ExpectedResultActText = getTextOfWebelement(FilterByCategoryTitle);
						i--;
						System.out.println("ExpectedResultTitleText:"+ActualResultActText);
						System.out.println("ExpectedResultTitleText:"+ExpectedResultActText);
						Assert.assertEquals(ActualResultActText, ExpectedResultActText);
					}
						break;			
				}
			}
			
			
						
		} catch (Exception e) {
			log.error("Filter By Product And Filter By Category testing Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@Test (priority = 3, description = "View A To Z testing- selecting given pages")
	public void testViewAtoZ() throws Exception {
		try {
			hardWait(5);
			highlightWebElement(byClickVIEWAToZXpath);
			click(byClickVIEWAToZXpath);
			hardWait(8);
			List<WebElement> ViewAtoZ=driver.findElements(By.xpath("//div[@id='rn_A_ZIndex_2']//ul[@class='indexing_list']//li//a"));
			System.out.println("Count" +ViewAtoZ.size());
			highlightWebElement(byIndexCountXpath);
			hardWait(5);
			WebElement AToDAlpha= driver.findElement(By.xpath("//div[@id='rn_A_ZIndex_2']//ul[@class='indexing_list']//li//a[text()='D']"));
			highlightWebElement(AToDAlpha);
			click(AToDAlpha);
			hardWait(5);
			highlightWebElement(byIndexCountXpath);
			WebElement AToJAlpha= driver.findElement(By.xpath("//div[@id='rn_A_ZIndex_2']//ul[@class='indexing_list']//li//a[text()='J']"));
			highlightWebElement(AToJAlpha);
			click(AToJAlpha);
			hardWait(5);
			highlightWebElement(byIndexCountXpath);
			WebElement AToPAlpha= driver.findElement(By.xpath("//div[@id='rn_A_ZIndex_2']//ul[@class='indexing_list']//li//a[text()='P']"));
			highlightWebElement(AToPAlpha);
			click(AToPAlpha);
			hardWait(5);
			highlightWebElement(byIndexCountXpath);
			WebElement AToVAlpha= driver.findElement(By.xpath("//div[@id='rn_A_ZIndex_2']//ul[@class='indexing_list']//li//a[text()='V']"));
			highlightWebElement(AToVAlpha);
			click(AToVAlpha);
			hardWait(5);
			highlightWebElement(byIndexCountXpath);
			WebElement AToZAlpha= driver.findElement(By.xpath("//div[@id='rn_A_ZIndex_2']//ul[@class='indexing_list']//li//a[text()='0-9']"));
			highlightWebElement(AToZAlpha);
			click(AToZAlpha);
			hardWait(5);
			highlightWebElement(byIndexCountXpath);
			hardWait(3);
			highlightWebElement(byHighlightArticleXpath);
			click(byHighlightArticleXpath);
			hardWait(10);
			driver.navigate().back();
		} catch (Exception e) {
			log.error("View A to Z Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	/*@Test (priority = 3, description = "View A To Z testing - selecting all the pages")
	public void testViewAtoZ() throws Exception {
		try {
			hardWait(5);
			click(byClickVIEWAToZXpath);
			hardWait(5);
			List<WebElement> ViewAtoZ=driver.findElements(By.xpath("//div[@id='rn_A_ZIndex_2']//ul[@class='indexing_list']//li//a"));
			System.out.println("Count" +ViewAtoZ.size());
			int j=2;
			for(int i=0;i<ViewAtoZ.size();i++) {	
				
				if(i==0) {
					hardWait(3);
					highlightWebElement(byIndexCountXpath);
				}
				if(i<=25) {
					WebElement AToZAlpha= driver.findElement(By.xpath("(//div[@id='rn_A_ZIndex_2']//ul[@class='indexing_list']//li//a)["+j+"]"));
					click(AToZAlpha);
					hardWait(5);
					highlightWebElement(byIndexCountXpath);
				}
				j=j+1;				
			}
		} catch (Exception e) {
			log.error("View A to Z - selecting all the pages Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}*/
	@Test (priority = 4, description = "Verify KeyWords Testing")
	public void testVerifyKeyWords() throws Exception {
		try {
		
			hardWait(5);
			highlightWebElement(bySearchColumnXpath);
			enterText(bySearchColumnINputXpath,bygetsearchkeyword_search);
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
			hardWait(8);
			highlightWebElement(byTotalResultCountXpath);
			driver.navigate().back();
			hardWait(10);
			highlightWebElement(byClickBrowseAllAPagesXpath);
			click(byClickBrowseAllAPagesXpath);
			hardWait(5);
			//click(byClickKnowledgeCenterXpath);
			
			
		} catch (Exception e) {
			log.error("Verify KeyWords Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@AfterClass
	public void testSignout() throws Exception {
		try {
			hardWait(3);
			closeCurrentBrowser();
			} catch (Exception e) {
			log.error("Logout/SignOut un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
}
