package spring15_CS445.controller;

import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONException;
import spring15_CS445.model.Errors;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;
import spring15_CS445.model.SubscriberResponse;

public class AddWineRatingTest {
	@Test
	public void testAddWineRating_1()
		throws Exception {
		AddWineRating result = new AddWineRating();
		assertNotNull(result);
		// add additional test code here
	}

	@Test
	public void testAddWineNote_1()
		throws Exception {
		AddWineRating fixture = new AddWineRating();
		SubscriberResponse subscriberResponse = new SubscriberResponse();
		subscriberResponse.errors = new ArrayList<Errors>();
		fixture.response = subscriberResponse;
		int id = 1;
		Long wid = new Long(1L);
		String json = "{\"rating\":4}";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, json);

		assertNotNull(result);
	}

	@Test
	public void testAddWineNote_2()
		throws Exception {
		AddWineRating fixture = new AddWineRating();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long wid = new Long(1L);
		String json = "{\"rating\":4}";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, json);

		assertNotNull(result);
	}

	@Test
	public void testAddWineNote_3()
		throws Exception {
		AddWineRating fixture = new AddWineRating();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long wid = new Long(1L);
		String json = "{\"rating\":4}";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, json);

		assertNotNull(result);
	}

	@Test
	public void testAddWineNote_4()
		throws Exception {
		AddWineRating fixture = new AddWineRating();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long wid = new Long(1L);
		String json = "{\"rating\":4}";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, json);

		assertNotNull(result);
	}

	@Test
	public void testAddWineNote_5()
		throws Exception {
		AddWineRating fixture = new AddWineRating();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long wid = new Long(1L);
		String json = "{\"rating\":4}";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, json);

		assertNotNull(result);
	}

	@Test
	public void testAddWineNote_6()
		throws Exception {
		AddWineRating fixture = new AddWineRating();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long wid = new Long(1L);
		String json = "{\"rating\":4}";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, json);

		assertNotNull(result);
	}

	@Test
	public void testAddWineNote_7()
		throws Exception {
		AddWineRating fixture = new AddWineRating();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long wid = new Long(1L);
		String json = "{\"rating\":4}";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, json);

		assertNotNull(result);
	}

	@Test(expected = org.json.JSONException.class)
	public void testAddWineNote_8()
		throws Exception {
		AddWineRating fixture = new AddWineRating();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long wid = new Long(1L);
		String json = "";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, json);

		// add additional test code here
		assertNotNull(result);
	}

	@Test(expected = org.json.JSONException.class)
	public void testAddWineNote_9()
		throws Exception {
		AddWineRating fixture = new AddWineRating();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long wid = new Long(1L);
		String json = "";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, json);

		// add additional test code here
		assertNotNull(result);
	}

		public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AddWineRatingTest.class);
	}
}