package com.util;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseConfig {

	
		//getConfig return "value"
		
		public static String getConfig(String testData) throws Exception{
			
		String filePath = "./Environments/dev.properties";
		//file>fis class> stream
		FileInputStream fis = new FileInputStream(filePath);
		//read the value from the file
		Properties pro = new Properties();
		
		pro.load(fis);
		//read each value
		String applicationURL = pro.get(testData).toString();
		
		
		
		return applicationURL;
		}
		public static void main(String[] args) throws Exception {
			
		System.out.println(BaseConfig.getConfig("URL"));
		System.out.println(BaseConfig.getConfig("username"));
		System.out.println(BaseConfig.getConfig("password"));
		//System.out.println(BaseConfig.getConfig("finalsingIn "));
		}
		
	}

