/**
 * 
 */
package com.towerplus.jsonbasics;

import java.io.IOException;
import java.io.StringReader;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.towerplus.jsonbasics.pojo.Address;

/**
 * @author Administrator
 *
 */
public class HelloWorld {
	
	public static void main(String args) {
		ObjectMapper objectMapper = new ObjectMapper();
		
		String json =
				"{"+
				  "\"addresses\": ["+
				    "{"+
				     " \"addressID\": \"90ace06b-2257-4760-9dec-75a4ca679d0e\","+
				     " \"creationDateTime\": \"2014-08-19T22:04:56.814-07:00\","+
				     " \"lastUpdDateTime\": \"2014-08-19T22:04:56.814-07:00\","+
				     " \"country\": \"India\","+
				     " \"state\": \"Telengana\","+
				     " \"pinCode\": \"400066\","+
				     " \"streetName\": \"street\","+
				     " \"buildingName\": \"my buliding\","+
				     " \"flatNumber\": \"102\""+
				    "},"+
				    "{"+
				    "  \"addressID\": \"90ace06b-2257-4760-9dec-75a4ca679d0e\","+
				    "  \"creationDateTime\": \"2014-08-19T22:04:56.814-07:00\","+
				    "  \"lastUpdDateTime\": \"2014-08-19T22:04:56.814-07:00\","+
				    "  \"country\": \"India\","+
				    "  \"state\": \"Telengana\","+
				    "  \"pinCode\": \"400066\","+
				    "  \"streetName\": \"street\","+
				    "  \"buildingName\": \"my buliding\","+
				    "  \"flatNumber\": \"102\""+
				    "}"+
				  "]"+
				"}";
		
		StringReader reader = new StringReader(json);
		try {
			Address addresses = objectMapper.readValue(reader, Address.class);
			System.out.println("Address is" + addresses);
		} catch (StreamReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
