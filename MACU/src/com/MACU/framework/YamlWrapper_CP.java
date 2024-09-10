package com.MACU.framework;
import java.io.FileReader;
import java.io.Reader;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

//YAML class is used to call the config file [Navigate to resources folder >> config >> test_execution folder >> config_CP.yaml]

public class YamlWrapper_CP {
	public final static String TEST_EXECUTION_CONFIG_FILE_PATH = "./resources/config/test_execution/config_CP.yaml";
	//public final static String TEST_EXECUTION_CONFIG_FILE_PATH = "./resources/config/test_execution/config_BUI.yaml";
	
	public static Map<?,?> yamlMaps = readTestExecutionConfigurationFile() ;
	
// Browser>>URL>>LOGIN	
	public static String getBrowserName() {
		return (String) yamlMaps.get("browser");
	}
	public static String getBaseUrl() {
		return (String) yamlMaps.get("url");
	}
	public static String getCPUsername() {
		return (String) yamlMaps.get("username_cp");
	}
	public static String getCPPassword() {
		return (String) yamlMaps.get("password_cp");
	}
	public static String getBUIUsername() {
		return (String) yamlMaps.get("username_bui");
	}
	public static String getBUIPassword() {
		return (String) yamlMaps.get("password_bui");
	}
	public static Integer getWebDriverWaitTime() {
		return (Integer) yamlMaps.get("webdriverWaitTime");
	}
	public static String getsearchkeyword_search() {
		return (String) yamlMaps.get("keyword_search");
	}
	
// Customer Portal - Article Page Variables
	public static String getArticle() {
		return (String) yamlMaps.get("Article");
	}
	public static String getSearchArticle() {
		return (String) yamlMaps.get("Search_Article");
	}
	
	
	
	public static String getCovid19Article() {
		return (String) yamlMaps.get("covid19Article");
	}
	public static String getEmployeeName() {
		return (String) yamlMaps.get("employeeName");
	}
	public static String getHelpUsImproveComments() {
		return (String) yamlMaps.get("helpUsImproveComments");
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
