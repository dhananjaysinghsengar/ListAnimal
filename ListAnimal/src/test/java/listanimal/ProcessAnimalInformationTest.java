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
		ArrayList<String> expectedList = new ArrayList<String>( 
	            Arrays.asList("Garfield", "Tom", "Max", "Jim"));
		// assert statements
		assertEquals(expectedList, ProcessAnimalInformation.extractCatInformation(jsonArr, "Male"));

	}
	
	@Test
	public void givenServiceUrlIsIncorrect_whenPeopleInfoIsRetrieved_thenCatListForMaleOwnerIsRetrieved_2()
			throws ClientProtocolException, IOException {

		LoadProperty configProperty = new LoadProperty();
		String targetUrl = configProperty.retrieveProperty("peopleurlpath");
	
		String jsonArr = ConsumePeopleInformation.getPeopleInformation(targetUrl);
		ArrayList<String> expectedList = new ArrayList<String>( 
	            Arrays.asList("Garfield", "Tom", "Max", "Jim"));
		// assert statements
		assertEquals(expectedList, ProcessAnimalInformation.extractCatInformation(jsonArr, "MaLe"));

	}
	
	@Test
	public void givenServiceUrlIsIncorrect_whenPeopleInfoIsRetrieved_thenCatListForMaleOwnerIsRetrieved_3()
			throws ClientProtocolException, IOException {

		LoadProperty configProperty = new LoadProperty();
		String targetUrl = configProperty.retrieveProperty("peopleurlpath");
	
		String jsonArr = ConsumePeopleInformation.getPeopleInformation(targetUrl);
		ArrayList<String> expectedList = new ArrayList<String>( 
	            Arrays.asList("Garfield", "Tom", "Max", "Jim"));
		// assert statements
		assertEquals(expectedList, ProcessAnimalInformation.extractCatInformation(jsonArr, "MALE"));

	}
	
	@Test
	public void givenServiceUrlIsIncorrect_whenPeopleInfoIsRetrieved_thenCatListForMaleOwnerIsRetrieved_4()
			throws ClientProtocolException, IOException {

		LoadProperty configProperty = new LoadProperty();
		String targetUrl = configProperty.retrieveProperty("peopleurlpath");
	
		String jsonArr = ConsumePeopleInformation.getPeopleInformation(targetUrl);
		ArrayList<String> expectedList = new ArrayList<String>( 
	            Arrays.asList("Garfield", "Tom", "Max", "Jim"));
		// assert statements
		assertEquals(expectedList, ProcessAnimalInformation.extractCatInformation(jsonArr, "mALE"));

	}
	
	@Test
	public void givenServiceUrlIsIncorrect_whenPeopleInfoIsRetrieved_thenCatListForFemaleOwnerIsRetrieved_1()
			throws ClientProtocolException, IOException {

		LoadProperty configProperty = new LoadProperty();
		String targetUrl = configProperty.retrieveProperty("peopleurlpath");
	
		String jsonArr = ConsumePeopleInformation.getPeopleInformation(targetUrl);
		ArrayList<String> expectedList = new ArrayList<String>( 
	            Arrays.asList("Garfield", "Tabby", "Simba"));
		// assert statements
		assertEquals(expectedList, ProcessAnimalInformation.extractCatInformation(jsonArr, "Female"));

	}
	
	@Test
	public void givenServiceUrlIsIncorrect_whenPeopleInfoIsRetrieved_thenCatListForFemaleOwnerIsRetrieved_2()
			throws ClientProtocolException, IOException {

		LoadProperty configProperty = new LoadProperty();
		String targetUrl = configProperty.retrieveProperty("peopleurlpath");
	
		String jsonArr = ConsumePeopleInformation.getPeopleInformation(targetUrl);
		ArrayList<String> expectedList = new ArrayList<String>( 
	            Arrays.asList("Garfield", "Tabby", "Simba"));
		// assert statements
		assertEquals(expectedList, ProcessAnimalInformation.extractCatInformation(jsonArr, "female"));

	}
	
	@Test
	public void givenServiceUrlIsIncorrect_whenPeopleInfoIsRetrieved_thenCatListForFemaleOwnerIsRetrieved_3()
			throws ClientProtocolException, IOException {

		LoadProperty configProperty = new LoadProperty();
		String targetUrl = configProperty.retrieveProperty("peopleurlpath");
	
		String jsonArr = ConsumePeopleInformation.getPeopleInformation(targetUrl);
		ArrayList<String> expectedList = new ArrayList<String>( 
	            Arrays.asList("Garfield", "Tabby", "Simba"));
		// assert statements
		assertEquals(expectedList, ProcessAnimalInformation.extractCatInformation(jsonArr, "fEMALE"));

	}

	
	@Test
	public void givenServiceUrlIsIncorrect_whenPeopleInfoIsRetrieved_thenCatListForFemaleOwnerIsRetrieved_4()
			throws ClientProtocolException, IOException {

		LoadProperty configProperty = new LoadProperty();
		String targetUrl = configProperty.retrieveProperty("peopleurlpath");
	
		String jsonArr = ConsumePeopleInformation.getPeopleInformation(targetUrl);
		ArrayList<String> expectedList = new ArrayList<String>( 
	            Arrays.asList("Garfield", "Tabby", "Simba"));
		// assert statements
		assertEquals(expectedList, ProcessAnimalInformation.extractCatInformation(jsonArr, "FEMALE"));

	}
}
