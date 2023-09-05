package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigu {

	Properties properties ;
	String path = "Config.properties";
	
	public ReadConfigu () throws Exception{  // This is not method, this constructor 
		
		properties = new Properties();
		FileInputStream fis = new FileInputStream(path);
		properties.load(fis);
	}
	
	//User Defined method
	public String getBrowser (){
		
		String value = properties.getProperty("browser");
		if(value!=null)
	return value;
		else 
			throw new RuntimeException("Url not found in coding file");
	
	}
	}

