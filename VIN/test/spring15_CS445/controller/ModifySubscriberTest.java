package spring15_CS445.controller;

import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONException;
import spring15_CS445.model.Errors;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;
import spring15_CS445.model.SubscriberResponse;

public class ModifySubscriberTest {
	@Test
	public void testModifySubscriber_1()
		throws Exception {
		ModifySubscriber result = new ModifySubscriber();
		assertNotNull(result);
	}

	@Test
	public void testModifyAccount_1()
		throws Exception {
		ModifySubscriber fixture = new ModifySubscriber();
		SubscriberResponse subscriberResponse = new SubscriberResponse();
		subscriberResponse.errors = new ArrayList<Errors>();
		fixture.response = subscriberResponse;
		int id = 0;
		String json = "{\"name\":\"abc\",\"email\":\"abc@def.com\",\"phone\":\"123445\",\"facebook\":\"fbHandle\",\"twitter\":\"twHandle\"}";

		ResponseEntity<String> result = fixture.ModifyAccount(id, json);

		assertNotNull(result);
	}

	
	@Test(expected = org.json.JSONException.class)
	public void testModifyAccount_5()
		throws Exception {
		ModifySubscriber fixture = new ModifySubscriber();
		fixture.response = new SubscriberResponse();
		int id = 1;
		String json = "";

		ResponseEntity<String> result = fixture.ModifyAccount(id, json);

		assertNotNull(result);
	}

	
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ModifySubscriberTest.class);
	}
}