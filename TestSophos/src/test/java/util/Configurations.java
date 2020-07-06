package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import lombok.Getter;

@Getter
public class Configurations {

	
	public static String driverGecko ;
	public static String driverChrome;
	public static String pathExcel;
	public static String pathHTML;
	public static String url;
	
	public  void CargarConfig()  throws Exception {
		
	Properties prop = new Properties();
	InputStream input = null;

	try {
		
		input = new FileInputStream("Config/config.properties");
		// load a properties file
		prop.load(input);
	    driverGecko =  (prop.getProperty("var_Gecko"));
		driverChrome = (prop.getProperty("var_Chrome"));
		pathExcel = (prop.getProperty("Path_Excel"));
		pathHTML = (prop.getProperty("pathHTML"));
		url = (prop.getProperty("urlpage"));
		
	
	} catch (IOException ex) {
		ex.printStackTrace();
    }
}
}
