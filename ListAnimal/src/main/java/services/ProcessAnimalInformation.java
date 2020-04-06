package services;

import java.util.ArrayList;
import java.util.logging.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.People;
import model.Pet;

public class ProcessAnimalInformation {

	private final static Logger LOGGER = Logger.getLogger(ProcessAnimalInformation.class.getName());
	
	public static ArrayList<String> extractCatInformation(String jsonArray, String gender)
			throws JsonMappingException, JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();
		People[] people = mapper.readValue(jsonArray, People[].class);
		ArrayList<String> listOfCat = new ArrayList<String>();

		for (People tempObjPeople : people) {
			Pet[] objPet = tempObjPeople.getPets();
			if (tempObjPeople.getGender() != null && objPet != null) {
				for (Pet tempObjPet : objPet) {
					if (tempObjPet.getType() != null && tempObjPet.getType().equalsIgnoreCase("cat")
							&& tempObjPeople.getGender().equalsIgnoreCase(gender)) {

						listOfCat.add(tempObjPet.getName());

					}
				}
			}
		}
		return listOfCat;

	}

	// method to display the result
	public static void displayResult(ArrayList<String> listOfCat, String gender) {
		String temp = "";
		String finalList = "";
		
		  for (String str : listOfCat) { 
			  temp = str; finalList =
			  finalList.concat(temp).concat("\n\t\t"); }
		 
		LOGGER.info("\n\t" + gender + "\n\t\t" + finalList);
	}

}
