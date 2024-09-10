package com.MACU.framework;

import org.openqa.selenium.By;

public class GlobalObjectRepository extends GlobalVariables {

	//----------TRYP-------------------	
		
//		Login Page CP
		public static By byCPUserIDTextFieldID      = By.id("rn_LoginForm_2_Username");
		public static By byCPPasswordTextFieldID    = By.id("rn_LoginForm_2_Password");
		public static By byCPSignInButtonID         = By.id("rn_LoginForm_2_Submit");

//		Login Page BUI
		public static By byBUIUserIDTextFieldID     = By.id("username");
		public static By byBUIPasswordTextFieldID   = By.id("password");
		public static By byBUILogInButtonID         = By.id("loginbutton");
		
	//  Account
//		public static By byAccountNameXpath    		= By.xpath("//tr[@class='xk7']/td[@title='Name']/following-sibling:: td/span/input");
		

	
	}
