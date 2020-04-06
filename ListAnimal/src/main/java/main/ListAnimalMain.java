package main;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.http.client.ClientProtocolException;

import services.ConsumePeopleInformation;
import services.ProcessAnimalInformation;
import utility.LoadProperty;

public class ListAnimalMain {

	public static void main(String[] args) throws ClientProtocolException, IOException {

		LoadProperty configProperty = new LoadProperty();
		String targetUrl = configProperty.retrieveProperty("peopleurlpath");

		String jsonArr = ConsumePeopleInformation.getPeopleInformation(targetUrl);

		// Logic to parse animal based on owner's gender
		ArrayList<String> listOfCat = new ArrayList<String>();
		if (!jsonArr.isEmpty()) {

			listOfCat = ProcessAnimalInformation.extractCatInformation(jsonArr, "Male");
			ProcessAnimalInformation.displayResult(listOfCat, "Male");

			listOfCat = ProcessAnimalInformation.extractCatInformation(jsonArr, "Female");
			ProcessAnimalInformation.displayResult(listOfCat, "Female");

		}

	}

}
