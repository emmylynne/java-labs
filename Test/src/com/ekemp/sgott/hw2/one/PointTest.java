package com.ekemp.sgott.hw2.one;

import static org.junit.Assert.*;

import org.junit.Test;

public class PointTest {

	Point p = Point.cartesianInstance(2.0,1.0);
	
	@Test
	public void testSetX() {
		p.setX(3.0);
		assertEquals(3.0, p.getX(),0.0);
		assertEquals(Math.sqrt((p.getX()*p.getX()) + (p.getY()*p.getY())), p.getR(), 0.1);
	}

	@Test
	public void testSetY() {
		p.setY(4.0);
		assertEquals(4.0, p.getY(),0.0);
		assertEquals(Math.sqrt((p.getX()*p.getX()) + (p.getY()*p.getY())), p.getR(), 0.1);
	}

	@Test
	public void testSetR() {
		p.setR(5.0);
		assertEquals(5.0, p.getR(),0.0);
		assertEquals(p.getR() * Math.cos(p.getTheta()), p.getX(), 0.2);
		assertEquals(p.getR() * Math.sin(p.getTheta()), p.getY(), 0.2);
	}

	@Test
	public void testSetTheta() {
		p.setTheta(66.0);
		assertEquals(66.0, p.getTheta(), 0.0);
		assertEquals(p.getR() * Math.cos(p.getTheta()), p.getX(), 0.2);
		assertEquals(p.getR() * Math.sin(p.getTheta()), p.getY(), 0.2);
	}

	@Test
	public void testSetType() {
		assertEquals("CARTESIAN", p.toString());
	}

	@Test
	public void testGetX() {
		p.setX(2.0);
		assertEquals(2.0, p.getX(), 0.0);
	}

	@Test
	public void testGetY() {
		p.setY(4.0);
		assertEquals(4.0, p.getY(), 0.0);
	}
	
	@Test
	public void testGetR() {
		p.setR(3.0);
		assertEquals(3.0, p.getR(), 0.0);
	}
	
	@Test
	public void testGetTheta() {
		p.setTheta(33.0);
		assertEquals(33.0, p.getTheta(), 0.0);
	}
	
	@Test
	public void testGetType() {
		assertNotNull(p.getType());
	}

	@Test
	public void testEuclideanDistancePoint() {
		p = Point.cartesianInstance(1.0, 1.0);
		assertEquals(1.4, p.euclideanDistance(Point.cartesianInstance(0.0, 0.0)), 0.1);
	}

	@Test
	public void testEuclideanDistancePointPoint() {
		Point q = Point.cartesianInstance(2.0, 2.0);
		assertEquals(1.4, p.euclideanDistance(p, q), 0.4);
	}

	@Test
	public void testManhattanDistancePoint() {
		p = Point.cartesianInstance(1.0, 1.0);
		assertEquals(2.0, p.manhattanDistance(p), 0.0);
	}

	@Test
	public void testManhattanDistancePointPoint() {
		Point q = Point.cartesianInstance(2.0, 2.0);
		p = Point.cartesianInstance(1.0, 1.0);
		assertEquals(2.0, p.manhattanDistance(p,q), 0.0);
	}

	@Test
	public void testToString() {
		assertEquals("CARTESIAN", p.toString());
	}

}