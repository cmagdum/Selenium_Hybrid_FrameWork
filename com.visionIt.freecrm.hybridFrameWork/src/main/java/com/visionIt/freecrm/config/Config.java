package com.visionIt.freecrm.config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Config {
	
	public Config()
	{
		try
		{
			File fs=new File(".//Config//prop.properties");
			FileInputStream fis=new FileInputStream(fs);
			 Properties Prop = new Properties();
			Prop.load(fis);
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
