package com.ekemp.sgott.hw2.two;

/**
* a temperature class that stores the temperature in kelvin, fahrenheit, and celcius
*
* @author Emily Kemp
* @author Stephanie Gott
* @version hw 2, 2
* @bugs None
*/

public class Temperature {
	
	private double kelvin; //the temperature in kelvin
	private double fahrenheit; //the temperature in fahrenheit
	private double celcius; //the temperature in celcius
	private enum Type {FAHRENHEIT, CELCIUS, KELVIN};
	private Type type; //the units the temp was initially stored in
	
	private Temperature(double value, Type type){
		if(type == Type.KELVIN){
			setType(type);
			setKelvin(value);
		}
		else if(type == Type.CELCIUS){
			setType(type);
			setCelcius(value);
		}
		else if(type == Type.FAHRENHEIT){
			setType(type);
			setFahrenheit(value);
		}
	}
	
	/**
	 * a static factory method
	 * 
	 * @param value the value of the temperature in kelvin
	 * @return a new temperature instance
	 */
	static public Temperature kelvinInstance(double value){
		return new Temperature(value, Type.KELVIN);
	}
	/**
	 * a static factory method
	 * 
	 * @param value the value of the temperature in celcius
	 * @return a new temperature instance
	 */
	static public Temperature celciusInstance(double value){
		return new Temperature(value, Type.CELCIUS);
	}
	/**
	 * a static factory method
	 * 
	 * @param value the value of the temperature in fahrenheit
	 * @return a new temperature instance
	 */
	static public Temperature fahrenheitInstance(double value){
		return new Temperature(value, Type.FAHRENHEIT);
	}
	
	//setters and getters here
	/**
	 * the getter for the kelvin instance value
	 * 
	 * @return the instances' kelvin value
	 */
	public double getKelvin(){
		return this.kelvin;
	}
	/**
	 * the getter for the fahrenheit instance value
	 * 
	 * @return the instances' fahrenheit value
	 */
	public double getFahrenheit(){
		return this.fahrenheit;
	}
	/**
	 * the getter for the fahrenheit instance value
	 * 
	 * @return the instances' celcius value
	 */
	public double getCelcius(){
		return this.celcius;
	}
	/**
	 * the setter for the kelvin field
	 * 
	 * @param value the new temperature in kelvin
	 */
	public void setKelvin(double value){
		this.kelvin = value;
		this.fahrenheit = ((value*9.0)/5.0) - 459.67;
		this.celcius = value - 273.15;
	}
	/**
	 *  the setter for the fahrenheit field
	 *  
	 * @param value the new temperature in fahrenheit
	 */
	public void setFahrenheit(double value){
		this.fahrenheit = value;
		this.celcius = (5.0/9.0)*(value - 32.0);
		this.kelvin = (value + 459.67)*(5.0/9.0);
	}
	
	/**
	 *  the setter for the celcius field
	 *  
	 * @param value the new temperature in celcius
	 */
	public void setCelcius(double value){
		this.celcius = value;
		this.kelvin = value + 273.15;
		this.fahrenheit = ((9.0*value)/5.0) + 32.0;
	}
	/**
	 * sets the type to the units the user orginally inputted
	 * @param type the type of units
	 */
	public void setType(Type type){
		this.type = type;
	}
	/**
	 * overrides the toString method to return the type of the units and the temperature
	 * @return answer the original type of units and the temperature in those units
	 */
	public String toString(){
		String answer = "poop"; //error testing for sCiEnCe !!!11!
		if(this.type == Type.KELVIN){
			answer = (String.valueOf(getKelvin()) + " " + this.type.toString());
		}
		else if(this.type == Type.CELCIUS){
			answer = (String.valueOf(getCelcius()) + " " + this.type.toString());
		}
		else if(this.type == Type.FAHRENHEIT){
			answer = (String.valueOf(getFahrenheit()) + " " + this.type.toString());
		}
		return answer;
	}
}
