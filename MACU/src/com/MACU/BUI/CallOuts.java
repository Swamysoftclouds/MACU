package com.MACU.BUI;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CallOuts extends CallOuts_POM{
	String AnswerID= null;
	@BeforeClass
	public void testSignIn() throws Exception {
		try {
			openBrowser();
			signIntoBUI();
			Thread.sleep(4000);
			
			
		} catch (Exception e) {
			log.error("Login/SignIn un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@Test(priority = 1, description = "Select Existing Customer Account")
	public void testExistingAccount() throws Exception {
		try {
			hardWait(25);
			click(byNavigationButtonID);
			hardWait(2);
			click(byConfigurationXpath);
			click(byClickServiceButtonXpath);
			//click(byClickServiceButtonXpath);
			click(byClickKnowledgeAdvancedButtonXpath);
			click(byAuthoringXpath);
			hardWait(5);
			driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='tabContent']//iframe")));
			highlightWebElement(byAuthoringPageXpath);	
			clickUsingActions(byContentTabXpath);
			hardWait(3);
			click(byAddArticle);
			hardWait(3);
			click(byAddSummary);
			enterText(byAddSummary, AddSummary);
			click(byAddKeyword);
			enterText(byAddKeyword, AddKeyword);		
			hardWait(2);
			//scrollToWebElement(byContactInfoSourceButton);
			
//-------------Basic Content				
			scrollToWebElement(byBasicContactInfoButton);
			hardWait(2);
			click(byBasicContentInfoSourceButton);		
			click(byBasicContentInfoHTMLText);
			hardWait(3);
			enterText(byBasicContentInfoHTMLText, bygetcallouts);
			/*File file =    new File("./resources/HTML_Input/Callouts_HtmlText.xlsx");
			FileInputStream fs = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			
			//XSSFSheet sheet = workbook.getSheetAt(0);
			
//---------Basic Content Section		
			Row row1 = sheet.getRow(1);
			Cell cell1 = row1.getCell(1);						
			String basicContactcellval = cell1.getStringCellValue();			
			hardWait(2);
			enterText(byBasicContentInfoHTMLText, basicContactcellval);*/
			click(byBasicContentInfoSourceButton);
			
//-------------	
			hardWait(2);
			scrollToWebElement(byRepositorySelection);
			click(byMacuCheckbox);
			hardWait(2);
			scrollToWebElement(byPublishingOptions);
			hardWait(2);
			highlightWebElement(bySaveDocument);
			click(bySaveDocument);
			hardWait(5);
			scrollToWebElement(byWorkFlowSection);
			click(byApprove);
			hardWait(5);
			scrollToWebElement(byWorkFlowSection);
			click(byApprove);
			hardWait(5);
			scrollToWebElement(byWorkFlowSection);
			click(byApprove);
			hardWait(3);						
			AnswerID = driver.findElement(By.xpath("//span[text()='Answer ID']//parent::td//following-sibling::td/span")).getText();
			System.out.println(AnswerID);
			closeCurrentBrowser();
			
		} catch (Exception e) {
			log.error("Login/SignIn un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@Test(priority = 2, description = "Select Existing Customer Account")
	public void testCPCallouts() throws Exception {
		try {
			hardWait(3);

			openBrowser();
			signIntoCP();
			Thread.sleep(15000);
			System.out.println(AnswerID);
			driver.get("https://macu1--tst1.custhelp.com/app/answers/macu_view/a_id/"+AnswerID);
//			click(bySearchArticleTextBox);
//			enterText(bySearchArticleTextBox, "Test Technology through Automation 2");
			scrollToWebElement(byContent);
			highlightWebElement(byNote);
			scrollToWebElement(byNote);
			highlightWebElement(byTip);
			highlightWebElement(byUpdated);
			highlightWebElement(byVideo);
			
		} catch (Exception e) {
			log.error("Login/SignIn un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@AfterClass
	public void testCloseCallOuts() throws Exception {
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
		

