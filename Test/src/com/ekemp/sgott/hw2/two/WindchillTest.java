package com.ekemp.sgott.hw2.two;

import static org.junit.Assert.*;

import org.junit.Test;

public class WindchillTest {

	Temperature t = Temperature.fahrenheitInstance(82.0);
	Windspeed w = new Windspeed(5.0);
	
	@Test
	public void testGetWindChill() {
		assertEquals(0.0, Windchill.getWindChill(t, w), 0.0);
	}

	@Test
	public void testGetWindChillWatts() {
		assertEquals(0.0, Windchill.getWindChillWatts(t, w), 0.1);
	}

}