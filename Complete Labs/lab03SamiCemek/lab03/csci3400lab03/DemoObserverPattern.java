package csci3400lab03;

/**
 * @author fahmidahamid
 * @author Sami Cemek
 * @date Sep 09 2020
 * @version 1.1
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class MyFileReader{
	
	public List<String> readFile(String fileName) throws Exception{
		
		String line = null;  
		List<String> data = new ArrayList<String>();
		
		try {
			BufferedReader bfReader = new BufferedReader(new FileReader(fileName));
		
	        while((line = bfReader.readLine())!= null)
	        	{
	        	 data.add(line);
	        	}
	        bfReader.close();
	        }
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return data;
	}
}

public class DemoObserverPattern {

	public static void main(String[] args) throws Exception {
		
		MyFileReader myFileReader = new MyFileReader();
		List<String> data = myFileReader.readFile("weatherDatabase.txt");
		
		Weather currentWeather = new Weather("Sarasota");
		
		//Question B, C
		//Observer weaObs =  new WeatherObserver("Weather-observer-of-Sarasota");
		//currentWeather.subscribe(weaObs);

		//Question D, E
		//FieldObserver tempObserver =  new FieldObserver("Temperature Observer", "Temperature");
		//currentWeather.subscribe(tempObserver);

		//Question F, G
		//FieldObserverX precipObserverX = new FieldObserverX("Precipitation-Observer", "Precipitation", "light-rain");
		//currentWeather.subscribe(precipObserverX);
		
		/*** optional: more tests ***/
		//FieldObserverX tempObserverX = new FieldObserverX("Temperature-Observer", "Temperature", 77);
		//currentWeather.subscribe(tempObserverX);
				
		for (String line: data) {
			String[] information = line.split(" ");
			currentWeather.setHour(Integer.parseInt(information[0]));
			currentWeather.setTemperature(Double.parseDouble(information[1]));
			currentWeather.setPrecipitation(information[2]);
  	  
		 }

	}
	
}
