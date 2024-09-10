package com.MACU.BUI;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FeedbackReport extends FeedbackReport_POM{
	
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
	@Test(priority = 1, groups = {"Sanity","Regression"}, description = "BUI - Select OKCS Reports")
	public void testSelectOKCSReport() throws Exception {
		try {
			
			hardWait(35);
			click(byNavigationButton);
			hardWait(4);
			click(byClickAnalyticsXpath);
			click(byClickReportsExplorerXpath);
			hardWait(3);
			click(byClickPublicReportsXpath);
			click(byClickMACUCUSTOMREPORTSXpath);
			click(byClickSoftCloudsXpath);
			click(byClickOKCSXpath);
			hardWait(2);
		} catch (Exception e) {
			log.error("Selecting OKCS Reports in BUI Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@Test(priority = 2, groups = {"Sanity","Regression"}, description = "BUI - Feedback Status")
	public void testFeedbackStatus() throws Exception {
		try {
			highlightWebElement(byFeedbackReport);
			doubleClick(byFeedbackReport);
			hardWait(2);
			highlightWebElement(bySelectanItemDropdown);
			click(bySelectanItemDropdown);
			moveToThenClick(bySelectOptionfromDropdown);
			hardWait(15);	
			click(byFeedbackReportSearch1Button);
			hardWait(3);			
			highlightWebElement(byFeedbackSearchResult);
			String FeedbackResult = getTextOfWebelement(byFeedbackSearchResult);
			System.out.println(FeedbackResult);
			doubleClick(byFeedbackSearchResult);
			hardWait(1);
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
			hardWait(1);
	        click(byClickStatusSelectSolvedXpath);
	        hardWait(1);
	        click(byClickSaveButtonXpath);
	        hardWait(1);
	        
	        hardWait(1);
			System.out.println("CP Article Status is - " + FeedbackArticleStatusinCP  + " BUI Article Status is - " + FeedbackArticleStatusinBUI);
			click(byCloseIncidentXpath);
			 hardWait(1);
			 click(byAnswerVotingCloseXpath); 
			    hardWait(1);
			    click(byReportingCloseXpath);
		}
		catch (Exception e) {
			log.error("Feedback Status in BUI Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	
	@AfterClass
	public void testSignout() throws Exception {
		try {
			hardWait(1);
			click(byClickUserProfileXpath);
			hardWait(1);
			click(byClickUserProfileSignOutXpath);
			hardWait(2);
		   closeCurrentBrowser();
			} catch (Exception e) {
			log.error("Logout/SignOut un-successfull");
			e.printStackTrace();
			throw e;
			
		}
	}
}
