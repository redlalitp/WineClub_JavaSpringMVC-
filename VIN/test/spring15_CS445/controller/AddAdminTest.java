package spring15_CS445.controller;

import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONException;
import org.junit.*;
import spring15_CS445.model.Errors;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;
import spring15_CS445.model.SubscriberResponse;

public class AddAdminTest {
	@Test
	public void testAddAdmin_1()
		throws Exception {
		AddAdmin result = new AddAdmin();
		assertNotNull(result);
	}

	@Test
	public void testAddAccount_1()
		throws Exception {
		AddAdmin fixture = new AddAdmin();
		SubscriberResponse subscriberResponse = new SubscriberResponse();
		subscriberResponse.errors = new ArrayList<Errors>();
		fixture.response = subscriberResponse;
		String json = "{\"name\":\"_anc\"}";

		ResponseEntity<String> result = fixture.AddAccount(json);

			assertNotNull(result);
	}

	@Test
	public void testAddAccount_2()
		throws Exception {
		AddAdmin fixture = new AddAdmin();
		SubscriberResponse subscriberResponse = new SubscriberResponse();
		subscriberResponse.errors = new ArrayList<Errors>();
		fixture.response = subscriberResponse;
		String json = "{\"name\":\"%adc\"}";

		ResponseEntity<String> result = fixture.AddAccount(json);

			assertNotNull(result);
	}

	@Test(expected = org.json.JSONException.class)
	public void testAddAccount_5()
		throws Exception {
		AddAdmin fixture = new AddAdmin();
		fixture.response = new SubscriberResponse();
		String json = "";

		ResponseEntity<String> result = fixture.AddAccount(json);

		assertNotNull(result);
	}

		public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AddAdminTest.class);
	}
}