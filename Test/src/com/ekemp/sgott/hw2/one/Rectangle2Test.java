package com.ekemp.sgott.hw2.one;

import static org.junit.Assert.*;

import org.junit.Test;

public class Rectangle2Test {
	
	Rectangle2 r = new Rectangle2();

	@Test
	public void testGetHeight() {
		assertEquals(1.0, r.getHeight(), 0.0);
	}

	@Test
	public void testGetWidth() {
		assertEquals(1.0, r.getWidth(), 0.0);
	}

	@Test
	public void testSetHeight() {
		r.setHeight(2.0);
		assertEquals(2.0, r.getHeight(), 0.0);
	}

	@Test
	public void testSetWidth() {
		r.setWidth(2.0);
		assertEquals(2.0, r.getWidth(), 0.0);
	}

	@Test
	public void testArea() {
		assertEquals(1.0, r.area(), 0.0);
	}

	@Test
	public void testPerimeter() {
		assertEquals(4.0, r.perimeter(), 0.0);
	}

	@Test
	public void testDiagonalLength() {
		assertEquals(1.4, r.diagonalLength(), 0.1);
	}

	@Test
	public void testDistanceFromOrigin() {
		assertEquals(0.0, r.distanceFromOrigin(), 0.0);
	}

	@Test
	public void testManhattanDistanceFromOrigin() {
		assertEquals(0.0, r.manhattanDistanceFromOrigin(), 0.0);
	}

	@Test
	public void testToString() {
		assertEquals("CARTESIAN", r.toString());
	}

}
