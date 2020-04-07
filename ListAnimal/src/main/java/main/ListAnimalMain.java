package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.ClientProtocolException;
import org.apache.log4j.Logger;

import services.ConsumePeopleInformation;
import services.ProcessAnimalInformation;
import utility.LoadProperty;

/**
 * @author Dhananjay Singh Sengar Main class for Listing animals based on
 *         owner's gender
 */
public class ListAnimalMain {
	
	private final static Logger LOGGER = Logger.getLogger(ListAnimalMain.class.getName());
	
	//Main method and entry point for the application
	public static void main(String[] args) throws ClientProtocolException, IOException {

		// Load properties from config.properties file through LoadProperty class
		LoadProperty configProperty = new LoadProperty();
		String targetUrl = configProperty.retrieveProperty("peopleurlpath");

		// Invoke web service end point to retrieve people information
		String res = ConsumePeopleInformation.getPeopleInformation(targetUrl);

		// Process cat information by invoking extractCatInformation method and display
		// the result
		// by invoking displayResult method.
		// Both methods are in defined in ProcessAnimalInformation class
		List<String> listOfCat = new ArrayList<String>();
		if (!res.isEmpty()) {

			listOfCat = (List<String>) ProcessAnimalInformation.extractCatInformation(res, "Male", "Cat");
			ProcessAnimalInformation.displayResult(listOfCat, "Male");

			listOfCat = (List<String>) ProcessAnimalInformation.extractCatInformation(res, "Female", "Cat");
			ProcessAnimalInformation.displayResult(listOfCat, "Female");

		}else
		{
			LOGGER.info("Error received while reuesting web service :" + res);
		}

	}

}
