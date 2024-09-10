package com.MACU.BUI;

import java.io.File;
import java.util.List;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionsDashboardReport extends ActionsDashboardReport_POM{
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
	public void testOKCSReports() throws Exception {
		try {
			hardWait(60);
			click(byNavigationButton);
			click(byAnalytics);
			hardWait(2);
			highlightWebElement(byAnalyticsReports);
			click(byAnalyticsReports);
			hardWait(4);
			highlightWebElement(byPubicReports);
			click(byPubicReports);
			click(byMACUCustomReports);
			click(bySoftCloudsReports);
			click(byOKCSReports);
			hardWait(2);

		} catch (Exception e) {
			log.error("Selecting OKCS Reports in BUI Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@Test(priority = 2, groups = {"Sanity","Regression"}, description = "BUI - Select Actions Report")
	public void testVisitorActionsDashboard() throws Exception {
		try {
            // Below code is for List of Reports in OKCS and selecting Visitor Actions(Dashboard) Report
			hardWait(5);
			List<WebElement> ReportsNames=driver.findElements(By.xpath("//div[@class='oj-datagrid-scroller']//span[contains(@title,'Name')]"));
	         System.out.println("Name's List :  "+ReportsNames.size());
	         for(int m=1;m<ReportsNames.size();m++) {
	        	 String ReportName=ReportsNames.get(m).getText();
	        	 System.out.println(ReportName);
	        	 hardWait(0);
	        	 
	        	// scrollToWebElement(ReportsNames.get(m));
	        	 
	        	 
	        	 //if(ReportName.equals("Pages Owned by User Group")) {
	        	 if(m==27) {
	        		 scrollToWebElement(ReportsNames.get(m));
	        		 List<WebElement> ReportsNames1=driver.findElements(By.xpath("//div[@class='oj-datagrid-scroller']//span[contains(@title,'Name')]"));
	    	         System.out.println("Name's List1 :  "+ReportsNames1.size());
	    	         for(int n=0;n<ReportsNames1.size();n++) {
	    	        	 String ReportName1=ReportsNames1.get(n).getText();
	    	        	
	    	        	
	    	        	 if(ReportName1.equals("Request Change Status Chart")) {	
	    	        		 System.out.println("Name's  :  "+ReportName1);
	    	        		 
	    	        		  
	    	        		 webElement  = driver.findElement(byRequestChangeStatusChartReport);
	    	        		
	    	        		 Actions a=new Actions(driver);
	    	        		 a.doubleClick(webElement).build().perform();
	    	        		 hardWait(3);
	    	        		 click(bySearchButton);
	    	        		 hardWait(5);
	    	        		 break;
	    	        	 }
	    	         }
	        	 }
	         }
	         
			hardWait(2);
			click(byActionsDashBoard);
			hardWait(5);
			click(byReportingCloseXpath);
			
		} catch (Exception e) {
			log.error("Select Actions Report in BUI Test is un-successfull");
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
