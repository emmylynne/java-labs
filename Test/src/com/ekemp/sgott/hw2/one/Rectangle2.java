package com.ekemp.sgott.hw2.one;

/**
* Manipulates a rectangle that has a point!
*
* @author Emily Kemp
* @author Stephanie Gott
* @version hw 2, 1
* @bugs None
*/


public class Rectangle2 {

	private Point p = Point.cartesianInstance(0.0, 0.0);
	private double width;
	private double height;
	
	//default rectangle with height and width of 1,
	//lower left hand corner centered at the origin
	Rectangle2(){
		this(0.0, 0.0, 1.0, 1.0);
	}
	
	//rectangle with given height and width
	//lower left hand corner centered at the origin
	Rectangle2(double width, double height){
		this(0.0, 0.0, width, height);
	}
	
	Rectangle2(Point point, double width, double height){
		this(point.getX(), point.getY(), width, height);
	}
	
	//rectangle with given height and width
	//lower left hand corner centered at the given point
	Rectangle2(double x, double y, double width, double height){
		this.p.setX(x);
		this.p.setY(y);
		setHeight(height);
		setWidth(width);
	}
	
	//setters and getters here
	public double getHeight(){
		return this.height;
	}
	
	public double getWidth(){
		return this.width;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public void setWidth(double width){
		this.width = width;
	}
	
	
	//methods here
	double area(){
		return this.width * this.height;
	}
	
	double perimeter(){
		return (2*this.width) + (2*this.height);
	}
	
	double diagonalLength(){
		return (Math.sqrt(Math.pow(this.height, 2.0) + (Math.pow(this.width, 2))));
	}
	
	double distanceFromOrigin(){
		return (this.p.euclideanDistance(Point.cartesianInstance(0.0, 0.0)));
	}
	
	double manhattanDistanceFromOrigin(){
		return (this.p.manhattanDistance(this.p));
	}
	
	@Override 
	public String toString(){
		return this.p.toString();
	}
	
}