package com.MACU.BUI;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FeedbackAdmin extends FeedbackAdmin_POM{

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
	@Test(priority = 1, groups = {"Sanity","Regression"}, description = "Search an Article in CP")
	
	public void testSearchanArticleSection() throws Exception {
	
		try {
			
			hardWait(2);
			click(bySearchArticleTextBox);
			enterText(bySearchArticleTextBox, byArticle);
			click(bySearchArticleTextBox);
			highlightWebElement(bySearchedArticleResult);
			hardWait(2);
			click(bySearchedArticleResult);
			hardWait(5);
			click(bySelectSearchedArticle);
			hardWait(4);
			
		} catch (Exception e) {
			log.error("Jump to section Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
@Test(priority = 2, groups = {"Sanity","Regression"}, description = "Thumbs Up & Down")
	
	public void testFeedbackPage() throws Exception {
	
		try {
			hardWait(3);
			/*scrollToWebElement(byscrollDownThumbComments);
			hardWait(5);
			click(bythumbsDownComments);
			enterText(bythumbsDownComments, byThumbsDownComments);
			click(bythumbsDownCommentsSubmit);
			click(bythumbsDownCommentsClosePopUp);*/
			
			scrollToWebElement(byRequestsUpdatesComments);
			hardWait(5);
			highlightWebElement(byRequestsUpdatesComments);
			click(byRequestsUpdatesComments);
			//click(byHelpUsImprove);
//			enterText(byHelpUsImprove, "Test Feedback given in article which is updated in the My Feedback Recent");
			enterText(byHelpUsImprove, byHelpUsImproveComments);
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
@Test(priority = 3, groups = {"Sanity","Regression"}, description = "My Feedback - My Feedback Article Status in CP")

public void testMyFeedbackStatus() throws Exception {
	

	try {
			hardWait(2);
			click(byQuickNavMenuButton);
			click(byMyFeedbackButton);			
			enterText(bySearchFeedbackTextBox, byAgetSearchArticle);
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
			hardWait(5);
			closeCurrentBrowser();
		}
		catch (Exception e) {
			log.error("My Feedback Article Status in CP Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}	
@Test (priority = 4, groups = {"Sanity","Regression"}, description = "Navigate To FeedBackAdmin Report-testing")
public void testNavigateToFeedBackAdminReportFlow() throws Exception {
	try {
		openBrowser();
		Thread.sleep(5000);
		signIntoBUI();
		hardWait(60);
		//click(byClickCloseActionCenterXpath);
		//hardWait(2);
		click(byNavigationButton);
		click(byClickAnalyticsXpath);
		click(byClickReportsExplorerXpath);
		click(byClickPublicReportsXpath);
		click(byClickMACUCUSTOMREPORTSXpath);
		click(byClickSoftCloudsXpath);
		click(byClickOKCSXpath);
		hardWait(6);
		
	} catch (Exception e) {
		log.error("Navigate To Article un-successfull");
		e.printStackTrace();
		throw e;
	}
}
@Test (priority = 5, groups = {"Sanity","Regression"}, description = "Selecting and Giving Asnwers to Report-testing")
public void testSelectingandGivingAsnwerstoReportFlow() throws Exception {
	try {	
		highlightWebElement(byFeedbackReport);
		doubleClick(byFeedbackReport);
		hardWait(5);
		highlightWebElement(bySelectanItemDropdown);
		click(bySelectanItemDropdown);
		moveToThenClick(bySelectOptionfromDropdown);
		click(byFeedbackReportSearch1Button);
		hardWait(3);			
		highlightWebElement(byFeedbackSearchResult);
		String FeedbackResult = getTextOfWebelement(byFeedbackSearchResult);
		System.out.println(FeedbackResult);
		doubleClick(byFeedbackSearchResult);
		hardWait(3);
		highlightWebElement(bySubjectText);
		click(byMessageText);
		click(byReplayText);
		enterText(byReplayText, bygetReplayForFeedBack);
		click(bySaveText);
		click(bySummaryOption);
		
		
		highlightWebElement(byFeedbackStatus);
		FeedbackArticleStatusinBUI = getTextOfWebelement(byFeedbackStatus);
		System.out.println(FeedbackArticleStatusinBUI);
		hardWait(1);
		clickUsingActions(byFeedbackStatus);
		hardWait(2);
        click(byClickStatusSelectSolvedXpath);
        hardWait(2);
        click(byClickSaveButtonXpath);
        hardWait(2);
        
        hardWait(2);
		System.out.println("CP Article Status is - " + FeedbackArticleStatusinCP  + " BUI Article Status is - " + FeedbackArticleStatusinBUI);
		click(byCloseIncidentXpath);
		 hardWait(2);
		 click(byAnswerVotingCloseXpath); 
		    hardWait(2);
		    click(byReportingCloseXpath);
	
			
		} catch (Exception e) {
		log.error("Selecting and Giving Asnwers to Report- un-successfull");
		e.printStackTrace();
		throw e;
	}
}

@AfterClass
public void testSignout() throws Exception {
	try {
		
		hardWait(10);
		click(byClickUserProfileXpath);
		hardWait(2);
		click(byClickUserProfileSignOutXpath);
		hardWait(5);
		click(byClickAppClickHereXpath);
		hardWait(3);
		closeCurrentBrowser();
		} catch (Exception e) {
		log.error("Logout/SignOut un-successfull");
		e.printStackTrace();
		throw e;
	}
}
	
}
