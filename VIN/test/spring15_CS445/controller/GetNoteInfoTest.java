package spring15_CS445.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import static org.junit.Assert.*;

import org.springframework.http.ResponseEntity;

import spring15_CS445.model.Note;
import spring15_CS445.model.Shipment;
import spring15_CS445.model.Subscriber;
import spring15_CS445.model.VinClub;
import spring15_CS445.model.Wine;
import spring15_CS445.model.WineVariety;

public class GetNoteInfoTest {
	@Test
	public void testGetShipmentInfo_1()
		throws Exception {
		GetNoteInfo fixture = new GetNoteInfo();
		int id = 1;
		int sid = 1;

		ResponseEntity<String> result = fixture.getShipmentInfo(id, sid);

		assertNotNull(result);
		assertEquals("<404 Not Found,{}>", result.toString());
		assertEquals(false, result.hasBody());
		assertEquals(null, result.getBody());
	}

	@Test
	public void testGetShipmentInfo_2()
		throws Exception {
		GetNoteInfo fixture = new GetNoteInfo();
		
		
		Subscriber sub = new Subscriber();
		List<Shipment> lst = new ArrayList<Shipment>();
		List<Wine>wlist = new ArrayList<Wine>();
		lst.add(new Shipment(WineVariety.RED,"someString",wlist));
		sub.setShipmentList(lst);
		VinClub.subs.add(sub);
		
		int id = VinClub.subs.iterator().next().getID();
		
		int sid = VinClub.subs.iterator().next().getShipmentList().get(0).getSid();
		ResponseEntity<String> result = fixture.getShipmentInfo(id, sid);

		assertNotNull(result);
		assertEquals("200", result.getStatusCode().toString());
		assertEquals(true, result.hasBody());
		
	}

	
	@Test
	public void testGetShipmentInfo_4()
		throws Exception {
		GetNoteInfo fixture = new GetNoteInfo();
		
		Subscriber sub = new Subscriber();
		List<Shipment> lst = new ArrayList<Shipment>();
		List<Wine>wlist = new ArrayList<Wine>();
		List<Note>nlist = new ArrayList<Note>();
		nlist.add(new Note("content"));
		lst.add(new Shipment(WineVariety.RED,"someString",wlist));
		lst.get(0).setNotes(nlist);
		sub.setShipmentList(lst);
		VinClub.subs.clear();
		VinClub.subs.add(sub);
		
		int id = VinClub.subs.iterator().next().getID();
		
		int sid = VinClub.subs.iterator().next().getShipmentList().get(0).getSid();
		int nid = VinClub.subs.iterator().next().getShipmentList().get(0).getNotes().get(0).getId();
		ResponseEntity<String> result = fixture.getShipmentInfo(id, sid, nid);

		assertNotNull(result);
		assertEquals("200", result.getStatusCode().toString());
		assertEquals(true, result.hasBody());
		
	}

	
	@Test
	public void testGetShipmentInfo_7()
		throws Exception {
		GetNoteInfo fixture = new GetNoteInfo();
		int id = 1;
		int sid = 1;
		int nid = 1;

		ResponseEntity<String> result = fixture.getShipmentInfo(id, sid, nid);

		assertNotNull(result);
		assertEquals("<404 Not Found,{}>", result.toString());
		assertEquals(false, result.hasBody());
		assertEquals(null, result.getBody());
	}

	
	@Test
	public void testGetWineInfo_1()
		throws Exception {
		GetNoteInfo fixture = new GetNoteInfo();
		
		Subscriber sub = new Subscriber();
		List<Shipment> lst = new ArrayList<Shipment>();
		List<Wine>wlist = new ArrayList<Wine>();
		wlist.add(new Wine());
		lst.add(new Shipment(WineVariety.RED,"someString",wlist));
		sub.setShipmentList(lst);
		VinClub.subs.clear();
		VinClub.subs.add(sub);
		System.out.println(VinClub.subs.size());
		int id = VinClub.subs.iterator().next().getID();
		
		int wid = VinClub.subs.iterator().next().getShipmentList().get(0).getWines().get(0).getID();
		
		ResponseEntity<String> result = fixture.getWineInfo(id, wid);

		assertNotNull(result);
		assertEquals("200", result.getStatusCode().toString());
		assertEquals(true, result.hasBody());
		
	}

