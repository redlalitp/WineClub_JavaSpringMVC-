package spring15_CS445.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.json.JSONException;

import spring15_CS445.model.Errors;
import spring15_CS445.model.Subscriber;
import spring15_CS445.model.VinClub;

import org.junit.*;

import static org.junit.Assert.*;

import org.springframework.http.ResponseEntity;

import spring15_CS445.model.SubscriberResponse;

public class CreateReceiptTest {
	@Test
	public void testCreateReceipt_1()
		throws Exception {
		CreateReceipt result = new CreateReceipt();
		assertNotNull(result);
	}

	@Test
	public void testAddReceipt_1()
		throws Exception {
		CreateReceipt fixture = new CreateReceipt();
		SubscriberResponse subscriberResponse = new SubscriberResponse();
		subscriberResponse.errors = new ArrayList<Errors>();
		fixture.response = subscriberResponse;
		String json = "{\"name\": \"Anna Kosta\",\"subscriber\":\"0\"}";

		ResponseEntity<String> result = fixture.AddReceipt(json);

		assertNotNull(result);
	}
	
	@Test
	public void testAddReceipt_2()
		throws Exception {
		CreateReceipt fixture = new CreateReceipt();
		SubscriberResponse subscriberResponse = new SubscriberResponse();
		subscriberResponse.errors = new ArrayList<Errors>();
		fixture.response = subscriberResponse;
		Subscriber sub = new Subscriber();
		VinClub.subs.add(sub);
		int id = VinClub.subs.iterator().next().getID();
		String json = "{\"name\": \"Anna Kosta\",\"subscriber\":\""+id+"\"}";

		ResponseEntity<String> result = fixture.AddReceipt(json);
		System.out.println(result);
		assertNotNull(result);
	}

	
	@Test(expected = org.json.JSONException.class)
	public void testAddReceipt_6()
		throws Exception {
		CreateReceipt fixture = new CreateReceipt();
		fixture.response = new SubscriberResponse();
		String json = "";

		ResponseEntity<String> result = fixture.AddReceipt(json);

		assertNotNull(result);
	}

	
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CreateReceiptTest.class);
	}
}