package com.MACU.BUI;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateNewArticleFlow extends CreateNewArticleFlow_POM{
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
	@Test (priority = 1, groups = {"Sanity","Regression"}, description = "Navigate To Article testing")
	public void testNavigateToArticleFlow() throws Exception {
		try {
			hardWait(15);
			//click(byClickCloseActionCenterXpath);
			//hardWait(2);
			click(byNavigationButton);
			//hardWait(2);
			click(byConfigurationXpath);
			click(byClickServiceButtonXpath);
			//click(byClickServiceButtonXpath);
			click(byClickKnowledgeAdvancedButtonXpath);
			click(byClickAuthoringButtonXpath);
			hardWait(6);
			
		} catch (Exception e) {		
	    	log.error("Navigate To Article un-successfull");
	    	e.printStackTrace();
			throw e;
			
		}
	}
	@Test (priority = 2, groups = {"Sanity","Regression"}, description = "Create Article testing")
	public void testCreateArticleFlow() throws Exception {
		try {	
			WebElement  frame=driver.findElement(By.xpath("//iframe[@data-bind='attr: { src: frameUrl}']"));
			driver.switchTo().frame(frame);
			hardWait(2);
			click(byClickMainContentButtonXpath);
			hardWait(1);
			click(byClickAddArticleButtonXpath);
			hardWait(1);
			enterText(byEnterTitleNameFieldXpath,bygettitle);
			hardWait(1);
			enterText(byEnterKeyWordNameFieldXpath,bygetkeywords);
			hardWait(1);
			click(byContantInfoWindowXpath);
			hardWait(1);
			WebElement  contentframe=driver.findElement(By.xpath("(//iframe[contains(@title,'Rich Text Editor')])[1]"));
			hardWait(1);
			driver.switchTo().frame(contentframe);
			hardWait(2);
			enterText(byEnterContentInfoXpath,bygetcontentinfo);
			hardWait(2);
			driver.switchTo().parentFrame();
			hardWait(2);
		    scrollToWebElement(byScrollToContentInfoXpath);
		    hardWait(1);
		    click(byContantWindowXpath);
		    hardWait(1);
		    WebElement  contentinfoframe=driver.findElement(By.xpath("(//iframe[contains(@title,'Rich Text Editor')])[2]"));
			driver.switchTo().frame(contentinfoframe);
			hardWait(2);
			enterText(byEnterContentInfoXpath,bygetcontent);
			hardWait(2);
			driver.switchTo().parentFrame();
			hardWait(1);
			click(byScrollToJumpTOXpath);
			hardWait(1);
			click(byClickImageXpath);
			hardWait(1);
			click(byClickBrowserImageFieldXpath);
			String MainWindow = driver.getWindowHandle();
		    System.out.println("Main window handle is :  " + MainWindow);
		    // To handle all new opened window
		    Set<String> allwindows = driver.getWindowHandles();
		    System.out.println("Child window handle is :  " + allwindows.size());
		    for(String child:allwindows)
			{
				System.out.println("child Windows :  "+child);
				if(!MainWindow.equalsIgnoreCase(child))
                  {
	                driver.switchTo().window(child);
	                hardWait(10);
	                driver.switchTo().frame("CKFinder");
	                System.out.println("iframe- switch");
	                hardWait(5);
		            click(bySelectBrowserImageFieldXpath);
		            System.out.println("Options selected");
		            hardWait(5);
		            
				    Actions a=new Actions(driver);
				    WebElement pic=driver.findElement(By.xpath("(//div[@class='files_thumbnails fake no_list']//a)[1]//div//div[@role='img']"));
				    a.doubleClick(pic).build().perform();
				    System.out.println("Select pic");
				    //driver.switchTo().window(child);
                 }
				
		     }
		    hardWait(5);
		    driver.switchTo().window(MainWindow);
		    hardWait(2);
		    driver.switchTo().frame(frame);
		    hardWait(2);
			click(byPopUPWindowXpath);
			hardWait(2);
			//driver.switchTo().parentFrame();
			hardWait(5);
			scrollToWebElement(byScrollToBasicInfoXpath);
			hardWait(1);
			click(byClickLinkXpath);
			hardWait(5);
			enterText(byEnterInputLinkValueXpath,bygetId);
			enterText(byEnterInputLinkNameXpath,bygetLink);
			click(byClickOKButtonXpath);
			hardWait(1);
			scrollToWebElement(byScrollToContentBasicXpath);
			click(byClickBasicInfoXpath);
			hardWait(1);
			WebElement  Basicinfoframe=driver.findElement(By.xpath("(//iframe[contains(@title,'Rich Text Editor')])[5]"));
			driver.switchTo().frame(Basicinfoframe);
			hardWait(1);
			enterText(byEnterContentInfoXpath,bygetBasicInfo);
			hardWait(1);
			driver.switchTo().parentFrame();
			hardWait(2);
			scrollToWebElement(byScrollToStepsXpath);
			hardWait(1);
			click(byClickBasicContactInfoXpath);
			hardWait(1);
			WebElement  BasicContactinfoframe=driver.findElement(By.xpath("(//iframe[contains(@title,'Rich Text Editor')])[6]"));
			driver.switchTo().frame(BasicContactinfoframe);
			hardWait(1);
			enterText(byEnterContentInfoXpath,bygetBasicContactInfo);
			hardWait(1);
			driver.switchTo().parentFrame();
			hardWait(1);
			scrollToWebElement(byScrollToContentStepsXpath);
			hardWait(1);
			click(byClickStepsXpath);
			hardWait(1);
			WebElement Stepinfoframe=driver.findElement(By.xpath("(//iframe[contains(@title,'Rich Text Editor')])[7]"));
			driver.switchTo().frame(Stepinfoframe);
			hardWait(2);
			enterText(byEnterContentInfoXpath,bygetSteps);
			hardWait(1);
			driver.switchTo().parentFrame();
			hardWait(1);
			
			scrollToWebElement(byScrollToFormsandResourcesXpath);
			hardWait(1);
			click(byClickStepsContactInfoXpath);
			hardWait(1);
			WebElement  StepsContactinfoframe=driver.findElement(By.xpath("(//iframe[contains(@title,'Rich Text Editor')])[8]"));
			driver.switchTo().frame(StepsContactinfoframe);
			hardWait(1);
			enterText(byEnterContentInfoXpath,bygetStepsContactInfo);
			hardWait(1);
			driver.switchTo().parentFrame();
			hardWait(2);
			
			scrollToWebElement(byScrollToContentFormsAnsResourceXpath);
			click(byClickFormsAndResourceXpath);
			hardWait(1);
			WebElement FormAndResourceframe=driver.findElement(By.xpath("(//iframe[contains(@title,'Rich Text Editor')])[9]"));
			driver.switchTo().frame(FormAndResourceframe);
			hardWait(2);
			enterText(byEnterContentInfoXpath,bygetForms_Resources);
			hardWait(1);
			driver.switchTo().parentFrame();
			hardWait(2);
			
			//scrollToWebElement(byScrollToSalesConnectionsXpath);			
			click(byClickFormsResourceContactInfoXpath);
			hardWait(2);
			hardWait(2);
			WebElement  FormAndResourceContentframe=driver.findElement(By.xpath("(//iframe[contains(@title,'Rich Text Editor')])[10]"));
			driver.switchTo().frame(FormAndResourceContentframe);
			hardWait(2);
			enterText(byEnterContentInfoXpath,bygetForms_Resources_Content);
			hardWait(2);
			driver.switchTo().parentFrame();
			hardWait(2);
			
			//*scrollToWebElement(byScrollToContentSalesXpath);
			click(byClickSalesConnectionsXpath);
			hardWait(2);
			WebElement SalesConnections=driver.findElement(By.xpath("(//iframe[contains(@title,'Rich Text Editor')])[11]"));
			driver.switchTo().frame(SalesConnections);
			hardWait(2);
			enterText(byEnterContentInfoXpath,bygetSalesConnections);
			hardWait(2);
			driver.switchTo().parentFrame();
			hardWait(2);
			
			scrollToWebElement(byScrollToAnswerTypeXpath);
			String filePath = System.getProperty("user.dir") + "/resources/importfile/MACUpolicy.pdf";
			driver.findElement(By.xpath("//input[@class='normal submitbutton']")).sendKeys(filePath);
			hardWait(2);
			
			scrollToWebElement(byScrollToFileAttachmentXpath);
            click(byClickTeamSelectionXpath);
			click(byClickComplianceCheckBoxXpath);
			click(byClickNeedToKnowRadioNOXpath);
			
			
			scrollToWebElement(byScrollToAnswerTypeXpath);
			//click(byClickSalesConnectionsInfoXpath);
			hardWait(10);
//			WebElement  SalesConnectionsInfo=driver.findElement(By.xpath("(//iframe[contains(@title,'Rich Text Editor')])[12]"));
//			driver.switchTo().frame(SalesConnectionsInfo);
//			hardWait(2);
//			enterText(byEnterContentInfoXpath,bygetSalesConnectionsContent);
//			hardWait(2);
			
			//driver.switchTo().parentFrame();
			hardWait(2);
			
			
			
			
			
			/*scrollToWebElement(byScrollToTeamsXpath);
			click(byClickAnswerTypesXpath);
			hardWait(2);
			WebElement AnswerTypeFrame=driver.findElement(By.xpath("(//iframe[contains(@title,'Rich Text Editor')])[13]"));
			driver.switchTo().frame(AnswerTypeFrame);
			hardWait(2);
			enterText(byEnterContentInfoXpath,bygetAnswerType);
			hardWait(2);
			driver.switchTo().parentFrame();
			hardWait(2);
			*/
			
			
			
			//scrollToWebElement(byScrollNeedtoKnowImagesXpath);
			click(byClickMajorChangeXpath);
			click(byClickCorporateSelectionXpath);
			click(byClickDepartmentSelectionXpath);
			click(byClickManagerLevelSelectionXpath);
			click(byClickEmployeeSelectionXpath);
			click(byClickBranchNameSelectionXpath);
			click(byClickBranchAreaSelectionXpath);
			click(byClickPrimaryTagSelectionXpath);
			click(byClickSecondaryTagSelectionXpath);
			click(byClickTertiaryTagSelectionXpath);
			
			scrollToWebElement(byClickTertiaryTagSelectionXpath);
			click(byClickRepositoryPlusbuttonXpath);
			//click(byClickRepositorySelectionbuttonXpath);
			
			WebElement  contegoryframe=driver.findElement(By.xpath("(//iframe[contains(@src,'/macu__tst1InfoManager/WebObjects/InfoManager.woa/wo')])[1]"));                                         
			driver.switchTo().frame(contegoryframe);
			scrollToWebElement(byClickCategoryTopLevelXpath);
			click(byClickCategoryListPlusXpath);
			hardWait(5);
			click(byClickCategoryListXpath);
			click(byClickCategorySubListXpath);
			click(byClickCategoryAddButtonXpath);
			driver.switchTo().parentFrame();
			
			WebElement  Productframe=driver.findElement(By.xpath("(//iframe[contains(@src,'/macu__tst1InfoManager/WebObjects/InfoManager')])[2]"));                                         
			driver.switchTo().frame(Productframe);
			click(byClickProductDropDownXpath);
			click(bySelectProductDropDownSearchXpath);
			List<WebElement> productlist=driver.findElements(By.xpath("//div[@id='AVAIL']//tr//td//span"));
			System.out.println("Product List"+productlist.size());
			for(int i=0;i<productlist.size();i++) {
				i++;
				String ProductName=productlist.get(i).getText();
				System.out.println(ProductName);
				if(i==1) {
				enterText(bySelectProductsearchstringXpath,ProductName);
				}
			}
			click(byClickProductTopLevelXpath);
			click(byClickCategoryAddButtonXpath);
			driver.switchTo().parentFrame();
			WebElement  usergroupframe=driver.findElement(By.xpath("(//iframe[contains(@src,'/macu__tst1InfoManager/WebObjects/InfoManager.woa/wo/')])[3]"));                                         
			driver.switchTo().frame(usergroupframe);
			scrollToWebElement(byClickCategoryTopLevelXpath);
			click(bySelectUserGroupXpath);
			click(byClickCategoryAddButtonXpath);
			driver.switchTo().parentFrame();
			scrollToWebElement(byScrollPublishingOptionsXpath);
			
			click(byNotifySubscribersXpath);
			click(bySaveDocumentXpath);
			hardWait(5);
			} catch (Exception e) {
			log.error("Create Article  un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@Test (priority = 3, groups = {"Sanity","Regression"}, description = "Publish Article testing")
	public void testPublishArticleFlow() throws Exception {
	try {	
	    
		hardWait(6);
		String ArticleName=driver.findElement(By.xpath("(//span[text()='Title']//following::span[text()])[1]")).getText();
		String DocumentID=driver.findElement(By.xpath("(//span[text()='Document ID']//following::span)[1]")).getText();
		System.out.println(DocumentID+" "+ArticleName);
		String ArticleNameWithDocumentID=DocumentID+" - "+ArticleName+" ";
		System.out.println(ArticleNameWithDocumentID);
		hardWait(6);
		scrollToWebElement(byScrollToWorkFlowXpath);
		hardWait(2);
		click(byClickApproveXpath);
		hardWait(3);
		scrollToWebElement(byScrollToWorkFlowXpath);
		hardWait(2);
		click(byClickApproveXpath);
		hardWait(3);
		scrollToWebElement(byScrollToWorkFlowXpath);
		hardWait(2);
		click(byClickApproveXpath);
		hardWait(2);
		highlightWebElement(byClosedApproveXpath);
		hardWait(2);
		highlightWebElement(byVersionXpath);
		hardWait(2);
		highlightWebElement(byVersionLiveXpath);
		hardWait(2);
		highlightWebElement(byGettheDocumentIDXpath);
		hardWait(2);
		DocumentIDinCP =getTextOfWebelement(byGettheDocumentIDXpath);
		String DocumentsID=getTextOfWebelement(byGettheDocumentIDXpath);
		System.out.println(DocumentsID + " "+DocumentIDinCP);
		click(byClickDoneButtonXpath);
		hardWait(5);
		driver.switchTo().parentFrame();
		//click(byClickCloseButtonXpath);
		click(byReportingCloseXpath);
		
		hardWait(5);
		hardWait(3);
		click(byClickUserProfileXpath);
		hardWait(2);
		click(byClickUserProfileSignOutXpath);
		hardWait(5);
 		closeCurrentBrowser();
	  } catch (Exception e) {
		log.error("Publish Article un-successfull");
		e.printStackTrace();
		throw e;
	  }
    }

	@Test(priority = 4, groups = {"Sanity","Regression"}, description = "Search an Article in CP")
	public void testSearchanArticle() throws Exception {
		try {
			openBrowser();
			signIntoCP();

			hardWait(6);
			System.out.println(DocumentIDinCP);
			driver.get("https://macu1--tst1.custhelp.com/app/answers/macu_view/a_id/"+DocumentIDinCP);
			
			hardWait(5);
		} catch (Exception e) {
			log.error("Search an Article in CP is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@AfterClass
	public void testCPClose() throws Exception {
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
