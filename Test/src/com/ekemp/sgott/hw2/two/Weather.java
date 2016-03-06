package com.ekemp.sgott.hw2.two;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
* Is a driver class for the classes windchill, temperature, and weather classes.
*
* Takes in the temperature and windpseed and gives back the windchill
* 
* @author Emily Kemp
* @author Stephanie Gott
* @version hw 2, 2
* @bugs None
*/

public class Weather {
	
	public static void main(String[] args){
		
		double temp;
		String units;
		Temperature t = null;
		Windspeed windsp;
		DecimalFormat myFormatter = new DecimalFormat("###.##");
		
		Scanner in = new Scanner(System.in);
		System.out.print("enter a temperature: ");
		temp = in.nextDouble();
		in.nextLine();
		
		System.out.print("enter temperature units [C/F/K]: ");
		units = in.nextLine();
		
		System.out.print("enter wind speed (mph): ");
		windsp = new Windspeed(in.nextDouble());
		
		switch(units){
		case "C":
			t = Temperature.celciusInstance(temp);
			break;
		case "F":
			t = Temperature.fahrenheitInstance(temp);
			break;
		case "K":
			t = Temperature.kelvinInstance(temp);
			break;
		default:
			System.out.println("Invalid input for units.");
			break;
		}
		String wc = myFormatter.format(Windchill.getWindChill(t, windsp));
		System.out.println("the current wind chill is " + wc);
		
		String wcw = myFormatter.format(Windchill.getWindChillWatts(t, windsp));
		System.out.println("or in Watts per meter square the wind chill is " + wcw);
		
		in.close();
	}
}
