package com.ekemp.sgott.hw2.two;

/**
* Calculates windchill and the wind chill in watts
*
* @author Emily Kemp
* @author Stephanie Gott
* @version hw 2, 2
* @bugs None
*/

public class Windchill {

		/**
		 * calculates the windchill 
		 * 
		 * @param t the temperature object
		 * @param w the windspeed object
		 * @return the calculated windchill
		 */
	public static double getWindChill(Temperature t, Windspeed w){
		if((t.getFahrenheit() <= 50.0) && (w.getMph() > 3.0)){
			return 35.74 + (0.6215 * t.getFahrenheit()) - (35.75 * Math.pow(w.getMph(), 0.16)) + (0.4275 * t.getFahrenheit() * Math.pow(w.getMph(), 0.16));
		} else {
			return 0.0;
		}
	}
	
	/**
	 * calculates the windchill in watts
	 * 
	 * @param t the temperature object
	 * @param w the windchill object
	 * @return the calculated windchill in watts
	 */
	public static double getWindChillWatts(Temperature t, Windspeed w){
		if((t.getFahrenheit() <= 50.0) && (w.getMph() > 3.0)){
			return (12.1452 + 11.6222 * Math.sqrt(w.toMetersPerSecond()) - 1.16222 * w.toMetersPerSecond()) * (33.0 - t.getCelcius());
		} else {
			return 0.0;
		}
	}
}
