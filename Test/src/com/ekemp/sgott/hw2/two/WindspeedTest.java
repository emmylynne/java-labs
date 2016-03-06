package com.ekemp.sgott.hw2.two;

import static org.junit.Assert.*;

import org.junit.Test;

public class WindspeedTest {

	Windspeed ws = new Windspeed(6.0);
	
	@Test
	public void testWindspeed() {
		assertNotNull(ws);
	}

	@Test
	public void testSetMph() {
		ws.setMph(2.0);
		assertEquals(2.0, ws.getMph(), 0.0);
	}

	@Test
	public void testGetMph() {
		assertEquals(6.0, ws.getMph(), 0.0);
	}

	@Test
	public void testToMetersPerSecond() {
		assertEquals(6.0 * 0.44704, ws.toMetersPerSecond(), 0.0);
	}

	@Test
	public void testToString() {
		assertEquals("6.0", ws.toString());
	}

}