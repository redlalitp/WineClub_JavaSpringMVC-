package spring15_CS445.controller;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;

public class GetShipmentInfoTest {
	@Test
	public void testGetDetailedInfo_1()
		throws Exception {
		GetShipmentInfo fixture = new GetShipmentInfo();
		int id = 1;
		Long sid = new Long(1L);

		ResponseEntity<String> result = fixture.getDetailedInfo(id, sid);

		assertNotNull(result);
		assertEquals("<404 Not Found,{}>", result.toString());
		assertEquals(false, result.hasBody());
		assertEquals(null, result.getBody());
	}

	
	@Test
	public void testGetInfo_1()
		throws Exception {
		GetShipmentInfo fixture = new GetShipmentInfo();
		int id = 1;

		ResponseEntity<String> result = fixture.getInfo(id);

		assertNotNull(result);
		assertEquals("<200 OK,[],{}>", result.toString());
		assertEquals(true, result.hasBody());
		assertEquals("[]", result.getBody());
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GetShipmentInfoTest.class);
	}
}