package com.MACU.BUI;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SchedulerJobs extends SchedulerJobs_POM{
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
	@Test(priority = 1, groups = {"Sanity","Regression"}, description = "BUI - Select Scheduling Reports")
	public void testSchedulingReports() throws Exception {
		try {
			hardWait(5);
			click(byNavigationButton);
			click(byClickAnalyticsXpath);
//			hardWait(2);
			highlightWebElement(byAnalyticsReports);
			click(byAnalyticsReports);
			hardWait(2);
			highlightWebElement(byPubicReports);
			click(byPubicReports);
			click(byMACUCustomReports);
			click(bySoftCloudsReports);
			click(bySchedulingReports);
			hardWait(1);
			highlightWebElement(byBrowseScheduleReports);
			hardWait(1);
		    click(byReportingCloseXpath);
		} catch (Exception e) {
			log.error("Selecting Scheduling Reports Test is un-successfull");
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
			hardWait(1);
		    closeCurrentBrowser();
			} catch (Exception e) {
			log.error("Logout/SignOut un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
}
