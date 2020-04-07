package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Dhananjay Singh Sengar 
 * Utility class for general purpose function
 */
public class LoadProperty {

	/*
	 * Method has one string parameter. It loads config.properties file and return
	 * value of supplied key
	 */
	public String retrieveProperty(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("./src/main/resources/config.properties");
		prop.load(ip);
		return prop.getProperty(key);
	}

}
