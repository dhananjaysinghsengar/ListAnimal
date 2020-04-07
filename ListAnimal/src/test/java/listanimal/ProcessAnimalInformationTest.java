package listanimal;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import services.ConsumePeopleInformation;
import services.ProcessAnimalInformation;
import utility.LoadProperty;

public class ProcessAnimalInformationTest {

	@Test
	public void givenServiceUrlIsIncorrect_whenPeopleInfoIsRetrieved_thenCatListForMaleOwnerIsRetrieved_1()
			throws ClientProtocolException, IOException {

		LoadProperty configProperty = new LoadProperty();
		String targetUrl = configProperty.retrieveProperty("peopleurlpath");

		String jsonArr = ConsumePeopleInformation.getPeopleInformation(targetUrl);
		ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList("Garfield", "Tom", "Max", "Jim"));

		assertEquals(expectedList, ProcessAnimalInformation.extractCatInformation(jsonArr, "Male", "Cat"));

	}

	@Test
	public void givenServiceUrlIsIncorrect_whenPeopleInfoIsRetrieved_thenCatListForMaleOwnerIsRetrieved_2()
			throws ClientProtocolException, IOException {

		LoadProperty configProperty = new LoadProperty();
		String targetUrl = configProperty.retrieveProperty("peopleurlpath");

		String jsonArr = ConsumePeopleInformation.getPeopleInformation(targetUrl);
		ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList("Garfield", "Tom", "Max", "Jim"));

		assertEquals(expectedList, ProcessAnimalInformation.extractCatInformation(jsonArr, "MaLe", "Cat"));

	}

	@Test
	public void givenServiceUrlIsIncorrect_whenPeopleInfoIsRetrieved_thenCatListForMaleOwnerIsRetrieved_3()
			throws ClientProtocolException, IOException {

		LoadProperty configProperty = new LoadProperty();
		String targetUrl = configProperty.retrieveProperty("peopleurlpath");

		String jsonArr = ConsumePeopleInformation.getPeopleInformation(targetUrl);
		ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList("Garfield", "Tom", "Max", "Jim"));

		assertEquals(expectedList, ProcessAnimalInformation.extractCatInformation(jsonArr, "MALE", "Cat"));

	}

	@Test
	public void givenServiceUrlIsIncorrect_whenPeopleInfoIsRetrieved_thenCatListForMaleOwnerIsRetrieved_4()
			throws ClientProtocolException, IOException {

		LoadProperty configProperty = new LoadProperty();
		String targetUrl = configProperty.retrieveProperty("peopleurlpath");

		String jsonArr = ConsumePeopleInformation.getPeopleInformation(targetUrl);
		ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList("Garfield", "Tom", "Max", "Jim"));

		assertEquals(expectedList, ProcessAnimalInformation.extractCatInformation(jsonArr, "mALE", "Cat"));

	}

	@Test
	public void givenServiceUrlIsIncorrect_whenPeopleInfoIsRetrieved_thenCatListForFemaleOwnerIsRetrieved_1()
			throws ClientProtocolException, IOException {

		LoadProperty configProperty = new LoadProperty();
		String targetUrl = configProperty.retrieveProperty("peopleurlpath");

		String jsonArr = ConsumePeopleInformation.getPeopleInformation(targetUrl);
		ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList("Garfield", "Tabby", "Simba"));

		assertEquals(expectedList, ProcessAnimalInformation.extractCatInformation(jsonArr, "Female", "Cat"));

	}

	@Test
	public void givenServiceUrlIsIncorrect_whenPeopleInfoIsRetrieved_thenCatListForFemaleOwnerIsRetrieved_2()
			throws ClientProtocolException, IOException {

		LoadProperty configProperty = new LoadProperty();
		String targetUrl = configProperty.retrieveProperty("peopleurlpath");

		String jsonArr = ConsumePeopleInformation.getPeopleInformation(targetUrl);
		ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList("Garfield", "Tabby", "Simba"));

		assertEquals(expectedList, ProcessAnimalInformation.extractCatInformation(jsonArr, "female", "Cat"));

	}

	@Test
	public void givenServiceUrlIsIncorrect_whenPeopleInfoIsRetrieved_thenCatListForFemaleOwnerIsRetrieved_3()
			throws ClientProtocolException, IOException {

		LoadProperty configProperty = new LoadProperty();
		String targetUrl = configProperty.retrieveProperty("peopleurlpath");

		String jsonArr = ConsumePeopleInformation.getPeopleInformation(targetUrl);
		ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList("Garfield", "Tabby", "Simba"));

		assertEquals(expectedList, ProcessAnimalInformation.extractCatInformation(jsonArr, "fEMALE", "Cat"));

	}

	@Test
	public void givenServiceUrlIsIncorrect_whenPeopleInfoIsRetrieved_thenCatListForFemaleOwnerIsRetrieved_4()
			throws ClientProtocolException, IOException {

		LoadProperty configProperty = new LoadProperty();
		String targetUrl = configProperty.retrieveProperty("peopleurlpath");

		String jsonArr = ConsumePeopleInformation.getPeopleInformation(targetUrl);
		ArrayList<String> expectedList = new ArrayList<String>(Arrays.asList("Garfield", "Tabby", "Simba"));

		assertEquals(expectedList, ProcessAnimalInformation.extractCatInformation(jsonArr, "FEMALE", "Cat"));

	}

}
