package spring15_CS445.controller;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;

public class GetRevenueInfoTest {
	@Test
	public void testGetRevenueInfo_1()
		throws Exception {

		GetRevenueInfo result = new GetRevenueInfo();

		assertNotNull(result);
	}

	@Test
	public void testGetRevenueInfo_2()
		throws Exception {
		int sDate = 1;
		int eDate = 1;

		GetRevenueInfo result = new GetRevenueInfo(sDate, eDate);

		assertNotNull(result);
	}

	@Test
	public void testGetInfo_1()
		throws Exception {
		GetRevenueInfo fixture = new GetRevenueInfo(1, 1);

		ResponseEntity<String> result = fixture.getInfo();

		assertNotNull(result);
		assertEquals("<200 OK,{\n  \"units_delivered\": 0,\n  \"units_returned\": 0,\n  \"wine_revenue\": 0.0,\n  \"delivery_revenue\": 0.0\n},{}>", result.toString());
		assertEquals(true, result.hasBody());
		assertEquals("{\n  \"units_delivered\": 0,\n  \"units_returned\": 0,\n  \"wine_revenue\": 0.0,\n  \"delivery_revenue\": 0.0\n}", result.getBody());
	}

	@Test
	public void testGetInfo_2()
		throws Exception {
		GetRevenueInfo fixture = new GetRevenueInfo(0, 1);

		ResponseEntity<String> result = fixture.getInfo();

		assertNotNull(result);
		assertEquals("200", result.getStatusCode().toString());
		assertEquals(true, result.hasBody());
		
	}

	@Test
	public void testGetInfo_3()
		throws Exception {
		GetRevenueInfo fixture = new GetRevenueInfo(1, 0);

		ResponseEntity<String> result = fixture.getInfo();

		assertNotNull(result);
		assertEquals("200", result.getStatusCode().toString());
		assertEquals(true, result.hasBody());
		
	}

			
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GetRevenueInfoTest.class);
	}
}