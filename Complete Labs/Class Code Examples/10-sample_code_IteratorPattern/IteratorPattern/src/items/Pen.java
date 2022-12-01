package items;
public class Pen extends Item{

	private String brandName;
	private String inkColor;
	
	public Pen(String brandName, Float price, String inkColor)
	{
		super(price);
		this.brandName = brandName;
		this.inkColor = inkColor;
	}
	
	public Pen(String[] allParameters)
	{
		super(Float.parseFloat(allParameters[1]));
		this.brandName = allParameters[0];
		this.inkColor = allParameters[2];
	}
	
	public String getBrandName()
	{
		return brandName;
	}
	
	public String getInkColor()
	{
		return inkColor;
	}
	
	
	public String toString()
	{
		return "Pen: " + brandName + ", with " + inkColor + " ink, current price: " + getPrice() + "\n";
	}
}
