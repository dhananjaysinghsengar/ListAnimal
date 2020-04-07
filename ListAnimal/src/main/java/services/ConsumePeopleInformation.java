package services;

import java.io.IOException;
//import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

/**
 * @author Dhananjay Singh Sengar 
 * Class specifically written to handle http
 * request. It can be extended for other HTTP methods.
 *
 */
public class ConsumePeopleInformation {

	static Logger logger = Logger.getLogger(ConsumePeopleInformation.class.getName());

	/*
	 * This method takes string parameter as an input which should be a URI supplied
	 * in the method argument. Method will return a json string which is a response
	 * to http GET request and will return error code in case of failed or rejected
	 * request.
	 */
	public static String getPeopleInformation(String targetUrl) throws ClientProtocolException, IOException {

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(targetUrl);
		HttpResponse response = client.execute(request);
		HttpEntity entity = response.getEntity();

		if (response.getStatusLine().getStatusCode() != 200) {

			return Integer.toString(response.getStatusLine().getStatusCode());

		} else if (entity != null) {
			String result = EntityUtils.toString(entity);
			logger.info("REST API response :" + result);
			return result;
		}

		return null;
	}
}
