package com.MACU.CP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArticlePage extends ArticlePage_POM{
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

	@Test(priority = 1, groups = {"Sanity","Regression"}, description = "ArticlePage - Search and Select Article")
	public void testSearchPage() throws Exception {
		try {
			click(bySearchArticleTextBox);
			enterText(bySearchArticleTextBox, byArticle);
			hardWait(5);
			//click(bySearchedsearchArticle);
			highlightWebElement(bySearchedArticleResult);
			click(bySearchedArticleResult);
			hardWait(2);
			click(bySelectSearchedArticle);
		} catch (Exception e) {
			log.error("Search and Select Article Test case is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
			
	@Test(priority = 2, groups = {"Sanity","Regression"}, description = "ArticlePage - Bookmark Article, Un-Bookmark Article & Delete Bookmark")
	public void testBookmarkArticle() throws Exception {
		try {	
//Below code is for Bookmark Article to see in My Top Bookmarks - also to verify Bookmark Selected or Un-Selected 
			
			hardWait(4);			
			//String ArticleTitle = getTextOfWebelement(byArticleTitle);
			//System.out.println(ArticleTitle);
			hardWait(2);
// UnDo BookMark
			WebElement BookmarkArticle = driver.findElement(By.xpath("//div[@class='rn_AddBookmark']/a"));
			boolean Bookmark = BookmarkArticle.getAttribute("class").contentEquals("add_bookmarkButton");		
			if (Bookmark) { 
				System.out.println("Already Bookmark is Un-Selected");
			} else {
				click(byUnBookmark); 
				System.out.println("Bookmark is Un-Selected");
			}
			driver.navigate().refresh();
			moveTo(byDisplayedArticleTitle);
			highlightWebElement(byDisplayedArticleTitle);
			hardWait(2);
// Select BookMark
			WebElement BookmarkedArticle = driver.findElement(By.xpath("//div[@class='rn_AddBookmark']/a"));
			boolean Bookmarked = BookmarkedArticle.getAttribute("class").contains("bookmarkedFilled");
			  if (Bookmarked) { 
				  System.out.println("Already Bookmark is Selected"); 
				  } else{ 
					 click(byBookmark); 
					 System.out.println("Bookmark is Selected");
					 }
			  hardWait(2);
			click(byQuickNavMenuButton);
			click(byMyBookmarks);
			hardWait(5);
// Delete BookMark
			highlightWebElement(byMyBookmarkedArticle);
			highlightWebElement(byDeleteButton);
			click(byDeleteButton);
			driver.navigate().refresh();
			hardWait(4);
			click(byHomePage);
			hardWait(2);
			click(bySearchArticleTextBox);
			enterText(bySearchArticleTextBox, byArticle);
			click(bySearchedArticleResult);
			hardWait(2);
			click(bySelectSearchedArticle);
			hardWait(2);

		} catch (Exception e) {
			log.error("Bookmark Article Test case is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	@Test(priority = 3,groups = {"Sanity","Regression"}, description = "ArticlePage - Share Email")
	public void testShareEmail() throws Exception {
		try {
			hardWait(3);
			click(byShareEmail);
			click(byEmployeeNameTextbox);			
			enterText(byEmployeeNameTextbox, byEmployeeName);
			hardWait(3);
			click(bySelectEmployeeName);
//			click(bySendEmailPageButton);
			click(byCloseSendEmailPopup);
			hardWait(4);
			highlightWebElement(byFormsandResources);
			click(byFormsandResources);
			hardWait(3);
			highlightWebElement(byFormsandResourcesOption);
			moveTo(byFormsandResourcesOption);
			clickUsingActions(byFormsandResourcesOption);
			hardWait(5);
			driver.navigate().back();
			//clickUsingActions(byFormsandResourcesOption);
			hardWait(8);
			/*ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			driver.close();
			driver.switchTo().window(tabs.get(0));
			hardWait(2);
			highlightWebElement(byBreadCrumb);
			click(byBreadCrumb);
			hardWait(2);*/
			//click(byBreadCrumb);
			click(byHomePage);
			
		} catch (Exception e) {
			log.error("Share Email Test case is un-successfull");
			e.printStackTrace();
			throw e;
		}
	}
	
	@Test(priority = 4, groups = {"Sanity","Regression"}, description = "ArticlePage - Search Existing Article [Article with all functionalities should be selected to verify]")
	public void testSearchArticle() throws Exception {
		try {
			hardWait(5);
			click(bySearchArticleTextBox);
			enterText(bySearchArticleTextBox, byArticle);
			hardWait(5);
			//click(bySearchedsearchArticle);
			highlightWebElement(bySearchedArticleResult);
			click(bySearchedArticleResult);
			hardWait(2);
			hardWait(2);
			click(bySelectSearchedArticle);
		}
			catch (Exception e) {
				log.error("Search Existing Article Test case is un-successfull");
				e.printStackTrace();
				throw e;
			}
		}
	@Test(priority = 5, groups = {"Sanity","Regression"}, description = "ArticlePage- My Top Bookmarks, RequestsUpdatesComments, RecentlyViewed, Thumbs Up & Down")
	public void testRequests() throws Exception {
		try {
			hardWait(2);
			scrollToWebElement(byHomePage);
			hardWait(3);
			highlightWebElement(byBookmark);
//			highlightWebElement(byBookmarkIcon);
			highlightWebElement(byPrinterIcon);
			highlightWebElement(byShareIcon);
//			highlightWebElement(byCompliance);
			scrollToWebElement(byPrinterIcon);
//			highlightWebElement(byNote);
			hardWait(2);
			scrollToWebElement(byHomePage);
			highlightWebElement(bythumbsUp);
//			click(bythumbsUp);
			highlightWebElement(bythumbsDown);
//			highlightWebElement(byEmployeeResources);
//			click(byEmployeeResources);
//			highlightWebElement(byRemoteWork);
//			click(byRemoteWork);
			scrollToWebElement(byRecentlyViewed);
			highlightWebElement(byRecentlyViewed);
			hardWait(2);
			highlightWebElement(byRequestsUpdatesComments);
			click(byRequestsUpdatesComments);
			enterText(byHelpUsImprove, byHelpUsImproveComments);
//			click(byHelpUsImproveSubmit);
			click(byHelpUsImproveClosePopUp);
			scrollToWebElement(byHomePage);
			hardWait(1);		
			highlightWebElement(byRelatedPages);
			click(byRelatedPages);
			hardWait(1);
			click(byRelatedPages);
			highlightWebElement(bySearchPageLevel);
			enterText(bySearchPageLevel, byArticle);
			hardWait(3);
			click(bySelectSearchPageLevel);
			hardWait(4);
			click(byHomePage);
		}
		catch (Exception e) {
			log.error("testRequests Test case is un-successfull");
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

