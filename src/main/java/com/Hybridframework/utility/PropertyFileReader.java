package com.Hybridframework.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	
	
	public static Properties property() throws IOException
	{
		Properties p=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\91933\\eclipse-workspace\\Hybridframework\\config.properties");
		p.load(file);
		return p;
		
	}

}
