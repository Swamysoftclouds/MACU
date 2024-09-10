package com.MACU.CP;

import org.openqa.selenium.By;

import com.MACU.framework.BaseClass;

public class ArticlePage_POM extends BaseClass{
	
//Global
	public static By byHomePage								= By.className("knowledge");
	public static By bySearchArticleTextBox					= By.xpath("//input[@type='search']");
	public static By byBookmark								= By.xpath("//a[@class='add_bookmarkButton']//img[@class='bookmark_icon_blank']");
	public static By byDisplayedArticleTitle				= By.xpath("//h1[@id='rn_Summary']");
	public static By byUnBookmark							= By.xpath("//a[contains(@class,'bookmarkedFilled')]//img[@class='bookmark_icon_red']");
	public static By byQuickNavMenuButton					= By.xpath("//div[@class='dropdown']");
	public static By byMyBookmarks							= By.xpath("//div[@class='data Custom-data']//a[text()='My Bookmarks']");
	public static By byMyBookmarkedArticle					= By.xpath("//div[@class='rn_NotificationList']//a[contains(text(),'"+byArticle+"')]");
	public static By byDeleteButton							= By.xpath("//a[contains(text(),'"+byArticle+"')]//parent::div[@class='rn_Notification_Info']//following-sibling::div[@class='rn_Notification_Actions']//button[@class='rn_Notification_Delete']//img[@class='bookmark_del_ico']");
// testSearchPage	
	public static By bySearchedArticleResult				= By.xpath("(//ul[text()='Suggested Search']//li//li)[1]");
	//public static By bySearchedsearchArticle	        	= By.xpath("//i[@class='fas fa-search search_icon']");
	public static By bySelectSearchedArticle				= By.xpath("//div[@class='rn_SearchResultContent']//tbody//tr//div//span[@class='rn_Element1']//a");	
	//public static By bySelectSearchedArticle				= By.xpath("//div[@class='rn_SearchResultContent']//a[text()='"+byArticle+"']");
	//public static By bySearchedArticleResult				= By.xpath("//ul[@aria-label='Suggested Search']//li[normalize-space()= '"+byArticle+"' ]");
	
// testBookmarkArticle	
	public static By byArticleTitle							= By.xpath("//div[@class='rn_AnswerTitle rn_AnswerTitle']//h1[normalize-space()='"+byArticle+"']");
	
// testShareEmail	
	public static By byShareEmail							= By.xpath("//div[contains(@class,'EmailAnswerLink')]//img[@class='share_icon_default']");
	public static By byEmployeeNameTextbox					= By.xpath("//div[@id='rnDialog1']//input[@class='select2-search__field']");
	public static By bySelectEmployeeName					= By.xpath("//ul[@class='select2-results__options']//li[text()='"+byEmployeeName+"']");
	public static By bySendEmailPageButton					= By.xpath("//button[text()='EMAIL PAGE']");
	public static By byCloseSendEmailPopup					= By.xpath("//button[@class='yui3-button yui3-button-close']");
	public static By byFormsandResources					= By.xpath("//div[@id='formsResources_panel']//div[@id='formsResources_headingOne']");
	public static By byFormsandResourcesOption				= By.xpath("(//ul[@class='formsResources']//ul//li/a)[2]");
	public static By byBreadCrumb							= By.xpath("//li[@class='breadcrumb-item']//a");
	
// testSearchArticle	
	public static By bySearchedArticle						= By.xpath("//ul[@aria-label='Suggested Search']//li[normalize-space()='"+byCovid19Article+"']");
	public static By bySelectSearched						= By.xpath("//div[@class='rn_SearchResultContent']//a[text()='"+byCovid19Article+"']");
	
// testRequests	
	public static By byBookmarkIcon							= By.xpath("//a[contains(@class,'add_bookmarkButton')]//img[contains(@class,'bookmark_icon_red')]");
	public static By byPrinterIcon							= By.xpath("//a[@class='print_anchor tooltip  prt']//img[@class='img-fluid printimg']");
	public static By byShareIcon							= By.xpath("//a[@class='share_icon_wrapper tooltip  prt']//img[@class='share_icon_default']");
	public static By byCompliance							= By.xpath("//div[@class='rn_SchemaAttributeValue']//div[@class='compliance-content-box']");
	public static By byNote									= By.xpath("//div[@class='rn_SchemaAttributeValue']//div[@class='panel panel-default panel_note']");
	public static By bythumbsUp								= By.xpath("//div[@class='main_image_div']//div[@class='thumbs_up_down'][1]");
	public static By bythumbsDown							= By.xpath("//div[@class='main_image_div']//div[@class='thumbs_up_down'][2]");
	public static By byQuickGuide							= By.xpath("//div[@class='quick-guide']");
	public static By byEmployeeResources					= By.xpath("//div[@class='quick-guide']//a[text()='Employee Resources']");
	public static By byRemoteWork							= By.xpath("//div[@class='quick-guide']//a[text()='Remote Work']");
	public static By byRecentlyViewed						= By.xpath("//h5[@class='recently-viewed']//bold[text()='Recently Viewed']");
	public static By byRequestsUpdatesComments				= By.xpath("//button[@class='rn_RecommendContentButton p-0']");
	public static By byHelpUsImprove						= By.xpath("//div[@id='rnDialog1_c']//textarea[contains(@id,RequestUpdate)]");
	public static By byHelpUsImproveSubmit					= By.xpath("//button[text()='Submit']");
	public static By byHelpUsImproveClosePopUp				= By.xpath("//button[@class='yui3-button yui3-button-close']");
	public static By byRelatedPages							= By.id("relatedPages_headingOne");
	public static By bySearchPageLevel						= By.xpath("//div[contains(@class,'input-group')]//input[@type='search']");
	public static By bySelectSearchPageLevel				= By.xpath("//ul[@aria-label='Suggested Search']//li[@class='rn_SuggestionItem'][normalize-space()='"+byArticle+"']");
	
	
}
