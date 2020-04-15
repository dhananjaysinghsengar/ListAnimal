package services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.People;
import model.Pets;

/**
 * @author Dhananjay Singh Sengar Class responsible to perform business logic
 *         and Display formatted output on console.
 *
 */
public class ProcessAnimalInformation {

	static Logger logger = Logger.getLogger(ProcessAnimalInformation.class.getName());

	/*
	 * Method responsible for extracting cat information based on owner's gender.
	 * This is a generic method which list down animal information based on owner's
	 * gender Method parameters
	 * 
	 * @jsonArray json response in the form of string
	 * 
	 * @gender owner's gender
	 * 
	 * @animal animal category Return type A list collection of String object
	 * 
	 */
	public static List<String> extractCatInformation(String jsonArray, String gender, String animal)
			throws JsonMappingException, JsonProcessingException {

		List<String> listOfCat = new ArrayList<String>();

		// Object mapper to map json string to java object
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<List<People>> typeReference = new TypeReference<List<People>>() {
		};
		List<People> people = mapper.readValue(jsonArray, typeReference);

		// Parsing logic for listing cat information based on Owner's gender
		people.forEach((eachPeople) -> {

			if (eachPeople.getPets() != null && eachPeople.getGender() != null
					&& eachPeople.getGender().equalsIgnoreCase(gender)) {
				List<Pets> pet = eachPeople.getPets();
				pet.forEach((eachPet) -> {

					if (eachPet.getType() != null && eachPet.getType().equalsIgnoreCase(animal)) {
						listOfCat.add(eachPet.getName());

					}
				});

			}

		});
		return listOfCat;

	}

	/*
	 * A generic method responsible for displaying formatted output based on the
	 * supplied list of animals and gender Method parameters
	 * 
	 * @listOfCat list collection of animal
	 * 
	 * @gender Owner's gender
	 * 
	 */
	public static void displayResult(List<String> listOfCat, String gender) {
		String temp = "";
		String finalList = "";
		List<String> result = listOfCat.stream().sorted(
                Comparator.comparing(n->n.toString())).collect(Collectors.toList());

		for (String str : result) {
			temp = str;
			finalList = finalList.concat("- " + temp).concat("\n\t\t");
		}

		logger.info("\n\t" + gender + " -\n\t\t" + finalList);
	}

}
