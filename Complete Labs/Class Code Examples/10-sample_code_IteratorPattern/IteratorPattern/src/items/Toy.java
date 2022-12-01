package items;
public class Toy extends Item{

		private String toyName;

		
		public Toy(String toyName, Float price)
		{
			super(price);
			this.toyName = toyName;
			
		}
		
		public Toy(String[] allParameters)
		{
			super(Float.parseFloat(allParameters[1]));
			this.toyName = allParameters[0];
			
		}
		
		public String getToyName()
		{
			return toyName;
		}
		
		
		public String toString()
		{
			return "Toy: " + toyName + ", with " + ", current price: " + getPrice() + "\n";
		}
}


