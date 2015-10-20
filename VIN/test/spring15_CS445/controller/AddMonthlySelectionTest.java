package spring15_CS445.controller;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.junit.*;
import spring15_CS445.model.Wine;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;
import spring15_CS445.model.SubscriberResponse;

public class AddMonthlySelectionTest {
	@Test
	public void testAddMonthlySelection_1()
		throws Exception {
		AddMonthlySelection result = new AddMonthlySelection();
		assertNotNull(result);
	}

	@Test
	public void testAddMS_1()
		throws Exception {
		AddMonthlySelection fixture = new AddMonthlySelection();
		fixture.response = new SubscriberResponse();
		fixture.wineList = new ArrayList<Wine>();
		String json = "{\"type\": \"AR\",\"selection_month\": \"Feb/2015\",\"wines\": []}";

		ResponseEntity<String> result = fixture.AddMS(json);

		assertEquals("200",result.getStatusCode().toString());
	}

	@Test(expected = org.json.JSONException.class)
	public void testAddMS_5()
		throws Exception {
		AddMonthlySelection fixture = new AddMonthlySelection();
		fixture.response = new SubscriberResponse();
		fixture.wineList = new ArrayList<Wine>();
		String json = "";

		ResponseEntity<String> result = fixture.AddMS(json);

		assertNotNull(result);
	}

		public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AddMonthlySelectionTest.class);
	}
}