package com.MACU.BUI;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ThumbsUpAndThumbsDownFeedback extends ThumbsUpAndThumbsDownFeedBack_POM{
	@BeforeClass
	public void testSignIn() throws Exception {
		try {
			openBrowser();
			signIntoBUI();
			hardWait(5);
		} catch (Exception e) {
			log.error("Login/SignIn un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@Test (priority = 1, groups = {"Sanity","Regression"}, description = "Navigate To ThumbsUp_And_ThumbsDown_Feedback testing")
	public void testThumbsUpAndThumbsDownFeedbackFlow() throws Exception {
		try {
			hardWait(15);
			click(byNavigationButtonID);
			click(byClickAnalyticsXpath);
			click(byClickReportsExplorerXpath);
			hardWait(5);
			click(byClickPublicReportsXpath);
			click(byClickMACUCUSTOMREPORTSXpath);
			click(byClickSoftCloudsXpath);
			click(byClickOKCSXpath);
			hardWait(3);
			
		} catch (Exception e) {
			log.error("Navigate To ThumbsUp_And_ThumbsDown_Feedback Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@Test (priority = 2, groups = {"Sanity","Regression"}, description = "Selecting and Verifying testing")
	public void testSelectingandVerifyingFlow() throws Exception {
		try {	
			     List<WebElement> ReportsNames=driver.findElements(By.xpath("//div[@class='oj-datagrid-scroller']//span[contains(@title,'Name')]"));
		         System.out.println("Name's List :  "+ReportsNames.size());
		         for(int m=0;m<ReportsNames.size();m++) {
		        	 String ReportName=ReportsNames.get(m).getText();
		        	 System.out.println("Name's  :  "+ReportName);
		        	 scrollToWebElement(ReportsNames.get(m));
		        	// WebElement RName=ReportName;
		        	 if(ReportName.equals("Request Change Status Chart")) {		        		
		        		 scrollToWebElement(ReportsNames.get(m));
		        		 //scrollToWebElement(byScrollTUserSpecificSearchXpath);
		        		 webElement  = driver.findElement(byThumbsUpandThumbsDownXpath);
		        		 Actions a=new Actions(driver);
		        		 a.doubleClick(webElement).build().perform();
		        	 }
		           
		     
		      
	        	 if(ReportName.equals("Recommendation Report")) {		        		
	        		 m=28;
	        	 }
	        	 System.out.println("M andReportsNames.size() :  "+m+ " "+ReportsNames.size());
	        	 if(m==ReportsNames.size()) {
	        		 List<WebElement> ReportsNames1=driver.findElements(By.xpath("//div[@class='oj-datagrid-scroller']//span[contains(@title,'Name')]"));
	    	         System.out.println("Name's List :  "+ReportsNames1.size());
	    	         for(int n=0;n<ReportsNames1.size();n++) {
	    	        	 String ReportName1=ReportsNames1.get(n).getText();
	    	        	 //System.out.println("Name's  :  "+ReportName1);
	    	        	 scrollToWebElement(ReportsNames1.get(n));
	    	        	 if(ReportName1.equals("ThumbsUp and ThumbsDown Feedback")) {	
	    	        		 
	    	        		 //scrollToWebElement(ReportsNames.get(m));
			        		 //scrollToWebElement(byScrollTUserSpecificSearchXpath);
			        		 webElement  = driver.findElement(byThumbsUpandThumbsDownXpath);
			        		 Actions a=new Actions(driver);
			        		 a.doubleClick(webElement).build().perform();
	    	        	 }
	    	         }
	        	 }
		         
	           }
	         
		    
			   scrollToWebElement(byScrollTUserSpecificSearchXpath);
			    Actions a=new Actions(driver);
			    WebElement ThumbsUpAndThumbsDownFeedback=driver.findElement(By.xpath("//span[text()='ThumbsUp and ThumbsDown Feedback']"));
			    a.doubleClick(ThumbsUpAndThumbsDownFeedback).build().perform();
			    hardWait(5);
			    click(byClickSearchXpath);
			    hardWait(3);
			    List<WebElement> RatingsSubmitted=driver.findElements(By.xpath("(//span[contains(@title,'Ratings Submitted')])"));
			    System.out.println("RatingsSubmitted List :  "+RatingsSubmitted.size());
			    for(int m=0;m<RatingsSubmitted.size();m++) {
			         m++;
			         WebElement  RatingSubmitted=driver.findElement(By.xpath("(//span[contains(@title,'Ratings Submitted')])["+m+"]"));
			         String RatingSubmittedCount=getTextOfWebelement(RatingSubmitted);
    			     System.out.println("Ratings Submitted Count :  "+RatingSubmittedCount); 
    			     m--;
			    }
			    List<WebElement> ThumbsupCount=driver.findElements(By.xpath("(//span[contains(@title,'Thumbsup Count')]//a)"));
			    System.out.println("ThumbsupCount List :  "+ThumbsupCount.size());
			    for(int i=0;i<ThumbsupCount.size();i++) {
			         i++;
			         WebElement  ThumbsupCounts=driver.findElement(By.xpath("(//span[contains(@title,'Thumbsup Count')]//a)["+i+"]"));
			         String ThumbsupCountsTitle=getTextOfWebelement(ThumbsupCounts);
			         //click(ThumbsupCountsTitle);
			         
			        // click(byClickTopLevelXpath);  
    			     System.out.println("Total Thumbsup Count :  "+ThumbsupCountsTitle); 
    			     i--;
			    }
			    List<WebElement> ThumbsdownCount=driver.findElements(By.xpath("(//span[contains(@title,'Thumbsdown Count')]//a)"));
			    System.out.println("Thumbsdown Count List :  "+ThumbsdownCount.size());
			    for(int j=0;j<ThumbsdownCount.size();j++) {
			         j++;
			         
			         WebElement  ThumbsdownCounts=driver.findElement(By.xpath("(//span[contains(@title,'Thumbsdown Count')]//a)["+j+"]"));
			         String ThumbsdownCountsTitle=getTextOfWebelement(ThumbsdownCounts);
			         System.out.println("Total Thumbsdown Count :  "+ThumbsdownCountsTitle); 
    			     j--;
			    }
			    int n=0;
			    List<WebElement> ThumbsupCountClick=driver.findElements(By.xpath("(//span[contains(@title,'Thumbsup Count')]//a)"));
			    System.out.println("ThumbsupCount List :  "+ThumbsupCountClick.size());
			    for(int i=0;i<ThumbsupCount.size();i++) {
			         i++;
			         String ThumbsupCounts=driver.findElement(By.xpath("(//span[contains(@title,'Thumbsup Count')]//a)["+i+"]")).getText();
			         int Count = Integer.parseInt(ThumbsupCounts);
			         if(Count!=0) {
			        	WebElement  TCounts=driver.findElement(By.xpath("(//span[contains(@title,'Thumbsup Count')]//a)["+i+"]"));
			        	click(TCounts);
			        	n++;
			        	hardWait(5);
			        	click(byClickTopLevel);
			        	break;
			         }   		 
    			     i--;
			    }
			    if(n==0) {
			    	 List<WebElement> Thumbsdown=driver.findElements(By.xpath("(//span[contains(@title,'Thumbsdown Count')]//a)"));
				    System.out.println("Happy Count List :  "+Thumbsdown.size());
				    for(int i=0;i<Thumbsdown.size();i++) {
				         i++;
				         String td=driver.findElement(By.xpath("(//span[contains(@title,'Thumbsdown Count')]//a)["+i+"]")).getText();
				         int Count = Integer.parseInt(td);
				         if(Count!=0) {
					        	WebElement  TCounts=driver.findElement(By.xpath("(//span[contains(@title,'Thumbsdown Count')]//a)["+i+"]"));
					        	click(TCounts);
					        	hardWait(5);
					        	click(byClickTopLevel);
					        	break;
					         }   		 
		    			 i--;
				    }
			    }
			hardWait(5);
			click(byThambsUpandDown);
			hardWait(5);
			click(byReportingCloseXpath);
			} catch (Exception e) {
			log.error("Selecting and Verifying Test is un-successfull");
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
