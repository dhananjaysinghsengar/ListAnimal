package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {

	public String retrieveProperty(String key) throws IOException {
		Properties prop=new Properties();
		FileInputStream ip = new FileInputStream("./src/main/resources/config.properties");
		prop.load(ip);
		return prop.getProperty(key);
	}
	
}
