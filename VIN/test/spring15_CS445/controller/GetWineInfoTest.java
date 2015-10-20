package spring15_CS445.controller;

import org.junit.*;
import spring15_CS445.model.WineResponse;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;

public class GetWineInfoTest {
	@Test
	public void testGetInfo_1()
		throws Exception {
		GetWineInfo fixture = new GetWineInfo();
		fixture.response = new WineResponse();
		int wid = 1;

		ResponseEntity<String> result = fixture.getInfo(wid);

		assertNotNull(result);
		assertEquals("<404 Not Found,{}>", result.toString());
		assertEquals(false, result.hasBody());
		assertEquals(null, result.getBody());
	}

		
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GetWineInfoTest.class);
	}
}