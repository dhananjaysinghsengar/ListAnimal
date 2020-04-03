package services;

import java.io.IOException;
import java.util.logging.Logger;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class ConsumePeopleInformation {
	
	private final static Logger LOGGER = Logger.getLogger(ConsumePeopleInformation.class.getName());

	
	//Request method get with target URL as parameter
	public static String getPeopleInformation(String targetUrl) throws ClientProtocolException, IOException {
		
		 
		  HttpClient client = HttpClientBuilder.create().build();
		  HttpGet request = new HttpGet(targetUrl);
		  HttpResponse response = client.execute(request);
		  HttpEntity entity = response.getEntity();
		  
		  if (response.getStatusLine().getStatusCode() != 200) {
				
			  return Integer.toString(response.getStatusLine().getStatusCode());
				
			
			}else if(entity != null) {
			  String result = EntityUtils.toString(entity);
			  LOGGER.info("REST API response :" + result);
			 return result;
		  }
		  
		  	
	return null;
	}
}
