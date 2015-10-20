package spring15_CS445.controller;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;

public class GetWineRatingTest {
	@Test
	public void testGetWineInfo_1()
		throws Exception {
		GetWineRating fixture = new GetWineRating();
		int id = 1;
		int wid = 1;

		ResponseEntity<String> result = fixture.getWineInfo(id, wid);

		assertNotNull(result);
		assertEquals("<404 Not Found,{}>", result.toString());
		assertEquals(false, result.hasBody());
		assertEquals(null, result.getBody());
	}

	
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GetWineRatingTest.class);
	}
}