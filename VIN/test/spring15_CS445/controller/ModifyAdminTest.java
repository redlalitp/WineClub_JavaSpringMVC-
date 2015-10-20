package spring15_CS445.controller;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.*;
import spring15_CS445.model.Errors;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;
import spring15_CS445.model.SubscriberResponse;

public class ModifyAdminTest {
	@Test
	public void testModifyAdmin_1()
		throws Exception {
		ModifyAdmin result = new ModifyAdmin();
		assertNotNull(result);
	}

	@Test
	public void testModifyAccount_1()
		throws Exception {
		ModifyAdmin fixture = new ModifyAdmin();
		SubscriberResponse subscriberResponse = new SubscriberResponse();
		subscriberResponse.errors = new ArrayList<Errors>();
		fixture.response = subscriberResponse;
		int id = 1;
		String name = "{\"name\":\"abc\"}";

		ResponseEntity<String> result = fixture.ModifyAccount(id, name);

		assertNotNull(result);
		assertEquals("<404 Not Found,{}>", result.toString());
		assertEquals(false, result.hasBody());
		assertEquals(null, result.getBody());
	}

	
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ModifyAdminTest.class);
	}
}