	@Test
	public void testGetWineInfo_2()
		throws Exception {
		GetNoteInfo fixture = new GetNoteInfo();
		int id = 1;
		int wid = 1;

		ResponseEntity<String> result = fixture.getWineInfo(id, wid);

		assertNotNull(result);
		assertEquals("<404 Not Found,{}>", result.toString());
		assertEquals(false, result.hasBody());
		assertEquals(null, result.getBody());
	}

	
	@Test
	public void testGetWineInfo_5()
		throws Exception {
		GetNoteInfo fixture = new GetNoteInfo();
		
		Subscriber sub = new Subscriber();
		List<Shipment> lst = new ArrayList<Shipment>();
		List<Wine>wlist = new ArrayList<Wine>();
		List<Note>nlist = new ArrayList<Note>();
		nlist.add(new Note("content"));
		lst.add(new Shipment(WineVariety.RED,"someString",wlist));
		wlist.add(new Wine());
		wlist.get(0).setNotes(nlist);
		sub.setShipmentList(lst);
		VinClub.subs.clear();
		VinClub.subs.add(sub);
		
		int id = VinClub.subs.iterator().next().getID();
		
		int wid = VinClub.subs.iterator().next().getShipmentList().get(0).getWines().get(0).getID();
		int nid = VinClub.subs.iterator().next().getShipmentList().get(0).getWines().get(0).getNotes().get(0).getId();

		ResponseEntity<String> result = fixture.getWineInfo(id, wid, nid);

		assertNotNull(result);
		assertEquals("200", result.getStatusCode().toString());
		assertEquals(true, result.hasBody());
		
	}

	@Test
	public void testGetWineInfo_6()
		throws Exception {
		GetNoteInfo fixture = new GetNoteInfo();
		int id = 1;
		int wid = 1;
		int nid = 1;

		ResponseEntity<String> result = fixture.getWineInfo(id, wid, nid);

		assertNotNull(result);
		assertEquals("<404 Not Found,{}>", result.toString());
		assertEquals(false, result.hasBody());
		assertEquals(null, result.getBody());
	}

	@Test
	public void testGetWineInfo_7()
		throws Exception {
		GetNoteInfo fixture = new GetNoteInfo();
		int id = 1;
		int wid = 1;
		int nid = 1;

		ResponseEntity<String> result = fixture.getWineInfo(id, wid, nid);

		assertNotNull(result);
		assertEquals("<404 Not Found,{}>", result.toString());
		assertEquals(false, result.hasBody());
		assertEquals(null, result.getBody());
	}

	@Test
	public void testGetWineInfo_8()
		throws Exception {
		GetNoteInfo fixture = new GetNoteInfo();
		int id = 1;
		int wid = 1;
		int nid = 1;

		ResponseEntity<String> result = fixture.getWineInfo(id, wid, nid);

		assertNotNull(result);
		assertEquals("<404 Not Found,{}>", result.toString());
		assertEquals(false, result.hasBody());
		assertEquals(null, result.getBody());
	}

	@Test
	public void testGetWineInfo_9()
		throws Exception {
		GetNoteInfo fixture = new GetNoteInfo();
		int id = 1;
		int wid = 1;
		int nid = 1;

		ResponseEntity<String> result = fixture.getWineInfo(id, wid, nid);

		assertNotNull(result);
		assertEquals("<404 Not Found,{}>", result.toString());
		assertEquals(false, result.hasBody());
		assertEquals(null, result.getBody());
	}

	@Test
	public void testGetWineInfo_10()
		throws Exception {
		GetNoteInfo fixture = new GetNoteInfo();
		int id = 1;
		int wid = 1;
		int nid = 1;

		ResponseEntity<String> result = fixture.getWineInfo(id, wid, nid);

		assertNotNull(result);
		assertEquals("<404 Not Found,{}>", result.toString());
		assertEquals(false, result.hasBody());
		assertEquals(null, result.getBody());
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GetNoteInfoTest.class);
	}
}