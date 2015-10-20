package spring15_CS445.controller;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;

public class ViewMonthlySelectionTest {
	@Test
	public void testGetInfo_1()
		throws Exception {
		ViewMonthlySelection fixture = new ViewMonthlySelection();
		int id = 1;

		ResponseEntity<String> result = fixture.getInfo(id);

		assertNotNull(result);
		assertEquals("<404 Not Found,{}>", result.toString());
		assertEquals(false, result.hasBody());
		assertEquals(null, result.getBody());
	}

	
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ViewMonthlySelectionTest.class);
	}
}