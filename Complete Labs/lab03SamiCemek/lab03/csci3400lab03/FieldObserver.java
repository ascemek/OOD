package csci3400lab03;

/**
 * @author Sami Cemek
 * @date Sep 09 2020
 * @version 1.1
 */

//FieldObserver will only react (meaning, will handle) to any changes to one particular field of the Weather class

public class FieldObserver implements Observer{

    protected String observerName;                          
    protected String field;                                    

    public FieldObserver(String observerName, String field){
        this.observerName = observerName;
        this.field = field;
    }
    
    // Temperature field
    @Override
    public void handle(PropertyChangedEvent args){

        if(field.equals(args.propertyName)){

            System.out.println(this.observerName + ": "
	      		+ this.field + 
                " has changed to " +  args.newValue + ".");
        }

    }

    // create a subclass of the FieldObserver class name it as FieldObserverX
    public static class FieldObserverX extends FieldObserver{

        private String threshold = " "; //placeholder value
        private int thresholdInt = 0;   //placeholder value

        public FieldObserverX(String observerName, String field, String threshold) {
            super(observerName, field);
            this.threshold = threshold;
        }

        public FieldObserverX(String observerName, String field, int thresholdInt) {
            super(observerName, field);
            this.thresholdInt = thresholdInt;
        }

        @Override
        public void handle(PropertyChangedEvent args){

            if(field.equals(args.propertyName)){
                
                if(threshold.equals("light-rain")){

                    System.out.println(this.observerName + ": "
                    + this.field + " " + this.threshold + 
                    " has changed to " +  args.newValue + ".");

                }

                if(thresholdInt == 77){

                    System.out.println(this.observerName + ": "
                    + this.field + " " + this.thresholdInt + 
                    " has changed to " +  args.newValue + ".");

                }
                
            }

        }

    }
    
}
