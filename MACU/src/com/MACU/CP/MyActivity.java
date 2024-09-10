package com.MACU.CP;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyActivity extends MyActivity_POM{
	@BeforeClass
	public void testSignIn() throws Exception {
		try {

			openBrowser();
			signIntoCP();
			Thread.sleep(4000);

		} catch (Exception e) {
			log.error("Login/SignIn un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	
	@Test(priority = 1, description = "My Activity Page")
	public void testSearchPage() throws Exception {
		try {
			
			hardWait(2);
			click(byQuickNavMenuButton);
			highlightWebElement(byMyActivityButton);
			click(byMyActivityButton);
			hardWait(2);
			click(bySearchArticleTextBox);
			enterText(bySearchArticleTextBox, byArticle);
		   // highlightWebElement(bySearchedArticleResult);
			//click(bySearchedArticleResult);
			hardWait(2);
			click(byHomePage);
			System.out.print("Home Page");
			hardWait(2);
			click(byQuickNavMenuButton);
			System.out.print("byQuickNavMenuButton");
			click(byMyActivityButton);
			System.out.print("byMyActivityButton");
			hardWait(2);
			click(bybrowseAllPages);
			System.out.print("bybrowseAllPages");
			hardWait(5);
			driver.navigate().back();
			System.out.print("back");
			hardWait(5);
			click(byQuickNavMenuButton);
			System.out.print("byQuickNavMenuButton");
			hardWait(3);
			click(byMyActivityButton);
			System.out.print("byMyActivityButton");
			hardWait(2);
			scrollToWebElement(byRequestsUpdatesComments);
			System.out.print("byRequestsUpdatesComments");
			highlightWebElement(byRequestsUpdatesComments);
			click(byRequestsUpdatesComments);
			enterText(byHelpUsImprove, byHelpUsImproveComments);
     		click(byHelpUsImproveSubmit);
			click(byHelpUsImproveSubmitClosePopUp);
			scrollToWebElement(byHomePage);
			click(byHomePage);
		}
			catch (Exception e) {
				log.error("My Activity Page Test is un-successfull");
				e.printStackTrace();
				throw e;
			}
		}
	
	@AfterClass
	public void testSignout() throws Exception {
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
	

