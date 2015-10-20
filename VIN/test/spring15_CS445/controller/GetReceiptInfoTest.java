package spring15_CS445.controller;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;

public class GetReceiptInfoTest {
	@Test
	public void testGetDetailedInfo_1()
		throws Exception {
		GetReceiptInfo fixture = new GetReceiptInfo();
		int id = 1;

		ResponseEntity<String> result = fixture.getDetailedInfo(id);

		assertNotNull(result);
		assertEquals("<404 Not Found,{}>", result.toString());
		assertEquals(false, result.hasBody());
		assertEquals(null, result.getBody());
	}

	

	@Test
	public void testGetInfo_1()
		throws Exception {
		GetReceiptInfo fixture = new GetReceiptInfo();

		ResponseEntity<String> result = fixture.getInfo();

		assertNotNull(result);
		assertEquals("<200 OK,null,{}>", result.toString());
		assertEquals(true, result.hasBody());
		assertEquals("null", result.getBody());
	}

	

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GetReceiptInfoTest.class);
	}
}