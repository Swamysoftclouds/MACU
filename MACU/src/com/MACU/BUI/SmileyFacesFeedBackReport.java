package com.MACU.BUI;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SmileyFacesFeedBackReport extends SmileyFacesFeedBackReport_POM{
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
	@Test (priority = 1, groups = {"Sanity","Regression"}, description = "Navigate To Anwser Voting Smiley Faces Report testing")
	public void testNavigateToAnwserVotingSmileyFacesReportFlow() throws Exception {
		try {
			hardWait(50);
			//click(byClickCloseActionCenterXpath);
			//hardWait(2);
			click(byNavigationButton);
			click(byClickAnalyticsXpath);
			click(byClickReportsExplorerXpath);
			hardWait(10);
			click(byClickPublicReportsXpath);
			hardWait(10);
			click(byClickMACUCUSTOMREPORTSXpath);
			hardWait(10);
			click(byClickSoftCloudsXpath);
			hardWait(10);
			click(byClickOKCSXpath);
			hardWait(3);
			
		} catch (Exception e) {
			log.error("Navigate To Article un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@Test (priority = 2, groups = {"Sanity","Regression"}, description = "Selecting and Verifying - testing")
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
		        		 webElement  = driver.findElement(By.xpath("//span[text()='Smiley Faces Feedback']"));
		        		 Actions a=new Actions(driver);
		        		 a.doubleClick(webElement).build().perform();
		        	 }
		           
		     
		      
//	        	 if(ReportName.equals("Recommendation Report")) {		        		
//	        		 m=27;
//	        	 }
	        	 //System.out.println("M andReportsNames.size() :  "+m+ " "+ReportsNames.size());
	        	// if(m==ReportsNames.size()) {
		       if(m==27) {
	        		 scrollToWebElement(ReportsNames.get(m));
	        		 List<WebElement> ReportsNames1=driver.findElements(By.xpath("//div[@class='oj-datagrid-scroller']//span[contains(@title,'Name')]"));
	    	         System.out.println("Name's List :  "+ReportsNames1.size());
	    	         
	    	         for(int n=0;n<ReportsNames1.size();n++) {
	    	        	 String ReportName1=ReportsNames1.get(n).getText();
	    	        	 //System.out.println("Name's  :  "+ReportName1);
	    	        	 scrollToWebElement(ReportsNames1.get(n));
	    	        	 if(ReportName1.equals("ThumbsUp and ThumbsDown Feedback")) {	
	    	        		 
	    	        		 //scrollToWebElement(ReportsNames.get(m));
			        		 //scrollToWebElement(byScrollTUserSpecificSearchXpath);
	    	        		 webElement  = driver.findElement(By.xpath("//span[text()='Smiley Faces Feedback']"));
			        		 Actions a=new Actions(driver);
			        		 a.doubleClick(webElement).build().perform();
	    	        	 }
	    	         }
	        	 }
		         }
			
			
			
			  /*  scrollToWebElement(byScrollTUserSpecificSearchXpath);
			    //Actions a=new Actions(driver);
			    WebElement AnswerVotingFeedback=driver.findElement(By.xpath("//span[text()='Smiley Faces Feedback']"));
			    a.doubleClick(AnswerVotingFeedback).build().perform();*/
	       
			    
			    hardWait(2);
			   click(byClickSearchXpath);
			    hardWait(2);
			    List<WebElement> FeedBackYearMonth=driver.findElements(By.xpath("(//span[contains(@title,'Feedback submiited')])"));
			    System.out.println("Happy Count List:"+FeedBackYearMonth.size());
			    for(int m=0;m<FeedBackYearMonth.size();m++) {
			         m++;
			         hardWait(2);
			         WebElement  FeedBackYearAndMonth=driver.findElement(By.xpath("(//span[contains(@title,'Feedback submiited')])["+m+"]"));
			         String FeedBackYearAndMonthCount=getTextOfWebelement(FeedBackYearAndMonth);
    			     System.out.println("FeedBack Year And Month Count:"+FeedBackYearAndMonthCount); 
    			     m--;
			    }
			    List<WebElement> SadCount=driver.findElements(By.xpath("(//span[contains(@title,'Sad ')]//a)"));
			    System.out.println("SadCount List:"+SadCount.size());
			    for(int j=0;j<SadCount.size();j++) {
			         j++;
			         WebElement  SadCounts=driver.findElement(By.xpath("(//span[contains(@title,'Sad ')]//a)["+j+"]"));
			         String SadCountTitle=getTextOfWebelement(SadCounts);
			         System.out.println("Total Sad Count:"+SadCountTitle); 
    			     j--;
			    }
			    int n=0;
			    List<WebElement> HappyCount=driver.findElements(By.xpath("(//span[contains(@title,'Happy ')]//a)"));
			    System.out.println("Happy Count List:"+HappyCount.size());
			    for(int i=0;i<HappyCount.size();i++) {
			         i++;
			         
			         String SmileCounts=driver.findElement(By.xpath("(//span[contains(@title,'Happy ')]//a)["+i+"]")).getText();
			         int Count = Integer.parseInt(SmileCounts);
			         if(Count!=0) {
				        	WebElement  TCounts=driver.findElement(By.xpath("(//span[contains(@title,'Happy ')]//a)["+i+"]"));
				        	click(TCounts);
				        	hardWait(5);
				        	click(byClickTopLevel);
				        	n++;
				        	break;
				         }   		 
	    			 i--;
			    }
			    if(n==0) {
			    	List<WebElement> SadCounts=driver.findElements(By.xpath("(//span[contains(@title,'Sad ')]//a)"));
				    System.out.println("Happy Count List:"+SadCounts.size());
				    for(int i=0;i<SadCounts.size();i++) {
				         i++;
				         String Sad=driver.findElement(By.xpath("(//span[contains(@title,'Sad ')]//a)["+i+"]")).getText();
				         int Count = Integer.parseInt(Sad);
				         if(Count!=0) {
					        	WebElement  TCounts=driver.findElement(By.xpath("(//span[contains(@title,'Sad ')]//a)["+i+"]"));
					        	click(TCounts);
					        	hardWait(5);
					        	click(byClickTopLevel);
					        	break;
					         }   		 
		    			 i--;
				    }
			    }
			    hardWait(2);
				click(byThambsUpandDown);
				hardWait(2);
				click(byReportingCloseXpath);
		} catch (Exception e) {
			log.error("Selecting and Verifying  un-successfull");
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
