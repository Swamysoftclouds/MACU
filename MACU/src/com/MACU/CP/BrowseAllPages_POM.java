package com.MACU.CP;

import org.openqa.selenium.By;

import com.MACU.framework.BaseClass;

public class BrowseAllPages_POM extends BaseClass{

//MACU_CP 
	public static By bySearchFieldXpath                   = By.name("kw");
	public static By byHighlightSearchResultXpath         = By.xpath("//div[@id='rn_SearchResult2_9']//table//tr//div[@class='rn_SearchResultExcerpt']//span[@class='rn_SnippetLevel3']");
	public static By byTotalResultCountXpath              = By.xpath("//h5[@class='rn_count-result']");
	public static By byScrollResultXpath                  = By.xpath("(//div[@id='rn_SearchResult2_9']//table//tr)[3]");
	public static By byScrollResultMiddleXpath            = By.xpath("(//div[@id='rn_SearchResult2_9']//table//tr)[7]");
	public static By byClickBrowseAllPagesXpath           = By.xpath("//a[text()='browse all PAGES']");
	public static By byClickVIEWAToZXpath                 = By.xpath("//a[text()='VIEW A-Z INDEX']");
	public static By byVerifyNopageFoundXpath             = By.xpath("//h2[text()='No page found']");
	public static By byArticleNameXpath                   = By.xpath("//a[text()]");
// Filter By Product
	public static By byClickProductNameBusinessXpath      = By.xpath("//a[text()='Business Accounts']");
	public static By byClickProductNameEmployeeXpath      = By.xpath("//a[text()='Employee Experience']");
	public static By byClickProductNameOperationsXpath    = By.xpath("//a[text()='Operations']");
	public static By byClickProductPersonalAccountsXpath  = By.xpath("//a[text()='Personal Accounts']");
	public static By byClickProductServicesXpath          = By.xpath("//a[text()='Services']");
	public static By byClickProductTechnologyXpath        = By.xpath("//a[text()='Technology']");
	
	public static By byClickBrowserAllPagesXpath          = By.xpath("//a[text()='browse all PAGES']");
	public static By byAllPagesXpath                      = By.xpath("//h1[text()='All Pages']");
	public static By byViewAToZXpath                      = By.xpath("//a[text()='VIEW A-Z INDEX']");
	public static By byFilterProductXpath                 = By.xpath("//label[text()='FILTER BY PRODUCT']");
	public static By byTitleXpath                         = By.xpath("//label[text()='TITLE']");
	public static By byPublishDateXpath                   = By.xpath("//label[@class='publish-date float-right']");
	public static By byBusinessXpath                      = By.xpath("//a[text()='Business Accounts']");
	public static By byBusinessLoansXpath                 = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Business Loans']");
	public static By byBusinessLoansAXpath                = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Business Loans']");

//---FILTER BY CATEGORY List [Kept for reference]
	public static By byBusinessModificationsXpath         = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Business Modifications']");
	public static By byBusinessModificationsAXpath        = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Business Modifications']");
	
	public static By byBusinessServicesXpath              = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Business Services']");
	public static By byBusinessServicesAXpath             = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Business Services']");
	
	public static By byBusinessShareTypesXpath            = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Business Share Types']");
	public static By byBusinessShareTypesAXpath           = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Business Share Types']");
	
	public static By byBusinessTransactionsXpath          = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Business Transactions']");
	public static By byBusinessTransactionsAXpath         = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Business Transactions']");
	
	public static By byBusinessTypesXpath                 = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Business Types']");
	public static By byBusinessTypesAXpath                = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Business Types']");
	
	public static By byImproveXpath                       = By.xpath("//button[contains(text(),'improve')]");
	public static By byEmployeeExperienceXpath            = By.xpath("//a[text()='Employee Experience']");
	public static By byCareerPerformanceXpath             = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Career & Performance']");
	public static By byCareerAndPerformanceAXpath         = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Career & Performance']");
	
	public static By byEmployeeHandbookXpath              = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Employee Handbook']");
	public static By byEmployeeHandbookAXpath             = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Employee Handbook']");
	
	public static By byEmployeeOperationsXpath            = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Employee Operations']");
	public static By byEmployeeOperationsAXpath           = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Employee Operations']");
	
	public static By byEmployeePersonalInfoXpath          = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Employee Personal Info']");
	public static By byEmployeePersonalInfoAXpath         = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Employee Personal Info']");
	
	public static By byGrowUniversityXpath                = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Grow University']");
	public static By byGrowUniversityAXpath               = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Grow University']");
	
