package com.MACU.CP;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class QuickNavigation extends QuickNavigation_POM {

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

	@Test(priority = 1, description = "Quick Navigation options- Assert Article from My Top Bookmarks")
	public void testAssertBookmarkArticle() throws Exception {
		try {

			//click(byQuickNavMenuButton);
			hardWait(2);
			/* This Functionality Remove from the Application
			 
			highlightWebElement(byMyTopBookmarks);
			highlightWebElement(byMyTopBookmarksArticle);
			click(byMyTopBookmarksArticle);

			
			hardWait(8);
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			//driver.switchTo().window(tabs.get(1));
			
			hardWait(2);
			highlightWebElement(byBreadCrumb);
			driver.close();
			driver.switchTo().window(tabs.get(0));
			hardWait(2);
// Below code is for Assert Article clicked from MyTopBookmark
/*			String actualHeader = getTextOfWebelement(byBookmarksArticle);
			String expectedHeader = byCovid19Article;
			assertEquals(expectedHeader, actualHeader, "Assert Failed at bookmark Article");
			Assert.assertTrue(actualHeader.contains(byCovid19Article));
			log.info("Assert Done");
			System.out.println("Expected Article Name Is ::" + expectedHeader + " & Actual Article Name Is ::" + actualHeader);*/
			
//--------------------------------------------------------------------------------------------
		} catch (Exception e) {
			log.error("Assert Article from My Top Bookmarks Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@Test(priority = 2, description = "Quick Navigation options- Bookmark Article")
	public void testBookmarkArticle() throws Exception {
		try {

// Below code is for Search Article and Bookmark

			hardWait(5);
			click(bySearchArticleTextBox);
			enterText(bySearchArticleTextBox, byArticle);
			highlightWebElement(bySearchedArticleResult);
			click(bySearchedArticleResult);
			hardWait(2);
			click(bySelectSearchedArticle);
			hardWait(4);
		} catch (Exception e) {
			log.error("Bookmark Article Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@Test(priority = 3, description = "Quick Navigation options- Verify Bookmark Article and Highlight in List")
	public void testVerifyBookmarkArticle() throws Exception {
		try {
// Below code is for Bookmark Article to see in My Top Bookmarks - also verify Bookmark Selected or Un-Selected 
			String ArticleTitle = getTextOfWebelement(byArticleTitle);
			System.out.println(ArticleTitle);
			if (driver.findElement(By.className("bookmark_icon_blank")).isDisplayed()) {
				click(byBookmarkIcon);
				System.out.println("Bookmark Icon Selected");
			} else {
				System.out.println("Already Bookmark Selected");
			}
			click(byHomePage);
			hardWait(3);
			highlightWebElement(byQuickNavMenuButton);
			click(byQuickNavMenuButton);
//-------------------------------------------------------------------------------------

// Below code is for List of Top Bookmarked articles [and highlight article which was bookmarked]
//			click(byQuickNavMenuButton);
			List<WebElement> topbookmarked = driver.findElements(By.xpath("//div[@class='rn_HoverBookmark']//li//a"));
			System.out.println("Number of elements:" + topbookmarked.size());
			
			
		for (int i=0; i<topbookmarked.size();i++){
			
//			scrollToWebElement(byMyTopBookmarks);
//			if(topbookmarked!=null) {
//			highlightWebElement(topbookmarked.get(i));			
//			System.out.println("Top Bookmarked Articles are :" + topbookmarked.get(i).getText());
			if(topbookmarked.get(i).getText().equalsIgnoreCase(byArticle)) {
				highlightWebElement(topbookmarked.get(i));
				System.out.println("Expected Result: "+ ArticleTitle + " Actual Result: "+ topbookmarked.get(i).getText());
				
			}

//			}			
//			break;			
		}	
//------------------------------------------------------------------------------------------------
		click(byMyTopBookmarksSeeMore);
		hardWait(3);
//		highlightWebElement(byMyBookmarkedArticle);
		
	List<WebElement> MyBookmarkedArticle = driver.findElements(By.xpath("//div[@class='rn_NotificationList']//a"));
	System.out.println("Number of elements:" + MyBookmarkedArticle.size());
	for (int i=0; i<MyBookmarkedArticle.size();i++){
//		scrollToWebElement(byMyBookmarkedArticle);
//		if(MyBookmarkedArticle!=null) {
//			highlightWebElement(MyBookmarkedArticle.get(i));
//			System.out.println("My Bookmarked Articles are:" + MyBookmarkedArticle.get(i).getText());
			if(MyBookmarkedArticle.get(i).getText().equalsIgnoreCase(byArticle)) {
				highlightWebElement(MyBookmarkedArticle.get(i));
				System.out.println("Expected Result: "+ ArticleTitle + " Actual Result: "+ MyBookmarkedArticle.get(i).getText());
			}

			}
//			break;
//		}	
		}
		
		catch (Exception e) {
			log.error("Verify Bookmark Article and Highlight in List Test is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}

	@Test(priority = 4, description = "Quick_Nav- Preferences in My Bookmarks")
	public void testPreferencesBookmarkPage() throws Exception {
		try {
			
			click(byHomePage);
			hardWait(3);
			click(byQuickNavMenuButton);
			highlightWebElement(byPreferencesMyBookmarks);
			click(byPreferencesMyBookmarks);
			highlightWebElement(byMyBookmarkedArticle);
			highlightWebElement(byMyBookmarkFilter);
			click(byMyBookmarkFilter);
			scrollToWebElement(byMyBookmarkFilterOptions);
			highlightWebElement(byMyBookmarkFilterOptions);
			click(byMyBookmarkFilterOptions);
			hardWait(3);
			
		}
			catch (Exception e) {
				log.error("Preferences in My Bookmarks Test is un-successfull");
				e.printStackTrace();
				throw e;
			}
		}
	@Test(priority = 5, description = "Quick_Nav- Preferences My Notification")
	public void testPreferencesNotificationPage() throws Exception {
		try {
			hardWait(2);
			click(byHomePage);
			hardWait(2);
			click(byQuickNavMenuButton);
			click(byPreferencesMyNotifications);
			click(byMyNotificationsBrowseAllPages);
			hardWait(5);
			highlightWebElement(byMyNotificationsVIEWAtoZINDEX);
			click(byMyNotificationsVIEWAtoZINDEX);
			hardWait(3);
			click(byHomePage);
			
		}
		catch (Exception e) {
			log.error("Preferences My Notification Test is un-successfull");
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
