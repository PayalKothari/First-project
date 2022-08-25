package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
	
	FileInputStream fis = null;
	//1. why we need utility------read property file
	//2.whats are inputs------key
	//3.what will be output----value
	
	public String readProperty(String key){
		Properties prop= new Properties();
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (prop.getProperty(key)!=null)
		return prop.getProperty(key);
		else
			return "property value not found for "+key;	
	}

}
