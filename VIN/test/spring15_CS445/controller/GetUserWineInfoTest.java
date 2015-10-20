package spring15_CS445.controller;

import org.junit.*;
import spring15_CS445.model.WineResponse;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;

public class GetUserWineInfoTest {
	@Test
	public void testGetInfo_1()
		throws Exception {
		GetUserWineInfo fixture = new GetUserWineInfo();
		fixture.response = new WineResponse();
		int id = 1;
		int wid = 1;

		ResponseEntity<String> result = fixture.getInfo(id, wid);

		assertNotNull(result);
		assertEquals("404", result.getStatusCode().toString());
		assertEquals(false, result.hasBody());
		assertEquals(null, result.getBody());
	}

	
		public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GetUserWineInfoTest.class);
	}
}