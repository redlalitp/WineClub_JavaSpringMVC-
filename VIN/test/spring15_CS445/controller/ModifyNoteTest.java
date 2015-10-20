package spring15_CS445.controller;

import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONException;
import spring15_CS445.model.Errors;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;
import spring15_CS445.model.SubscriberResponse;

public class ModifyNoteTest {

	
	@Test
	public void testModifyNote_1()
		throws Exception {
		ModifyNote result = new ModifyNote();
		assertNotNull(result);
	}

	@Test
	public void testAddNote_1()
		throws Exception {
		ModifyNote fixture = new ModifyNote();
		SubscriberResponse subscriberResponse = new SubscriberResponse();
		subscriberResponse.errors = new ArrayList<Errors>();
		fixture.response = subscriberResponse;
		int id = 1;
		Long sid = new Long(1L);
		Long nid = new Long(1L);
		String json = "{\"content\":\"changed content\"}";

		ResponseEntity<String> result = fixture.AddNote(id, sid, nid, json);

			assertNotNull(result);
	}

	@Test
	public void testAddNote_2()
		throws Exception {
		ModifyNote fixture = new ModifyNote();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long sid = new Long(1L);
		Long nid = new Long(1L);
		String json = "{\"content\":\"changed content\"}";

		ResponseEntity<String> result = fixture.AddNote(id, sid, nid, json);

		assertNotNull(result);
	}

	@Test
	public void testAddNote_3()
		throws Exception {
		ModifyNote fixture = new ModifyNote();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long sid = new Long(1L);
		Long nid = new Long(1L);
		String json = "{\"content\":\"changed content\"}";

		ResponseEntity<String> result = fixture.AddNote(id, sid, nid, json);

		assertNotNull(result);
	}

	@Test
	public void testAddNote_4()
		throws Exception {
		ModifyNote fixture = new ModifyNote();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long sid = new Long(1L);
		Long nid = new Long(1L);
		String json = "{\"content\":\"changed content\"}";

		ResponseEntity<String> result = fixture.AddNote(id, sid, nid, json);

		assertNotNull(result);
	}

	@Test
	public void testAddNote_5()
		throws Exception {
		ModifyNote fixture = new ModifyNote();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long sid = new Long(1L);
		Long nid = new Long(1L);
		String json = "{\"content\":\"changed content\"}";

		ResponseEntity<String> result = fixture.AddNote(id, sid, nid, json);

		assertNotNull(result);
	}

	@Test
	public void testAddNote_6()
		throws Exception {
		ModifyNote fixture = new ModifyNote();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long sid = new Long(1L);
		Long nid = new Long(1L);
		String json = "{\"content\":\"changed content\"}";

		ResponseEntity<String> result = fixture.AddNote(id, sid, nid, json);

		assertNotNull(result);
	}

	@Test(expected = org.json.JSONException.class)
	public void testAddNote_7()
		throws Exception {
		ModifyNote fixture = new ModifyNote();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long sid = new Long(1L);
		Long nid = new Long(1L);
		String json = "";

		ResponseEntity<String> result = fixture.AddNote(id, sid, nid, json);

		assertNotNull(result);
	}

	@Test(expected = org.json.JSONException.class)
	public void testAddNote_8()
		throws Exception {
		ModifyNote fixture = new ModifyNote();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long sid = new Long(1L);
		Long nid = new Long(1L);
		String json = "";

		ResponseEntity<String> result = fixture.AddNote(id, sid, nid, json);

		assertNotNull(result);
	}

	@Test
	public void testAddWineNote_1()
		throws Exception {
		ModifyNote fixture = new ModifyNote();
		SubscriberResponse subscriberResponse = new SubscriberResponse();
		subscriberResponse.errors = new ArrayList<Errors>();
		fixture.response = subscriberResponse;
		int id = 1;
		Long wid = new Long(1L);
		Long nid = new Long(1L);
		String json = "{\"content\":\"changed content\"}";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, nid, json);

		assertNotNull(result);
	}

	@Test
	public void testAddWineNote_2()
		throws Exception {
		ModifyNote fixture = new ModifyNote();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long wid = new Long(1L);
		Long nid = new Long(1L);
		String json = "{\"content\":\"changed content\"}";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, nid, json);

		assertNotNull(result);
	}

	@Test
	public void testAddWineNote_3()
		throws Exception {
		ModifyNote fixture = new ModifyNote();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long wid = new Long(1L);
		Long nid = new Long(1L);
		String json = "{\"content\":\"changed content\"}";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, nid, json);

		assertNotNull(result);
	}

	@Test
	public void testAddWineNote_4()
		throws Exception {
		ModifyNote fixture = new ModifyNote();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long wid = new Long(1L);
		Long nid = new Long(1L);
		String json = "{\"content\":\"changed content\"}";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, nid, json);

		assertNotNull(result);
	}

	@Test
	public void testAddWineNote_5()
		throws Exception {
		ModifyNote fixture = new ModifyNote();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long wid = new Long(1L);
		Long nid = new Long(1L);
		String json = "{\"content\":\"changed content\"}";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, nid, json);

		assertNotNull(result);
	}

	@Test
	public void testAddWineNote_6()
		throws Exception {
		ModifyNote fixture = new ModifyNote();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long wid = new Long(1L);
		Long nid = new Long(1L);
		String json = "{\"content\":\"changed content\"}";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, nid, json);

		assertNotNull(result);
	}

	@Test
	public void testAddWineNote_7()
		throws Exception {
		ModifyNote fixture = new ModifyNote();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long wid = new Long(1L);
		Long nid = new Long(1L);
		String json = "{\"content\":\"changed content\"}";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, nid, json);

			assertNotNull(result);
	}

	@Test(expected = org.json.JSONException.class)
	public void testAddWineNote_8()
		throws Exception {
		ModifyNote fixture = new ModifyNote();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long wid = new Long(1L);
		Long nid = new Long(1L);
		String json = "";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, nid, json);

		assertNotNull(result);
	}

	@Test(expected = org.json.JSONException.class)
	public void testAddWineNote_9()
		throws Exception {
		ModifyNote fixture = new ModifyNote();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long wid = new Long(1L);
		Long nid = new Long(1L);
		String json = "";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, nid, json);

		assertNotNull(result);
	}

		public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ModifyNoteTest.class);
	}
}