package com.MACU.BUI;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ModifyArticleFlow extends ModifyArticleFlow_POM{
	@BeforeClass
	public void testSignIn() throws Exception {
		try {
			openBrowser();
			signIntoBUI();
			
		} catch (Exception e) {
			log.error("Login/SignIn un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@Test (priority = 1, groups = {"Sanity","Regression"}, description = "Navigate To Article testing")
	public void testNavigateToArticleFlow() throws Exception {
		try {
			hardWait(30);
			click(byNavigationButton);
			hardWait(3);
			click(byConfigurationXpath);
			click(byClickServiceButtonXpath);
			//click(byClickServiceButtonXpath);
			click(byClickKnowledgeAdvancedButtonXpath);
			click(byClickAuthoringButtonXpath);
			hardWait(6);
			
		} catch (Exception e) {
			log.error("Navigate To Article un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@Test (priority = 2, groups = {"Sanity","Regression"}, description = "Edit Article testing")
	public void testEditArticleFlow() throws Exception {
		try {	
			WebElement  frame=driver.findElement(By.xpath("//iframe[@data-bind='attr: { src: frameUrl}']"));
			driver.switchTo().frame(frame);
			hardWait(2);
			click(byClickMainContentButtonXpath);
			hardWait(2);
			click(byClickListArticleButtonXpath);
			hardWait(2);
			click(byClickAllDocumentsXpath);
			click(bySelectAllDocumentsXpath);
			hardWait(2);
			click(bySelectArticleXpath);
			hardWait(6);
			click(byClickEditDocumentXpath);
			hardWait(5);
			enterText(byEnterTitleNameFieldXpath,bygetEditTitle);
			hardWait(2);
			scrollToWebElement(byScrollPublishingOptionsXpath);
			hardWait(2);
			enterText(byClickEditReasonXpath,bygetEditReason);
			click(byClickSaveandContinueEditingXpath);
			hardWait(5);
			enterText(byEnterKeyWordNameFieldXpath,bygetEditkeywords);
			hardWait(2);
			scrollToWebElement(byScrollPublishingOptionsXpath);
			hardWait(2);
			enterText(byClickEditReasonXpath,bygetEditReason);
			click(bySaveDocumentXpath);
			hardWait(5);
			DocumentIDinCP =getTextOfWebelement(byGettheDocumentIDXpath);
			ArticleTitle =getTextOfWebelement(byGettheTitleXpath);
				
			System.out.println(ArticleTitle + " "+DocumentIDinCP);
			click(byClickByPassWorkFlowXpath);
			hardWait(5);
			click(byClickDoneButtonXpath);
			hardWait(5);
			driver.switchTo().parentFrame();
			//click(byClickCloseButtonXpath);
			click(byReportingCloseXpath);
			
			hardWait(3);
			click(byClickUserProfileXpath);
			hardWait(2);
			click(byClickUserProfileSignOutXpath);
			hardWait(5);
	 		closeCurrentBrowser();
			} catch (Exception e) {
			log.error("Edit Article  un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	
	@Test(priority = 3, groups = {"Sanity","Regression"}, description = "Search an Article in CP")
	public void testSearchanArticle() throws Exception {
		try {
			openBrowser();
			signIntoCP();
			hardWait(6);
			System.out.println(DocumentIDinCP);
			driver.get("https://macu1--tst1.custhelp.com/app/answers/macu_view/a_id/"+DocumentIDinCP);
			hardWait(5);
			highlightWebElement(byEditedTileTitle);
			String DocumentsTitle=getTextOfWebelement(byEditedTileTitle);
			System.out.println(DocumentsTitle + " "+ArticleTitle);
			Assert.assertEquals(DocumentsTitle, ArticleTitle);
		} catch (Exception e) {
			log.error("Search an Article in CP is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	 @AfterClass
		public void testCloseBrowser() throws Exception {
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
