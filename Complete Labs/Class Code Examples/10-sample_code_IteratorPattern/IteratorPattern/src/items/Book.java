package items;
public class Book extends Item{

	private String title;
	private String author;
	
	public Book(String title, String author, Float price)
	{
		super(price);
		this.title = title;
		this.author = author;
		
		
	}
	
	public Book(String[] allParameters)
	{
		super(Float.parseFloat(allParameters[2]));
		this.title = allParameters[0];
		this.author = allParameters[1];
		
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String toString()
	{
		return "Book: " + title + ", written by " + author + ", current price: " + price + "\n";
	}
}
