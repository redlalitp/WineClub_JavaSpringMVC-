package spring15_CS445.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.json.JSONException;

import spring15_CS445.model.Errors;
import spring15_CS445.model.Shipment;
import spring15_CS445.model.Subscriber;
import spring15_CS445.model.VinClub;
import spring15_CS445.model.Wine;
import spring15_CS445.model.WineVariety;

import org.junit.*;

import static org.junit.Assert.*;

import org.springframework.http.ResponseEntity;

import spring15_CS445.model.SubscriberResponse;

public class CreateNoteTest {
	@Test
	public void testCreateNote_1()
		throws Exception {
		CreateNote result = new CreateNote();
		assertNotNull(result);
	}

	@Test
	public void testAddNote_1()
		throws Exception {
		CreateNote fixture = new CreateNote();
		SubscriberResponse subscriberResponse = new SubscriberResponse();
		subscriberResponse.errors = new ArrayList<Errors>();
		fixture.response = subscriberResponse;
		int id = 1;
		Long sid = new Long(1L);
		String json = "{\"content\":\"some content\"}";

		ResponseEntity<String> result = fixture.AddNote(id, sid, json);

				assertNotNull(result);
	}
	
	@Test
	public void testAddNote_2()
		throws Exception {
		CreateNote fixture = new CreateNote();
		SubscriberResponse subscriberResponse = new SubscriberResponse();
		subscriberResponse.errors = new ArrayList<Errors>();
		fixture.response = subscriberResponse;
		
		
		Subscriber sub = new Subscriber();
		List<Shipment> lst = new ArrayList<Shipment>();
		List<Wine>wlist = new ArrayList<Wine>();
		lst.add(new Shipment(WineVariety.RED,"someString",wlist));
		sub.setShipmentList(lst);
		VinClub.subs.add(sub);
		int id = VinClub.subs.iterator().next().getID();
		
		Long sid = (long) VinClub.subs.iterator().next().getShipmentList().get(0).getSid();
		String json = "{\"content\":\"some content\"}";

		ResponseEntity<String> result = fixture.AddNote(id, sid, json);

				assertEquals("200",result.getStatusCode().toString());
				assertEquals(false,result.toString().contains("\"id\":\"-1\""));
	}
	
	

	@Test(expected = org.json.JSONException.class)
	public void testAddNote_5()
		throws Exception {
		CreateNote fixture = new CreateNote();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long sid = new Long(1L);
		String json = "";

		ResponseEntity<String> result = fixture.AddNote(id, sid, json);

		assertNotNull(result);
	}

	
	@Test
	public void testAddWineNote_1()
		throws Exception {
		CreateNote fixture = new CreateNote();
		SubscriberResponse subscriberResponse = new SubscriberResponse();
		subscriberResponse.errors = new ArrayList<Errors>();
		fixture.response = subscriberResponse;
		int id = 1;
		Long wid = new Long(1L);
		String json = "{\"content\":\"some content\"}";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, json);

		assertNotNull(result);
	}

	
	@Test(expected = org.json.JSONException.class)
	public void testAddWineNote_6()
		throws Exception {
		CreateNote fixture = new CreateNote();
		fixture.response = new SubscriberResponse();
		int id = 1;
		Long wid = new Long(1L);
		String json = "";

		ResponseEntity<String> result = fixture.AddWineNote(id, wid, json);

		assertNotNull(result);
	}

	
		public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CreateNoteTest.class);
	}
}