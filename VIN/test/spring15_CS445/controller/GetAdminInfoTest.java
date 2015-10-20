package spring15_CS445.controller;

import org.junit.*;
import static org.junit.Assert.*;

public class GetAdminInfoTest {
	@Test
	public void testGetAdminInfo_1()
		throws Exception {

		GetAdminInfo result = new GetAdminInfo();

		assertNotNull(result);
		assertEquals(true, result.getInfo().contains("Alice"));
	}

	@Test
	public void testGetAdminInfo_2()
		throws Exception {
		int id = 3;

		GetAdminInfo result = new GetAdminInfo(id);

		assertNotNull(result);
		
	}

	
	@Test
	public void testGetDetailedInfo_2()
		throws Exception {
		GetAdminInfo fixture = new GetAdminInfo(1);
		int id = 1;

		String result = fixture.getDetailedInfo(id);

		assertEquals("Not found", result);
	}

	

	@Test
	public void testGetInfo_1()
		throws Exception {
		GetAdminInfo fixture = new GetAdminInfo(0);

		String result = fixture.getInfo();

		assertEquals("[]", result);
	}

	
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GetAdminInfoTest.class);
	}
}