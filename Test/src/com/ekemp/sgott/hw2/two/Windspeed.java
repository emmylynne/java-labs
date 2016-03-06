package com.ekemp.sgott.hw2.two;

/**
* a class that stores windspeed in mph
*
* @author Emily Kemp
* @author Stephanie Gott
* @version hw 2, 2
* @bugs None
*/

public class Windspeed {

	private double mph; //the windspeed in miles per hour
	
	
	/**
	 * the constructor for the Windspeed class
	 * 
	 * @param mph the windspeed in mph
	 */
	Windspeed(double mph){
		setMph(mph);
	}
	
	//setter and getter
	/**
	 * the setter for mph
	 * 
	 * @param mph the value of mph in mph
	 */
	public void setMph(double mph){
		this.mph = mph;
	}
	/**
	 * the getter for mph
	 * 
	 * @return the current value of this instances' mph
	 */
	public double getMph(){
		return this.mph;
	}
	
	//methods
	/**
	 * returns the mph variable in meters per second
	 * 
	 * @return the mph variable in meters per second
	 */
	public double toMetersPerSecond(){
		return this.mph * 0.44704;
	}
	/**
	 * overrides the toString method to return the string version of this.mph
	 * 
	 * @return the string of the mph
	 */
	@Override
	public String toString(){
		return String.valueOf(this.mph);
	}
}
