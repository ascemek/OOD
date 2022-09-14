package students.task02;

interface ElectronicOrderBook{
    public void orderBurger(int quantity); 
    public void orderFries(char size) ; // s -> small, m -> medium, l -> large
    public void orderCombo(int quantity);
    public double getPrice();
    
}

// NEW INTERFACE FOR PART C
// Interface Segregation Principle
interface ElectronicOrderBook_StoreB{
    public void orderBurger(int quantity); 
    public void orderFries() ; // No Different Sizes
    public double getPrice();
    
}

class BurgerShopA implements ElectronicOrderBook{

	private double burgerPrice; // standard size
	private double friesPrice;
	private double currentPrice;
	
	BurgerShopA() {
		burgerPrice = 10.5;
		friesPrice = 2.5; // s -> small size, m -> 2 * s, l -> 3 * s
		price = 0.0;
		
		System.out.println("Hello there! We are ready to take orders from you ...\n");
		
	}
	@Override
	public void orderBurger(int quantity) {
		
		System.out.println("Thanks! we are preparing your ordered burger(s) ...");
        currentPrice += quantity * burgerPrice; 	
		
	}

	@Override
	public void orderFries(char size) {
		
		System.out.println("Thanks! we are preparing your ordered fries...");
		if(size == 's')
			currentPrice += friesPrice;
		else if (size == 'l')
			currentPrice += 2 * friesPrice;
		else
			currentPrice += 3 * friesPrice;
	}

	@Override
	public void orderCombo(int quantity) {
		orderBurger(quantity);
		orderFries('m');
	}

	@Override
	public double getPrice() {
		
		double cprice = currentPrice;
		currentPrice = 0.0;
		return cprice;
		
	}
	
	
}

/* 
// Task 02, Part b
class BurgerShopB implements ElectronicOrderBook{

	private double burgerPrice;
	private double friesPrice;
	
	private double friesTotalPrice;
	private double burgerTotalPrice;

	BurgerShopB() {

		// ii) The price of each burger is 8.5 dollars, and each pack of fries is 3.0 dollars.
		burgerPrice = 8.5;
		friesPrice = 3.0;
		
		System.out.println("Hello there! We are ready to take orders from you ...\n");

	}

	@Override
	public void orderBurger(int quantity) {
		
		System.out.println("Thanks! we are preparing your ordered burger(s) ...");
        burgerTotalPrice += quantity * burgerPrice; 	
		
	}

	@Override
	public double getPrice() {
		double price = burgerTotalPrice + friesTotalPrice;

		return price;
	}

	 // i) The burger shop doesn’t provide the “orderCombo(…)” option/functionality.
	 @Override
	 public void orderCombo(int quantity) {
		System.out.println("We don't offer combo menus sorry for the inconvenience");
	 }

	// iii) The shop doesn’t offer fries of various sizes.
	public void orderFries(char size){ // s -> small, m -> medium, l -> large
		System.out.println("Thanks! we are preparing your ordered fries...");
		System.out.println("Sorry for the inconvenience, we do not offer fries of various sizes.");
		if(size == 's' || size == 'm' || size == 'l')
			friesTotalPrice += friesPrice;
	} 
}
*/


// Task 02, Part c
class BurgerShopB implements ElectronicOrderBook_StoreB{ 

	private double burgerPrice;
	private double friesPrice;
	
	private double friesTotalPrice;
	private double burgerTotalPrice;

	BurgerShopB() {

		// ii) The price of each burger is 8.5 dollars, and each pack of fries is 3.0 dollars.
		burgerPrice = 8.5;
		friesPrice = 3.0;
		
		System.out.println("Hello there! We are ready to take orders from you ...\n");

	}

	@Override
	public void orderBurger(int quantity) {
		
		System.out.println("Thanks! we are preparing your ordered burger(s) ...");
        burgerTotalPrice += quantity * burgerPrice; 	
		
	}

	@Override
	public double getPrice() {
		double price = burgerTotalPrice + friesTotalPrice;

		return price;
	}

	//New Updated Implementation
	public void orderFries(){
		System.out.println("Thanks! we are preparing your ordered fries...");
		friesTotalPrice += friesPrice;
	} 
}



public class TestDrive {

	public static void main(String[] args) {
		
		BurgerShopA bg1= new BurgerShopA();
		
		bg1.orderBurger(3);
		bg1.orderFries('m');
		System.out.println("\n ** Please pay "+ bg1.getPrice() + " to the counter for your order.\n");
		
		
		bg1.orderCombo(2);
		System.out.println("\n ** Please pay "+ bg1.getPrice() + " to the counter for your order.\n");

	}
	
	
}

/*
 * Task 02, Part a
 * 
 * OCP states that Objects or entities should be open for extension, but closed for modification.
 * We are violating the OCP by modifying the current price variable throughout the code, declaring items' price as a variable
 * We keep updating the variable as we get more item and increase the current price.
 * Instead of keep updating current price we can have separate variables for fries and burger and add them in the end.
 * Another thing is there is no way to change prices. We can have getters and setter for adjusting the prices instead of declaring 
 * them as a variable. We can also use Hash map or Arraylist to have a product with corresponding price.
 * 
 */

 

 

 



