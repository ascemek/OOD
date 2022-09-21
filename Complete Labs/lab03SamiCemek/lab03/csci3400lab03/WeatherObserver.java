package csci3400lab03;

/**
 * @author Sami Cemek
 * @date Sep 09 2020
 * @version 1.1
 */

public class WeatherObserver implements Observer{

    private String observerName;

    public WeatherObserver(String observerName){
        this.observerName = observerName;
    }
        
    @Override
    public void handle(PropertyChangedEvent args){

        System.out.println(this.observerName + ": "
	      		+ args.propertyName + 
                " has changed to " +  args.newValue + ".");
    }
    
}
