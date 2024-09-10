package com.MACU.BUI;

import org.openqa.selenium.By;

import com.MACU.framework.BaseClass;

public class CallOuts_POM extends BaseClass{
	public static By byNavigationButtonID                     	= By.id("navigationSetBtn");
	public static By byConfigurationXpath				        = By.xpath("//div[@automationid='Configuration']");
	public static By byClickServiceButtonXpath                  = By.xpath("//div[text()='Service']");
	public static By byClickKnowledgeAdvancedButtonXpath        = By.xpath("//div[text()='Knowledge Advanced']");
	public static By byConfigurationServiceXpath				= By.xpath("//div[@automationid='Configuration_Service']");
	public static By byKnowledgeAdvancedXpath					= By.xpath("//div[@automationid='Configuration_Service_Knowledge Advanced']");
	public static By byAuthoringXpath							= By.xpath("//div[@automationid='Configuration_Service_Knowledge Advanced_Authoring']//span[text()='Authoring']");
	public static By byAuthoringPageXpath						= By.xpath("//div[@class='bodyDivRN']//span[text()='Authoring']");
	public static By byContentTabXpath							= By.xpath("//div[@class='bodyDivRN']//li[@testidentifier='MainNavBar_Content']//a");
	public static By byAddArticle								= By.xpath("//a[@testidentifier='ContentNavBar_Add_Technology'][normalize-space()='Add']");
	public static By byAddSummary								= By.xpath("//input[@testidentifier='Content_ContentType_Add_SUMMARY']");
	public static By byAddKeyword								= By.xpath("//input[@testidentifier='Content_ContentType_Add_KEYWORD']");
	
//---------------Content Sections can be used accordingly
	public static By byContactInfoSourceButton				= By.xpath("(//span[text()='Source'])[4]");
	public static By byBasicContactInfoButton				= By.xpath("//span[text()='Basic Info']");
	
	public static By byBasicContactInfoSourceButton				= By.xpath("(//span[text()='Source'])[5]");
	public static By byBasicContactInfoHTMLText					= By.xpath("//textarea[contains(@title,'Rich Text Editor')]");
	public static By byBasicContentInfoSourceButton				= By.xpath("(//span[text()='Source'])[5]");
	public static By byBasicContentInfoHTMLText					= By.xpath("//textarea[contains(@title,'Rich Text Editor')]");
	public static By byStepsContactInfoSourceButton				= By.xpath("(//span[text()='Source'])[7]");
	public static By byStepsContactInfoHTMLText					= By.xpath("//textarea[contains(@title,'Rich Text Editor')]");
	public static By byStepsContentInfoSourceButton				= By.xpath("(//span[text()='Source'])[8]");
	public static By byStepsContentInfoHTMLText					= By.xpath("//textarea[contains(@title,'Rich Text Editor')]");
	public static By byFormsContactInfoSourceButton				= By.xpath("(//span[text()='Source'])[9]");
	public static By byFormsContactInfoHTMLText					= By.xpath("//textarea[contains(@title,'Rich Text Editor')]");
	public static By byFormsContentInfoSourceButton				= By.xpath("(//span[text()='Source'])[10]");
	public static By byFormsContentInfoHTMLText					= By.xpath("//textarea[contains(@title,'Rich Text Editor')]");
//--------	
	public static By byRepositorySelection						= By.xpath("//td[@class='sectiontitle leftAlignment'][contains(text(),'Repository View Selection')]");
	public static By byMacuCheckbox								= By.xpath("//input[@type='checkbox'][@testidentifier='ContentAttributes_RepoViewSelection']");
	public static By byPublishingOptions						= By.xpath("//td[@class='sectiontitle leftAlignment'][contains(text(),'Publishing Options')]");	
	public static By bySaveDocument								= By.xpath("//a[text()='Save Document']");
		
//-----Article Approval
	public static By byWorkFlowSection							= By.xpath("//span[text()='Workflow']");				
	public static By byApprove									= By.xpath("//a[text()='Approve']");
	
//--------------- CP
	public static By bySearchArticleTextBox					= By.xpath("//input[@type='search']");
	public static By byContent									= By.xpath("//div[@class='rn_SchemaAttribute']");
	public static By byNote										= By.xpath("//div[@class='panel panel-default panel_note']");
	public static By byTip										= By.xpath("//div[@class='panel panel-default panel_tip']");
	public static By byUpdated								    = By.xpath("//div[@class='panel panel-default panel_updated']");
	public static By byVideo									= By.xpath("//div[@class='panel panel-default panel_video']");
	

}
