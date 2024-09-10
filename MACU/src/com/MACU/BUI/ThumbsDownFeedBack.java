package com.MACU.BUI;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ThumbsDownFeedBack extends ThumbsDownFeedBack_POM{

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
	


	@Test(priority = 1, groups = {"Sanity","Regression"}, description = "My Feedback- Jump to section")
	
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
		} catch (Exception e) {
			log.error("Jump to section Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
@Test(priority = 2, groups = {"Sanity","Regression"}, description = "My Feedback - Request Updates, Comments, Thumbs Up & Down")
	
	public void testFeedbackPage() throws Exception {
	
		try {
			//highlightWebElement(bythumbsUp);
			//click(bythumbsUp);
			//highlightWebElement(bythumbsDown);
			hardWait(2);
			click(bythumbsDown);
			hardWait(3);
			Set d=driver.getWindowHandles();
			System.out.println(d);
			scrollToWebElement(byScrollTellusMore);
			hardWait(5);
			WebElement frame1=driver.findElement(by.xpath("//iframe[@title='Action Capture']"));
			//driver.switchTo().frame(frame1);
			//click(bythumbsDownCommentsSubmit);
			click(bythumbsDownCommentsNew);
			hardWait(2);
			enterText(bythumbsDownCommentsNew, byThumbsDownComments);
			click(bythumbsDownCommentsSubmit);
			click(bythumbsDownCommentsClose);
			
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

@Test (priority = 4, groups = {"Sanity","Regression"}, description = "Navigate To ThumbsDown FeedBack Report testing")
public void testNavigateToThumbsDownFeedBackReportFlow() throws Exception {
try {    
		openBrowser();
		signIntoBUI();
		hardWait(35);
		click(byNavigationButton);
		hardWait(6);
		click(byClickAnalyticsXpath);
		hardWait(6);
		click(byClickReportsExplorerXpath);
		hardWait(6);
		click(byClickPublicReportsXpath);
		hardWait(6);
		click(byClickMACUCUSTOMREPORTSXpath);
		hardWait(6);
		click(byClickSoftCloudsXpath);
		hardWait(6);
		click(byClickOKCSXpath);
		hardWait(6);
		
	} catch (Exception e) {
		log.error("Navigate To ThumbsDown FeedBack Report Test is un-successfull");
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
		hardWait(3);
		click(byMessageText);
		hardWait(3);
		try {
			highlightWebElement(byCKENotification);
			click(byCKENotificationClose);
		}
		catch(Exception e){
			
		}
		
		click(byReplayText);
		hardWait(3);
		enterText(byReplayText, bygetReplayForFeedBack);
		hardWait(3);
		click(bySaveText);
		hardWait(3);
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
		log.error("Selecting and Giving Answers to Report Test  is  un-successfull");
		e.printStackTrace();
		throw e;
	}
}
@AfterClass
public void testBUISignout() throws Exception {
	try {
		
		hardWait(5);
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
