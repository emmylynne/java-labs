package com.ekemp.sgott.hw2.two;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemperatureTest {

	Temperature k = Temperature.kelvinInstance(200.0);
	Temperature c = Temperature.celciusInstance(28.0);
	Temperature f = Temperature.fahrenheitInstance(82.0);

	@Test
	public void testKelvinInstance() {
		assertNotNull(k);

	}

	@Test
	public void testCelciusInstance() {
		assertNotNull(c);

	}

	@Test
	public void testFahrenheitInstance() {
		assertNotNull(f);
	}

	@Test
	public void testGetKelvin() {
		assertEquals(200.0, k.getKelvin(), 0.0);
	}

	@Test
	public void testGetFahrenheit() {
		assertEquals(82.0, f.getFahrenheit(), 0.0);
	}

	@Test
	public void testGetCelcius() {
		assertEquals(28.0, c.getCelcius(), 0.0);
	}

	@Test
	public void testSetKelvin() {
		k.setKelvin(300.0);
		assertEquals(300.0, k.getKelvin(), 0.0);
		assertEquals((300.0*9.0)/5.0 - 459.67, k.getFahrenheit(), 0.1);
		assertEquals(300.0 - 273.15, k.getCelcius(), 0.1);
	}

	@Test
	public void testSetFahrenheit() {
		f.setFahrenheit(66.0);
		assertEquals(66.0, f.getFahrenheit(), 0.1);
		assertEquals((5.0/9.0)*(66.0-32.0), f.getCelcius(), 0.1);
		assertEquals((66.0+459.67)*(5.0/9.0), f.getKelvin(), 0.1);
	}

	@Test
	public void testSetCelcius() {
		c.setCelcius(22.0);
		assertEquals(22.0, c.getCelcius(), 0.1);
		assertEquals(22.0 + 273.15, c.getKelvin(), 0.1);
		assertEquals(((9.0*22.0)/5.0) + 32.0, c.getFahrenheit(), 0.1);
	}

	@Test
	public void testSetType() {
		assertEquals(String.valueOf(k.getKelvin()) + " KELVIN", k.toString());
	}

	@Test
	public void testToString() {
		assertEquals(String.valueOf(k.getKelvin()) + " KELVIN", k.toString());
	}

}