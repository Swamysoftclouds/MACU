package com.MACU.CP;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyFeedback extends MyFeedback_POM{

	@BeforeClass
	public void testSignIn() throws Exception {
		try {

			openBrowser();
			signIntoCP();
			Thread.sleep(4000);

		} catch (Exception e) {
			log.error("Login/SignIn un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	
	@Test(priority = 1, description = "My Feedback- Jump to section")
	
	public void testJumpToSection() throws Exception {
	
		try {
			
			hardWait(2);
			click(bySearchArticleTextBox);
			enterText(bySearchArticleTextBox, byArticle);
			highlightWebElement(bySearchedArticleResult);
			click(bySearchedArticleResult);
			hardWait(2);
			click(bySelectSearchedArticle);
			hardWait(4);
			//highlightWebElement(byJumpToSection);
		//	String JumpToArticle = getTextOfWebelement(byJumpToArticle);
		//	System.out.println(JumpToArticle);
			//highlightWebElement(byJumpToArticle);
		//	click(byJumpToArticle);
//			hardWait(2);
//			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(1));
//			hardWait(2);
//			highlightWebElement(byJumpToSelectedArticle);
//			String JumpToSelectedArticle = getTextOfWebelement(byJumpToSelectedArticle);
//			System.out.println(JumpToSelectedArticle);
//			System.out.println("Selected Article- "+ JumpToArticle +"  Assert Opened Article- "+ JumpToSelectedArticle);
//		    driver.close();
//		    driver.switchTo().window(tabs2.get(0));	
			//hardWait(4);
		} catch (Exception e) {
			log.error("Jump to section Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
@Test(priority = 2, description = "My Feedback - Request Updates, Comments, Thumbs Up & Down")
	
	public void testFeedbackPage() throws Exception {
	
		try {
			highlightWebElement(bythumbsUp);
//			click(bythumbsUp);
			highlightWebElement(bythumbsDown);
			hardWait(1);
			//highlightWebElement(byRelatedPages);
			click(byRelatedPages);
			hardWait(1);
			click(byRelatedPages);
			highlightWebElement(bySearchPageLevel);
			click(bySearchPageLevel);
			enterText(bySearchPageLevel, byArticle);
			hardWait(3);
			click(bySelectSearchPageLevel);
			hardWait(3);
			click(bySelectSearchedArticle);
			hardWait(3);
			scrollToWebElement(byRequestsUpdatesComments);
			highlightWebElement(byRequestsUpdatesComments);
			click(byRequestsUpdatesComments);
			//click(byHelpUsImprove);
			enterText(byHelpUsImproveSescription, byHelpUsImproveComments);
			click(byHelpUsImproveSubmit);
//			click(byHelpUsImproveClosePopUp);
			hardWait(2);
			highlightWebElement(byHelpUsImproveSubmitClosePopUp);
			click(byHelpUsImproveSubmitClosePopUp);
			hardWait(2);
			scrollToWebElement(byHomePage);
			click(byHomePage);
		} catch (Exception e) {
			log.error("Request Updates, Comments, Thumbs Up & Down Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	
@Test(priority = 3, description = "My Feedback - My Feedback Article Status in CP")

public void testMyFeedbackStatus() throws Exception {

	try {
			
		
		hardWait(2);
		click(byQuickNavMenuButton);
		click(byMyFeedbackButton);			
		enterText(bySearchFeedbackTextBox, byArticle);
		hardWait(3);
		highlightWebElement(bySearchIcon);
		click(bySearchIcon);
        hardWait(5);
		highlightWebElement(byFeedbackResult);
		highlightWebElement(byFeedbackStatus1);
		click(byFeedbackResult);
		hardWait(5);
		highlightWebElement(byFeedbackArticle);
		highlightWebElement(byFeedbackArticleStatus);
		highlightWebElement(bythumbDownCreatedDateAndTime);
		AnswerVotingSubjectCreatedDateAndTimeinCP = getTextOfWebelement(bythumbDownGetCreatedDateAndTime);
		System.out.println(" Create Date And Time Equals To :  "+AnswerVotingSubjectCreatedDateAndTimeinCP);
		AnswerVotingSubjectinCP =  getTextOfWebelement(byFeedbackArticle);
		System.out.println(" Subject Equals To :  "+AnswerVotingSubjectinCP);
		System.out.println(AnswerVotingSubjectCreatedDateAndTimeinCP +"   "+ AnswerVotingSubjectinCP);
		click(byHomePage);
			
//			softAssert.assertEquals("STUDENT RISK ANALYSIS", actualHeader,"FAILED AT STUDENT RISK ANALYSIS");
//			log.info("Student Risk Analysis Done");
//			assertActualAndExpectedText(byUserActivityTableRoleNameClass, "Advisor");
//			Assert.assertEquals(scoreToBeValidated, getTextOfWebelement(byRiskProfileValueTextCssSelector));
//			assertTrue(isWebElementDisplayed(bySaveButtonXpath));
			
		}
		catch (Exception e) {
			log.error("My Feedback Article Status in CP Test is un-successfull");
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
