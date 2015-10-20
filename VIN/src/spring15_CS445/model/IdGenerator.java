package spring15_CS445.model;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {
	private static AtomicInteger nextID = new AtomicInteger();

	public static int newID() {
		return nextID.getAndIncrement();
	}

}
