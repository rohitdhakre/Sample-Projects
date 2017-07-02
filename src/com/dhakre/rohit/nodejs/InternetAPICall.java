package com.dhakre.rohit.nodejs;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InternetAPICall {

	public static void main(String[] args) {
		new InternetAPICall().fetchData();
	}

	public void fetchData() {
		MyCallBack details;
		ObjectMapper mapper = new ObjectMapper();
		try {
			details = mapper.readValue(new URL("http://validate.jsontest.com/?json=%7B%22key%22:%22value%22%7D"),
					MyCallBack.class);
			// Pretty print
			String prettyDetails = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(details);
			System.out.println(prettyDetails);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
