package com.MACU.CP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePage extends HomePage_POM{
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

	@Test(priority = 1, groups = {"Sanity","Regression"}, description = "Home Page - Heres What You Need To Know")
	public void testSearchPage() throws Exception {
		try {
			
			highlightWebElement(byBrowseAllPages);
			click(byBrowseAllPages);
			hardWait(20);
			click(byHomePage);
			hardWait(5);
			highlightWebElement(byHeresWhatYouNeedToKnowSection);
			scrollToWebElement(byBrowseAllPages);
			highlightWebElement(byArticles);
			List <WebElement> articlelist=	driver.findElements(By.xpath("//div[contains(@class,'col-sm-4')]"));			
			System.out.println(articlelist.size());
			for (int i=0; i<articlelist.size();i++){
			highlightWebElement(articlelist.get(i));
			}
			
		}
		catch (Exception e) {
			log.error("Home Page - Heres What You Need To Know Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@Test(priority = 2, groups = {"Sanity","Regression"}, description = "Home Page - New & Update For you")
	public void testNewUpdate() throws Exception {
		try {
			
			highlightWebElement(byNewUpdateForYouSection);
			highlightWebElement(byNewUpdateArticleList);
			
			
		}
		catch (Exception e) {
			log.error("New & Update For you Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	
	@Test(priority = 3, groups = {"Sanity","Regression"}, description = "Home Page - Trending For")
	public void testTrendingFor() throws Exception {
		try {
			
			highlightWebElement(byTrendingSection);
		}
		catch (Exception e) {
			log.error("Trending For Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
		
		
		@Test(priority = 4, groups = {"Sanity","Regression"}, description = "Help us improve Send us a note")
		public void testHelpUsImprove() throws Exception {
			try {
				
				scrollToWebElement(byHeresWhatYouNeedToKnowSection);
				highlightWebElement(byHelpUsImproveSendUsANote);
				click(byHelpUsImproveSendUsANote);
				enterText(byHelpUsImprovePopup, byHelpUsImproveComments);
//				click(byHelpUsImproveSubmitButton);
				click(byHelpUsImproveCancelButton);
			}
			catch (Exception e) {
				log.error("Help us improve Send us a note Test is un-successfull");
				e.printStackTrace();
				throw e;
			}
		}
		@Test(priority = 5, groups = {"Sanity","Regression"}, description = "Emojis- Smile & Sad")
		public void testemojis() throws Exception {
			try {
				scrollToWebElement(byNewUpdateForYouSection);
				//highlightWebElement(byEmojis);
			//	click(bySmileEmoji);
//				click(bySadEmoji);
				
			}
			catch (Exception e) {
				log.error("Emojis- Smile & Sad Test is un-successfull");
				e.printStackTrace();
				throw e;
			}
		}
		@Test(priority = 6, groups = {"Sanity","Regression"}, description = "Footer Links")
		public void testFooterLinks() throws Exception {
			try {
				highlightWebElement(byCOntactUs);
				highlightWebElement(byTeamMemeberTool);
				highlightWebElement(byMemberServiceTools);
				highlightWebElement(byNavigateTheKC);
				highlightWebElement(byAboutTheKC);
				
				
				
				/*highlightWebElement(byFooterBrowseAllPages);
				hardWait(5);
				click(byFooterBrowseAllPages);
				hardWait(15);
				click(byHomePage);
				hardWait(5);
				scrollToWebElement(byNewUpdateForYouSection);
				highlightWebElement(byFooterAtoZIndex);
				click(byFooterAtoZIndex);
				hardWait(3);
				highlightWebElement(byAtoZFilter);
				highlightWebElement(byWithIndexResultforA);
				highlightWebElement(byWithIndexResultforK);
				click(byWithIndexResultforK);
				hardWait(2);
				highlightWebElement(byWithIndexResultforP);
				click(byWithIndexResultforP);
				hardWait(2);
				click(byHomePage);*/
				
			}
			catch (Exception e) {
				log.error("Footer Links Test is un-successfull");
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
