package spring15_CS445.controller;

import java.util.ArrayList;

import org.junit.*;

import static org.junit.Assert.*;

import org.springframework.http.ResponseEntity;

import spring15_CS445.model.Errors;
import spring15_CS445.model.SubscriberResponse;

public class AddSubscriberTest {
	@Test
	public void testAddSubscriber_1()
		throws Exception {
		AddSubscriber result = new AddSubscriber();
		
		assertNotNull(result);
	}

	@Test
	public void testAddSubscriber_2()
		throws Exception {
		AddSubscriber fixture = new AddSubscriber();
		SubscriberResponse subscriberResponse = new SubscriberResponse();
		subscriberResponse.errors = new ArrayList<Errors>();
		String json = "{\"name\":\"\",\"email\":\"\",\"phone\":\"\",\"facebook\":\"\",\"twitter\":\"\",\"address\": {\"street\": \"123 Main ST, Apt 2F\",\"city\": \"Anytown\",\"state\": \"Anystate\",\"zip\": \"12345\"}}";

		ResponseEntity<String> result = fixture.addAccount(json);
		assertNotNull(result);
	}
	
	@Test
	public void testAddSubscriber_3()
		throws Exception {
		AddSubscriber fixture = new AddSubscriber();
		SubscriberResponse subscriberResponse = new SubscriberResponse();
		subscriberResponse.errors = new ArrayList<Errors>();
		String json = "{\"name\":\"abc\",\"email\":\"abc@fgh.com\",\"phone\":\"1234567890\",\"facebook\":\"fbHandle\",\"twitter\":\"twH\",\"address\": {\"street\": \"123 Main ST, Apt 2F\",\"city\": \"Anytown\",\"state\": \"Anystate\",\"zip\": \"12345\"}}";

		ResponseEntity<String> result = fixture.addAccount(json);
		assertEquals("200",result.getStatusCode().toString());
	}

	

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AddSubscriberTest.class);
	}
}