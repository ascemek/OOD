package items;

public abstract class Item {
	
	protected Float price;
	
	public Item(Float price)
	{
		this.price = price;
	}
	public Float getPrice()
	{
		return price;
	}
	
	public void changePrice(Float price)
	{
		if(price > 0)
		{
			this.price = price;
		}
	}
	
	
	
}
