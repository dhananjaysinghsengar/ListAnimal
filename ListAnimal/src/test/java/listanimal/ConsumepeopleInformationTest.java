package listanimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import services.ConsumePeopleInformation;

public class ConsumepeopleInformationTest {

	

	@Test
	public void givenServiceUrlIsIncorrect_whenPeopleInfoIsNoRetrieved_then404IsReceived()
			throws ClientProtocolException, IOException {

		// assert statements
		assertEquals("404", ConsumePeopleInformation
				.getPeopleInformation("http://agl-developer-test.azurewebsites.net/peopl.json"));

	}

	
	@Test
	public void givenServiceUrlIsCorrect_whenPeopleInfoIsRetrieved_thenResponseIsReturned()
			throws ClientProtocolException, IOException {

		// assert statements
		assertNotNull(ConsumePeopleInformation
				.getPeopleInformation("http://agl-developer-test.azurewebsites.net/people.json"));

	}

}