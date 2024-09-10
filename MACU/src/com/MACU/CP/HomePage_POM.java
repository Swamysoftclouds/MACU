package com.MACU.CP;

import org.openqa.selenium.By;

import com.MACU.framework.BaseClass;

public class HomePage_POM extends BaseClass{
	
	public static By byBrowseAllPages					= By.xpath("//p[@class='search_text']//a[text()='browse all PAGES']");
	public static By byHomePage							= By.xpath("//a[text()='Knowledge Center']");
	public static By byHeresWhatYouNeedToKnowSection	= By.xpath("//h5[@class='need'][text()='Here’s what you need to know']");
	public static By byArticles							= By.xpath("//div[@class='rn_HotTopics']/section[@class='articles']");
	public static By byArticlesList						= By.xpath("//section[@class='articles']//div[contains(@class,'card custom-card-image custom-card')]");
	
// NEW & UPDATED FOR YOU
	public static By byNewUpdateForYouSection			= By.xpath("//h2[text()=' NEW & UPDATED FOR YOU ']");	
	public static By byNewUpdateArticleList				= By.xpath("//h2[normalize-space()='NEW & UPDATED FOR YOU']//parent::div//following-sibling::div[@class='row article_list']//ul[@class='trending-list']");
	
// Trending
	public static By byTrendingSection 					= By.xpath("//h2[normalize-space()='TRENDING FOR']");
	
//  Help us improve Send us a note
	public static By byHelpUsImproveSendUsANote			= By.xpath("//div[@id='rn_RequestUpdate_9_RecommendContent']//button");					
	public static By byHelpUsImprovePopup				= By.xpath("//textarea[@id='rn_RequestUpdate_9_Description']");
	public static By byHelpUsImproveSubmitButton		= By.xpath("//span[@class='yui3-widget-buttons']//button[text()='Submit']");
	public static By byHelpUsImproveCancelButton		= By.xpath("//span[@class='yui3-widget-buttons']//button[@class='yui3-button yui3-button-close']");

//	Emojis Smile & Sad
	public static By byEmojis							= By.className("emoji d-flex");
	public static By bySmileEmoji						= By.xpath("//div[@class='emoji d-flex']//a[@class='smile']");
	public static By bySadEmoji							= By.xpath("//div[@class='emoji d-flex']//a[@class='sad']");
	
//  Footer Links
	public static By byFooterBrowseAllPages				= By.xpath("//h2[@class='footer_heading']/a[text()='Browse all pages']");
	public static By byFooterAtoZIndex					= By.xpath("//p[@class='search_text text-left ml-0']/a[text()='GO TO A-Z INDEX']");
	public static By byAtoZFilter						= By.xpath("//div[@id='rn_A_ZIndex_2']//ul[@class='indexing_list']");
	public static By byWithIndexResultforA				= By.xpath("//div[@id='rn_A_ZIndex_2']//ul[@class='indexing_list']//a[text()='A']");
	public static By byWithIndexResultforK				= By.xpath("//div[@id='rn_A_ZIndex_2']//ul[@class='indexing_list']//a[text()='K']");
	public static By byWithIndexResultforP				= By.xpath("//div[@id='rn_A_ZIndex_2']//ul[@class='indexing_list']//a[text()='P']");
	public static By byCOntactUs          				= By.xpath("//h6[text()='CONTACT US']");
	public static By byTeamMemeberTool     				= By.xpath("//h6[text()='TEAM MEMBER TOOLS']");
	public static By byMemberServiceTools  				= By.xpath("//h6[text()='MEMBER SERVICE TOOLS']");
	public static By byNavigateTheKC       				= By.xpath("//h6[text()='NAVIGATE THE KC']");
	public static By byAboutTheKC        				= By.xpath("//h6[text()='ABOUT THE KC']");
	
	
	
}
