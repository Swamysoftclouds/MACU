package com.MACU.framework;

import java.io.FileReader;
import java.io.Reader;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

//YAML class is used to call the config file 

public class YamlWrapper_BUI {
	
	public final static String TEST_EXECUTION_CONFIG_FILE_PATH = "./resources/config/test_execution/config_BUI.yaml";
	
	public static Map<?,?> yamlMaps = readTestExecutionConfigurationFile() ;
	
	
	public static String getBrowserName() {
		return (String) yamlMaps.get("browser");
	}
 
	public static String getBaseUrlforBUI() {
		return (String) yamlMaps.get("urlforbui");
	}
	public static String getBUIUsername() {
		return (String) yamlMaps.get("buiusername");
	}
	public static String getBUIPassword() {
		return (String) yamlMaps.get("buipassword");
	}
	public static Integer getWebDriverWaitTime() {
		return (Integer) yamlMaps.get("webdriverWaitTime");
	}
	public static String getReplayForFeedBack() {
		return (String) yamlMaps.get("replayforFeedBack");
	}
	public static String getloginID() {
		return (String) yamlMaps.get("loginID");
	}
// BUI Variables
	
	public static String getThumbsDownComments() {
		return (String) yamlMaps.get("thumbsDownComments");
	}
	public static String getAddSummary() {
		return (String) yamlMaps.get("addSummary");
	}
	public static String getAddKeyword() {
		return (String) yamlMaps.get("addKeyword");
	}
	public static String getFeedbackReportSendDate() {
		return (String) yamlMaps.get("feedbackReportSendDate");
	}

//--- Swamy's changes
	public static String gettitle() {
		return (String) yamlMaps.get("title");
	}
	public static String getkeywords() {
		return (String) yamlMaps.get("keywords");
	}
	public static String getcontentinfo() {
		return (String) yamlMaps.get("contentinfo");
	}
	public static String getcontent() {
		return (String) yamlMaps.get("content");
	}
	public static String getId() {
		return (String) yamlMaps.get("Id");
	}
	public static String getLink() {
		return (String) yamlMaps.get("Link");
	}
	public static String getBasicInfo() {
		return (String) yamlMaps.get("BasicInfo");
	}	
	public static String getBasicContactInfo() {
		return (String) yamlMaps.get("BasicContactInfo");
	}
	public static String getSteps() {
		return (String) yamlMaps.get("Steps");
	}
	public static String getStepsContactInfo() {
		return (String) yamlMaps.get("StepsContactInfo");
	}
	public static String getForms_Resources() {
		return (String) yamlMaps.get("Forms_Resources");
	}
	public static String getForms_Resources_Content() {
		return (String) yamlMaps.get("Forms_Resources_Content");
	}
	public static String getSalesConnections() {
		return (String) yamlMaps.get("SalesConnections");
	}
	public static String getSalesConnectionsContent() {
		return (String) yamlMaps.get("SalesConnectionsContent");
	}public static String getAnswerType() {
		return (String) yamlMaps.get("AnswerType");
	}
	public static String getEditTitle() {
		return (String) yamlMaps.get("EditTitle");
	}
	public static String getEditkeywords() {
		return (String) yamlMaps.get("Editkeywords");
	}
	public static String getEditReason() {
		return (String) yamlMaps.get("EditReason");
	}
	public static String getcallouts() {
		return (String) yamlMaps.get("callouts");
	}
	
	
	
// YAML Methods
	public static String getTestExecutionConfigurationFileValue(String key) {
		return (String) yamlMaps.get(key);
	}
	public static String getValueFromYAMLAsString(String key) {
		return (String) yamlMaps.get(key);
	}
	
	public static Integer getValueFromYAMLAsInteger(String key) {
		return (Integer) yamlMaps.get(key);
	}
	
	public static Object getValueFromYAMLAsObject(String key) {
		return yamlMaps.get(key);
	}
	
	private static Map<?, ?> readTestExecutionConfigurationFile() {
		try {
			Yaml yaml = new Yaml();
			Reader yamlFile = new FileReader(TEST_EXECUTION_CONFIG_FILE_PATH);
			return (Map<?,?>) yaml.load(yamlFile);
		} catch (Exception e) {
			GlobalVariables.log.error(e);
			return null;
		}
	}

}
