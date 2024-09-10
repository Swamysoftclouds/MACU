package com.MACU.framework;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

//import com.MACU_BUI.main.FeedbackReport;
import com.google.common.io.Files;

public class GlobalVariables {

	public final static Logger log = initLogger();
	
	public static Actions               actions; 
	public static Alert                 alert;
	public static By                    by; 
	public static String 			    currUserDirectory = System.getProperty("user.dir");
	public static WebDriver             driver;
	public static JavascriptExecutor    jse;
	public static SoftAssert 		    softAssert = new SoftAssert();
	public static WebDriverWait         wait; 
	public static WebElement            webElement;
	
	public final static String LOG4J2_CONFIG_FILE_PATH 	       = "./resources/config/logger/log4j2.xml";
	public final static String WEBDRIVER_EXECUTABLES_PATH 	   = "./resources/drivers/";
	
	public final static String BROWSER = YamlWrapper_CP.getBrowserName();
	
	public final static Integer WEBDRIVER_WAIT_TIME = YamlWrapper_CP.getWebDriverWaitTime();


	//Storing the WebTable in HashMap
	public static HashMap<Integer, HashMap <Integer, String>>     webTableData    = new HashMap<Integer, HashMap <Integer, String>>();
	public static HashMap<Integer, HashMap <Integer, WebElement>> webTableElement = new HashMap<Integer, HashMap <Integer, WebElement>>();

	//URL's 
	public static String baseUrl 	= YamlWrapper_CP.getBaseUrl();
	public static String baseUrlforBUI 	= YamlWrapper_BUI.getBaseUrlforBUI();
	
	//Login Credentials for CP 
	public static String byCPusername     = YamlWrapper_CP.getCPUsername();
	public static String byCPpassword     = YamlWrapper_CP.getCPPassword();
	public static String byBUI_username     = YamlWrapper_CP.getBUIUsername();
	public static String byBUI_password     = YamlWrapper_CP.getBUIPassword();
		
	// Login Credentials for BUI
	public static String byBUIusername     = YamlWrapper_BUI.getBUIUsername();
	public static String byBUIpassword     = YamlWrapper_BUI.getBUIPassword();
	
	// Customer Portal - Article Page Variables
	public static String byArticle    	    = YamlWrapper_CP.getArticle();
	public static String byAgetSearchArticle= YamlWrapper_CP.getSearchArticle();
	
	public static String byCovid19Article   = YamlWrapper_CP.getCovid19Article();
	public static String byEmployeeName		= YamlWrapper_CP.getEmployeeName();
	public static String byHelpUsImproveComments		= YamlWrapper_CP.getHelpUsImproveComments();
	public static String byThumbsDownComments			= YamlWrapper_BUI.getThumbsDownComments();
			
	public static String bygetsearchkeyword_search  = YamlWrapper_CP.getsearchkeyword_search();
	public static String bygetReplayForFeedBack  = YamlWrapper_BUI.getReplayForFeedBack();
	public static String bygetlogin_id  = YamlWrapper_BUI.getloginID();
	
	public static String FeedbackArticleStatusinBUI;
	public static String FeedbackArticleStatusinCP;
		
	// BUI - Global Variables
	public static String  AnswerVotingSubjectinCP;
	public static String  AnswerVotingSubjectCreatedDateAndTimeinCP;
	public static String  DocumentIDinCP;
	public static String  ArticleTitle;
	
	public static String  FeedbackReportSendDate = YamlWrapper_BUI.getFeedbackReportSendDate();
	public static String  AddSummary = YamlWrapper_BUI.getAddSummary();
	public static String  AddKeyword = YamlWrapper_BUI.getAddKeyword();
	
	
	// Swamy's Changes
	public static String bygettitle  = YamlWrapper_BUI.gettitle();
	public static String bygetkeywords  = YamlWrapper_BUI.getkeywords();
	public static String bygetcontentinfo  = YamlWrapper_BUI.getcontentinfo();
	public static String bygetcontent  = YamlWrapper_BUI.getcontent();
	public static String bygetId  = YamlWrapper_BUI.getId();
	public static String bygetLink  = YamlWrapper_BUI.getLink();
	public static String bygetBasicInfo  = YamlWrapper_BUI.getBasicInfo();
	public static String bygetBasicContactInfo  = YamlWrapper_BUI.getBasicContactInfo();
	public static String bygetSteps  = YamlWrapper_BUI.getSteps();
	public static String bygetStepsContactInfo  = YamlWrapper_BUI.getStepsContactInfo();
	public static String bygetForms_Resources  = YamlWrapper_BUI.getForms_Resources();
	public static String bygetForms_Resources_Content  = YamlWrapper_BUI.getForms_Resources_Content();
	public static String bygetSalesConnections  = YamlWrapper_BUI.getSalesConnections();
	public static String bygetSalesConnectionsContent  = YamlWrapper_BUI.getSalesConnectionsContent();
	public static String bygetAnswerType  = YamlWrapper_BUI.getAnswerType();
	public static String bygetEditkeywords  = YamlWrapper_BUI.getEditkeywords();
	public static String bygetEditTitle  = YamlWrapper_BUI.getEditTitle();
	public static String bygetEditReason  = YamlWrapper_BUI.getEditReason();
	public static String bygetcallouts  = YamlWrapper_BUI.getcallouts();
	
	
	
	
	
	public static Logger initLogger() {
		System.setProperty("log4j.configurationFile",LOG4J2_CONFIG_FILE_PATH);
		//renameAndMovePreviousTestNGReport();
		return LogManager.getLogger(GlobalVariables.class.getName());
	}
	
	public static void renameAndMovePreviousTestNGReport() {
		try {
			String timeStamp     = new SimpleDateFormat("HH-mm a - dd MMM YYYY").format(new Date());
			File sourceFile 	 = new File("./test-output/emailable-report.html");
			File destinationFile = new File("./resources/reports/" + timeStamp + "_emailable-report.html" );
			Files.copy(sourceFile , destinationFile );
			
		} catch (IOException e) {
			log.error(e);
		}
	}
	
}
