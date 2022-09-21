package csci3400lab03;

/**
 * @author fahmidahamid
 * @author Sami Cemek
 * @date Sep 09 2020
 * @version 1.1
 */

public class Weather extends Observable{

	
	private Integer hour; 
	private Double temperature; 
	private String precipitation;
	private String name;
	
	/*
	 * Double, Integer --> These are wrapper classes
	 * Integer.parseInt(String s) --> converts a String s to an Integer Object
	 * Double.parseDouble(String s) --> converts a String s to a Double Object
	 */

	
	public Weather(String name)
	{
		this.name = name;
		this.temperature = 0.00;
		this.precipitation = "-";
		this.hour = -1;
	}
	public Weather(Integer hr, Double temp, String precip)
	{
		this.temperature = temp;
		this.precipitation = precip;
		this.hour = hr;
		
	}
	
	public void setTemperature(Double temp) {   
		this.temperature = temp;
		this.notifyAll("Temperature", temp);
	}

	public void setHour(Integer hr) {  
		this.hour = hr; 
		this.notifyAll("Hour", hr);

	}
	public void setPrecipitation(String precip) { 
		this.precipitation = precip; 
		this.notifyAll("Precipitation", precip);
	}
	
	public Double getTemperature() { 
		return this.temperature;
	}

	public Integer getHour() { 
		return this.hour;
	}

	public String getPrecipitation() { 
		return this.precipitation;
	}

	@Override
	public String toString() {
		
		return "This is the weather of " + this.name + "\n";
				
	}
	
}
