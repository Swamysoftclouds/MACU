package com.MACU.framework;

public class MACU_Wrapper extends Selenium_Wrapper{
		public static void signIntoCP() throws Exception {
			signIntoCP(baseUrl);
		
		}
		public static void signIntoBUI() throws Exception {
			signIntoBUI(baseUrlforBUI);
		
		}

		public static void signIntoCP(String baseurl) throws Exception {
			try {
				enterURL(baseurl);
				hardWait(3);
				enterText(byCPUserIDTextFieldID, byCPusername);
				enterText(byCPPasswordTextFieldID, byCPpassword);
				hardWait(2);
				click(byCPSignInButtonID);
				
			} catch (Exception e) {
				log.error("Error in the signin process");
				e.printStackTrace();
			}
		}
		public static void signIntoBUI(String baseurl) throws Exception {
			try {
				enterURL(baseurl);
				hardWait(3);
				enterText(byBUIUserIDTextFieldID, byBUIusername);
				enterText(byBUIPasswordTextFieldID, byBUIpassword);
				hardWait(2);
				click(byBUILogInButtonID);
				
			} catch (Exception e) {
				log.error("Error in the loginin process");
				e.printStackTrace();
			}
		}
	}
