package com.ekemp.sgott.hw2.one;

/**
* Manipulates a point for a rectangle!
*
* @author Emily Kemp
* @author Stephanie Gott
* @version hw 1, 2
* @bugs None
*/


public class Point {
	
	private double x;
	private double y;
	private double r;
	private double theta; //stored as degrees
	private enum Type {CARTESIAN, POLAR};
	private Type type;
	
	private Point(double x, double y, Type type){
		if (type == Type.CARTESIAN){
			setType(type);
			this.x = x;
			this.y = y;
			this.r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
			this.theta = Math.toDegrees(Math.atan(y/x));
		} else {
			setType(type);
			this.r = x;
			this.theta = y;
			this.x = (x * Math.cos(y));
			this.y = (x * Math.sin(y));
		}
		
	}
	
	//constructors
	static Point cartesianInstance(double x, double y){
		return new Point(x, y, Type.CARTESIAN);
	}
	
	static Point polarInstance(double r, double theta){
		return new Point(r, theta, Type.POLAR);
	}
	
	//setters and getters
	public void setX(double x){
		this.x = x;
		this.r = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}
	
	public void setY(double y){
		this.y = y;
		this.r = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}
	
	public void setR(double r){
		this.r = r;
		this.x = (this.r * Math.cos(this.theta));
		this.y = (this.r * Math.sin(this.theta));
	}
	
	public void setTheta(double theta){
		this.theta = theta;
		this.x = (this.r * Math.cos(this.theta));
		this.y = (this.r * Math.sin(this.theta));
	}
	
	public void setType(Type type){
		this.type = type;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public double getR(){
		return this.r;
	}
	
	public double getTheta(){
		return this.theta;
	}
	
	public Type getType(){
		return this.type;
	}

	//methods
	double euclideanDistance(Point p){
		return Math.sqrt(Math.pow(this.x-p.getX(), 2) + Math.pow(this.y-p.getY(), 2));
	}
	
	double euclideanDistance(Point p, Point q){
		return Math.sqrt(Math.pow(q.getX()-p.getX(), 2) + Math.pow(q.getY() - p.getY(), 2));
	}
	
	double manhattanDistance(Point q){
		return Math.abs(q.getX()) + Math.abs(q.getY());
	}
	
	double manhattanDistance(Point p, Point q){
		return Math.abs(q.getX()-p.getX()) + Math.abs(q.getY()-p.getY());
	}

	public String toString(){
		return this.type.toString();
	}
}