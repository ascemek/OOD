package itemcollections;
import java.util.Arrays;
import java.util.Iterator;

import items.Item;
import items.Pen;


public class PenCollection implements ItemCollection<Pen>{

	static Integer MAX_PEN = 10;
	private Pen[] penList;
	private int latestEntry;
	
	public PenCollection()
	{
		penList = new Pen[MAX_PEN];
		latestEntry = 0;
		
	}
	
	public void addItem(Pen p)
	{
		if(latestEntry == MAX_PEN)
		{
			System.out.println("The collection rack is full. You cannot add more items.");
			return;
		}
		else
		{
			penList[latestEntry] = p;
			latestEntry++;
		}
	}
	
	
	public Pen[] getPenList()
	{
		return penList;
	}

	public int getLatestEntry()
	{
		return latestEntry;
	}
	
	@Override
	public Iterator iterator() {
		
		return Arrays.asList(penList).iterator();
		
	}

	
}