	public static By byMACandTannerCommonAreasXpath       = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='MAC & Tanner Common Areas']");
	public static By byMACTannerCommonAreasAXpath         = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='MAC & Tanner Common Areas']");
	
	public static By byManagerOperationsXpath             = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Manager Operations']");
	public static By byManagerOperationsAXpath            = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Manager Operations']");
	
	public static By byMeetingAndEventSpacesXpath         = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Meeting & Event Spaces']");
	public static By byMeetingEventSpacesAXpath           = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Meeting & Event Spaces']");
	
	public static By byMemberServiceSalesXpath            = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Member Service Sales']");
	public static By byMemberServiceSalesAXpath           = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Member Service Sales']");
	
	public static By byTrainingXpath                      = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Training']");
	public static By byTrainingAXpath                     = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Training']");
	
	public static By byTransportationXpath                = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Transportation']");
	public static By byTransportationAXpath               = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Transportation']");
	
	public static By byOperationsXpath                    = By.xpath("//a[text()='Operations']");
    public static By byActsRegulationsXpath               = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Acts & Regulations']");
    public static By byActsRegulationsAXpath              = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Acts & Regulations']");
    
	public static By byAlarmsKeysLocksXpath               = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Alarms, Keys & Locks']");
	public static By byAlarmsKeysLocksAXpath              = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Alarms, Keys & Locks']");
	
	public static By byAuthorizationLimitsXpath           = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Authorization & Limits']");
	public static By byAuthorizationLimitsAXpath          = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Authorization & Limits']");
	
	public static By byBankSecrecyActXpath                = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Bank Secrecy Act']");
	public static By byBankSecrecyActAXpath               = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Bank Secrecy Act']");
	
	public static By byBranchCertificationXpath           = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Branch Certification']");
	public static By byBranchCertificationAXpath          = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Branch Certification']");
	
	public static By byBuildingAccessXpath                = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Building Access']");
	public static By byBuildingAccessAXpath               = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Building Access']");
	
	public static By byBusinessContinuityXpath            = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Business Continuity']");
	public static By byBusinessContinuityAXpath           = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Business Continuity']");
	
	public static By byCardsontheSpotXpath                = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Cards on the Spot (COTS)']");
	public static By byCardsontheSpotAXpath               = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Cards on the Spot (COTS)']");
	
	public static By byCorrectableLoanReviewXpath         = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Correctable Loan Review']");
	public static By byCorrectableLoanReviewAXpath        = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Correctable Loan Review']");
	
	public static By byFraudDisputesXpath                 = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Fraud & Disputes']");
	public static By byFraudDisputesAXpath                = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Fraud & Disputes']");
	
	public static By byIdentificationXpath                = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Identification']");
	public static By byIdentificationAXpath               = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Identification']");
	
	public static By byIncidentsReportsXpath              = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Incidents Reports']");
	public static By byIncidentsReportsAXpath             = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Incidents Reports']");
	
	public static By byLoanAuditXpath                     = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Loan Audit']");
	public static By byLoanAuditAXpath                    = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Loan Audit']");
	
	public static By byMortgageComplianceXpath            = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Mortgage Compliance']");
	public static By byMortgageComplianceAXpath           = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Mortgage Compliance']");
	
	public static By byMortgageComputerApplicationsXpath  = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Mortgage Computer Applications']");
	public static By byMortgageComputerApplicationsAXpath = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Mortgage Computer Applications']");
	
	public static By byMortgageProgramsGuidelinesXpath    = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Mortgage Programs & Guidelines']");
	public static By byMortgageProgramsGuidelinesAXpath   = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Mortgage Programs & Guidelines']");
	
	public static By byMortgageResourcesXpath             = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Mortgage Resources']");
	public static By byMortgageResourcesAXpath            = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Mortgage Resources']");
	
	public static By byMortgageServicesProcessesInfoXpath = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Mortgage Services Processes & Information']");
	public static By byMortgageServicesProcessesInfoAXpath= By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Mortgage Services Processes & Information']");
	
	public static By byMortgageUnderwritingQAXpath        = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Mortgage Underwriting Q & A']");
	public static By byMortgageUnderwritingQAAXpath       = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Mortgage Underwriting Q & A']");
	
	public static By byNCUAInsuranceXpath                 = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='NCUA Insurance']");
	public static By byNCUAInsuranceAXpath                = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='NCUA Insurance']");
	
	public static By byNMLSXpath                          = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='NMLS']");
	public static By byNMLSAXpath                         = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='NMLS']");
	
	public static By byOfficeofForeignAssetControlXpath   = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Office of Foreign Asset Control (OFAC)']");
	public static By byOfficeofForeignAssetControlAXpath  = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Office of Foreign Asset Control (OFAC)']");
	
	public static By byRetentionXpath                     = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Retention']");
	public static By byRetentionAXpath                    = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Retention']");
	
	public static By bySecurityXpath                      = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Security']");
	public static By bySecurityAXpath                     = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Security']");
	
	public static By byWorkSpacesXpath                    = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Work Spaces']");
	public static By byWorkSpacesAXpath                   = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Work Spaces']");
	
	
	public static By byPersonalAccountsXpath              = By.xpath("//a[text()='Personal Accounts']");
	public static By byAccountsTypesXpath                 = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Accounts Types']");
	public static By byAccountsTypesAXpath                = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Accounts Types']");
	
	public static By byMemberLifeEventsXpath              = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Member Life Events']");
	public static By byMemberLifeEventsAXpath             = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Member Life Events']");
	
	public static By byPersonalLoansXpath                 = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Personal Loans']");
	public static By byPersonalLoansAXpath                = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Personal Loans']");
	
	public static By byServicesPAXpath                    = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Services']");
	public static By byServicesPAAXpath                     = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Services']");
	
	public static By byShareTypesXpath                    = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Share Types']");
	public static By byShareTypesAXpath                   = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Share Types']");
	
	public static By byTransactionsXpath                  = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Transactions']");
	public static By byTransactionsAXpath                 = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Transactions']");
	
	
	public static By byServicesXpath                      = By.xpath("//a[text()='Services']");
	public static By byCardsontheSpotCOTSXpath            = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Cards on the Spot (COTS)']");
	public static By byCardsontheSpotCOTSAXpath           = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Cards on the Spot (COTS)']");
	
	public static By byFinancialEducationXpath            = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Financial Education']");
	public static By byFinancialEducationAXpath           = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Financial Education']");
	
	public static By byGreenPathXpath                     = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='GreenPath']");
	public static By byGreenPathAXpath                    = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='GreenPath']");
	
	public static By byIDProtectXpath                     = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='ID Protect']");
	public static By byIDProtectAXpath                    = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='ID Protect']");
	
	public static By byInsuranceXpath                     = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Insurance']");
	public static By byInsuranceAXpath                    = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Insurance']");
	
	public static By byInvestmentServicesXpath            = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Investment Services']");
	public static By byInvestmentServicesAXpath           = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Investment Services']");
	
	public static By byLanguageInterpretationXpath        = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Language Interpretation']");
	public static By byLanguageInterpretationAXpath       = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Language Interpretation']");
	
	public static By byLoanProtectionXpath                = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Loan Protection']");
	public static By byLoanProtectionAXpath               = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Loan Protection']");
	
	public static By byMedallionGuaranteeXpath            = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Medallion Guarantee']");
	public static By byMedallionGuaranteeAXpath           = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Medallion Guarantee']");
	
	public static By byMySelectRewardsXpath               = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='MySelect Rewards']");
	public static By byMySelectRewardsAXpath              = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='MySelect Rewards']");
	
	public static By byNotaryXpath                        = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Notary']");
	public static By byNotaryAXpath                       = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Notary']");
	
	public static By byOnlineAppointmentConciergeXpath    = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Online Appointment Concierge']");
	public static By byOnlineAppointmentConciergeAXpath   = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Online Appointment Concierge']");
	
	public static By byOnlineBranchMobileAppXpath         = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Online Branch & Mobile App']");
	public static By byOnlineBranchMobileAppAXpath        = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Online Branch & Mobile App']");
	
	public static By bySEGXpath                           = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='SEG']");
	public static By bySEGAXpath                          = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='SEG']");
	
	public static By bySharedBranchXpath                  = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Shared Branch']");
	public static By bySharedBranchAXpath                 = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Shared Branch']");
	
	public static By bySignatureGuaranteeXpath            = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Signature Guarantee']");
	public static By bySignatureGuaranteeAXpath           = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Signature Guarantee']");
	
	public static By byVehicleHistoryReportXpath          = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Vehicle History Report']");
	public static By byVehicleHistoryReportAXpath         = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Vehicle History Report']");
	
	public static By byVisaAdvanceXpath                   = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Visa Advance']");
	public static By byVisaAdvanceAXpath                  = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Visa Advance']");
	
	public static By byVisaGiftCardsXpath                 = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Visa Gift Cards']");
	public static By byVisaGiftCardsAXpath                = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Visa Gift Cards']");
	
	public static By byTechnologyXpath                    = By.xpath("//a[text()='Technology']");
	public static By byApplicationsXpath                  = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Applications']");
	public static By byApplicationsAXpath                 = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Applications']");
	
	public static By byDevicesXpath                       = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Devices']");
	public static By byDevicesAXpath                      = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Devices']");
	
	public static By byOffice365Xpath                     = By.xpath("//div[@id='category']//following-sibling::ul//a[text()='Office 365']");
	public static By byOffice365AXpath                    = By.xpath("//ul[@class='all_pages_list']//li//div//p//a[text()='Office 365']");
