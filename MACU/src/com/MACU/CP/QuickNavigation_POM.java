package com.MACU.CP;

import org.openqa.selenium.By;

import com.MACU.framework.BaseClass;

public class QuickNavigation_POM extends BaseClass{
	
//Global
	public static By byHomePage								= By.className("knowledge");
	public static By byQuickNavMenuButton					= By.xpath("//div[@class='dropdown']");
	
//testAssertBookmarkArticle	
	public static By byMyTopBookmarks						= By.xpath("//label[text()='My Top Bookmarks']");
	public static By byMyTopBookmarksArticle				= By.xpath("(//div[@class='dropdown-content']//a)[1]");
	//public static By byMyTopBookmarksArticle				= By.xpath("//div[@class='rn_HoverBookmark']//a[contains(text(),'"+byCovid19Article+"')]");
	
	public static By byBookmarksArticle						= By.xpath("//div[@class='rn_AnswerDetail rn_AnswerHeader']//h1[contains(text(),'"+byCovid19Article+"')]");
	public static By byBreadCrumb							= By.xpath("//li[@class='breadcrumb-item']//a");
//testBookmarkArticle	
	public static By bySearchArticleTextBox					= By.xpath("//input[@type='search']");
	public static By bySearchedArticleResult				= By.xpath("(//div[@class='yui3-aclist-content']//li//li)[1]");
	//public static By bySelectSearchedArticle				= By.xpath("//div[@class='rn_SearchResultContent']//a[text()='"+byArticle+"']");
	public static By bySelectSearchedArticle				= By.xpath("(//div[@class='rn_SearchResultContent']//a)[1]");
	
	//public static By bySearchedArticleResult				= By.xpath("//ul[@aria-label='Suggested Search']//li[normalize-space()='"+byArticle+"']");
	//public static By bySelectSearchedArticle				= By.xpath("//div[@class='rn_SearchResultContent']//a[text()='"+byArticle+"']");
	public static By byArticleTitle							= By.xpath("//div[@class='rn_AnswerTitle rn_AnswerTitle']//h1[normalize-space()='"+byArticle+"']");
	
//testVerifyBookmarkArticle	
	public static By byBookmarkIcon							= By.xpath("//a[@class='add_bookmarkButton']//img[@class='bookmark_icon_blank']");
//	public static By byTopBookmarkedArticle					= By.xpath("//div[@class='rn_HoverBookmark']//li//a[normalize-space()='"+byArticle+"']");
	public static By byMyTopBookmarksSeeMore				= By.xpath("//a[text()='SEE MORE']");
	public static By byMyBookmarkedArticle					= By.xpath("//div[@class='rn_NotificationList']//a[normalize-space()='"+byArticle+"']");
	public static By bymybookmarked							= By.xpath("//div[@class='rn_NotificationList']//a");

//testPreferencesBookmarkPage
	public static By byPreferencesMyBookmarks				= By.xpath("//div[@class='dropdown-content']//a[normalize-space()='My Bookmarks']");
	public static By byMyBookmarkFilter						= By.xpath("//select[@class='BookmarkFilter']");
	public static By byMyBookmarkFilterOptions				= By.xpath("//select[@class='BookmarkFilter']//option[text()='Alphabetical A-Z']");
	
//testPreferencesNotificationPage	
	public static By byPreferencesMyNotifications			= By.xpath("//div[@class='dropdown-content']//a[normalize-space()='My Notifications']");
	public static By byMyNotificationsBrowseAllPages		= By.xpath("//a[text()='browse all PAGES']");
	public static By byMyNotificationsVIEWAtoZINDEX			= By.xpath("//a[text()='VIEW A-Z INDEX']");



}
