package com.MACU.BUI;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnswerVotingFeedbackReport extends AnswerVotingFeedBackReport_POM{

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
	public void testSearchanArticle() throws Exception {
		try {
			hardWait(2);
			click(bySearchArticleTextBox);
			enterText(bySearchArticleTextBox, byArticle);
			click(bySearchArticleTextBox);
			click(bySearchedArticleResult);
			hardWait(2);
			click(bySelectSearchedArticle);
			hardWait(10);
		} catch (Exception e) {
			log.error("Search an Article in CP is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
@Test(priority = 2, groups = {"Sanity","Regression"}, description = "Thumbs Up & Down")
	
	public void testFeedbackPage() throws Exception {
	
		try {
			scrollToWebElement(bySearchfield);
			highlightWebElement(bythumbsDown);
			hardWait(1);
			click(bythumbsDown);
			hardWait(3);
			//scrollToWebElement(byscrollDownThumbComments);
			hardWait(3);
			click(bythumbsDownComments);
			enterText(bythumbsDownComments, byThumbsDownComments);
			click(bythumbsDownCommentsSubmit);
			click(bythumbsDownCommentsClosePopUp);
			
		} catch (Exception e) {
			log.error("Thumbs Up & Down Test is un-successfull");
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
			hardWait(5);
			highlightWebElement(byFeedbackThumbDownResult);
			highlightWebElement(byFeedbackStatuscp);
			String Status1 = getTextOfWebelement(byFeedbackStatuscp);
			System.out.println(Status1.toLowerCase());
			click(byFeedbackThumbDownResult);
			hardWait(2);			
			highlightWebElement(byFeedbackArticle);
			String FeedbackArticle = getTextOfWebelement(byFeedbackArticle);
			System.out.println(FeedbackArticle);
			highlightWebElement(byFeedbackArticleStatus);
			highlightWebElement(bythumbDownCreatedDateAndTime);
			AnswerVotingSubjectCreatedDateAndTimeinCP = getTextOfWebelement(bythumbDownGetCreatedDateAndTime);
			System.out.println(Status1.toLowerCase()+" Create Date And Time Equals To "+AnswerVotingSubjectCreatedDateAndTimeinCP);
			AnswerVotingSubjectinCP =  getTextOfWebelement(byFeedbackArticle);
			System.out.println(Status1.toLowerCase()+" Subject Equals To "+AnswerVotingSubjectinCP);
			System.out.println(AnswerVotingSubjectCreatedDateAndTimeinCP+" "+AnswerVotingSubjectinCP);
		 	click(byHomePage);
		    hardWait(2);
		    closeCurrentBrowser();
		}
		catch (Exception e) {
			log.error("My Feedback Article Status in CP Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}	
@Test (priority = 4, groups = {"Sanity","Regression"}, description = "Navigate To Anwser Voting FeedBackReport testing")
public void testNavigateToAnwserVotingFeedBackReportlow() throws Exception {
	try {
		openBrowser();
		Thread.sleep(5000);
		signIntoBUI();
		hardWait(50);
//		click(byClickCloseActionCenterXpath);
//		hardWait(2);
		//click(byHomeNavigationXpath);
		click(byNavigationButton);
		hardWait(2);
		click(byClickAnalyticsXpath);
		click(byClickReportsExplorerXpath);
		hardWait(2);
		click(byClickPublicReportsXpath);
		click(byClickMACUCUSTOMREPORTSXpath);
		click(byClickSoftCloudsXpath);
		click(byClickOKCSXpath);
		click(byClickArchivedXpath);
		hardWait(6);
		
	} catch (Exception e) {
		log.error("Navigate To Anwser Voting FeedBackReport testing un-successfull");
		e.printStackTrace();
		throw e;
	}
}
@Test (priority = 5, groups = {"Sanity","Regression"}, description = "Selecting and Giving Answers to Report- testing")
public void testSelectingandGivingAnswerstoReportFlow() throws Exception {
	try {	
		highlightWebElement(byFeedbackReport);
		doubleClick(byFeedbackReport);
		hardWait(5);
		highlightWebElement(bySelectanItemDropdown);
		click(bySelectanItemDropdown);
		moveToThenClick(bySelectOptionfromDropdown);
	//	click(bySendDate);
		//clearTextBox(bySendDate);
		//enterText(bySendDate, FeedbackReportSendDate);				
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
		log.error("Selecting and Giving Asnwers to Report  un-successfull");
		e.printStackTrace();
		throw e;
	}
}
    @AfterClass
	public void testSignout() throws Exception {
	try {
		hardWait(3);
		click(byClickUserProfileXpath);
		hardWait(2);
		click(byClickUserProfileSignOutXpath);
		hardWait(5);
	   closeCurrentBrowser();
		} catch (Exception e) {
		log.error("Logout/SignOut un-successfull");
		e.printStackTrace();
		throw e;
		}
	}
	
}