//---------------------------------------------------------------------------------------------------------------------------------------------------	
	
	public static By byFilterCategoryXpath                = By.xpath("//label[text()='FILTER BY CATEGORY']");
	public static By byIndexCountXpath                    = By.xpath("//h2[@class='index-count']");
	public static By bySearchColumnXpath                  = By.xpath("//label[text()='Search the Knowledge Center']");
	public static By bySearchColumnINputXpath             = By.xpath("//input[@type='search']");
	
	public static By byClickSearchResultVXpath            = By.xpath("(//ul[@aria-label='Suggested Search']//li//li)[1]");
	public static By byClickBrowseAllAPagesXpath          = By.xpath("//div[@id='rn_PageTitle']//a[text()='BROWSE ALL PAGES']");
	public static By byClickKnowledgeCenterXpath          = By.xpath("//a[text()='Knowledge Center']");
	public static By byHighlightArticleXpath              = By.xpath("(//div[@class='rn_A_ZIndex']//div[@class='index-content']//a)[1]");
		
	public static By byArticleTitleXpath                  = By.xpath("(//ul[@class='all_pages_list']//li//div//p//a)[1]");
		
//MACU_BUI
	public static By byHomeNavigationXpath                = By.xpath("(//span[@class='oj-button-icon oj-start navigator-icon oj-button-icon oj-start'])[1]");
	public static By byClickHomeButtonXpath               = By.xpath("(//div[text()='Home']//a)");
	public static By byClickContentButtonXpath            = By.xpath("(//div[@class='navigation-item']//span[text()='Contacts'])[1]");
	public static By byEnterUserNameXpath                 = By.xpath("//input[@automationid='Name']");
	public static By byEnterUserEmailIDXpath              = By.xpath("//input[@automationid='All Email Addresses']");
	public static By byClickSearchButtonXpath             = By.xpath("//span[text()='Search']");
	public static By byClickSearchResultXpath             = By.xpath("//span[text()='User']");	
	public static By byClickSummaryButtonXpath            = By.xpath("//span[text()='Summary']");
	public static By byClickAddButtonXpath                = By.xpath("//span[text()='Add']");
	public static By byClickEditButtonXpath               = By.xpath("//span[text()='Edit']");
	public static By bySelectExistingRolepath             = By.xpath("//div[@id='SlaViewerViewModel']//div[@class='oj-dialog-content oj-dialog-default-content']//div[@class='sla-viewer']//div[@class='oj-flex-bar']//table[@automationid='slaInstances']//tbody//tr");
	public static By byClickAddNewButtonXpath             = By.xpath("//div[@id='SlaViewerViewModel']//div[@class='oj-dialog-content oj-dialog-default-content']//div[@class='sla-viewer']//button//span[text()='Add New']");
	public static By byClickDisableButtonXpath            = By.xpath("//div[@id='SlaViewerViewModel']//div[@class='oj-dialog-content oj-dialog-default-content']//div[@class='sla-viewer']//button//span[text()='Disable']");
	public static By byClickDisableOKButtonXpath          = By.xpath("//div[@class='oj-flex oj-sm-flex-direction-column dialogNoWrap oj-dialog oj-component dialogBody oj-component-initnode oj-draggable']//span[text()='OK']");
	public static By byClickSLADropDownButtonXpath        = By.xpath("//div[@id='AddSlaInstanceDialogViewModel']//div[@class='menu-container']//input[@class='select-box-input']");
	public static By byClickSLADropDownOKButtonXpath      = By.xpath("//div[@id='AddSlaInstanceDialogViewModel']//div[@class='oj-dialog-footer dialogFooter']//span//button//span[text()='OK']");
	public static By byClickUserProfileOKButtonXpath      = By.xpath("//div[@id='SlaViewerViewModel']//div[@class='oj-dialog-footer dialogFooter']//span//button//span[text()='OK']");
	public static By byClickUserProfileSaveAndCloseXpath  = By.xpath("//div[@class='ws-toolbar-button-image bui-icon save-close-icon fa-lg']");
	public static By byClickContactsCloseButtonXpath      = By.xpath("//a[@class='closeButton']//i");
	public static By byClickUserProfileXpath              = By.xpath("//span[@id='initialsText']");
	public static By byClickUserProfileSignOutXpath       = By.xpath("//a//span[text()='Sign Out']");
	public static By byClickAppClickHereXpath             = By.xpath("//a[text()='Click here']");
	
}
