package client;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import itemcollections.BookCollection;
import itemcollections.PenCollection;
import itemcollections.ToyCollection;
import items.Book;
import items.Item;
import items.Toy;

public class Store {

	 private BookCollection bc;
	 private PenCollection pc;
	 private ToyCollection tc;
	
	public Store(BookCollection bc, PenCollection pc, ToyCollection tc)
	{
		this.bc = bc;
		this.pc = pc;
		this.tc = tc;
	}
	
	public void displayCollections()
	{
		System.out.println("Here is the list of items we corrently have :\n");
		/* without iterator*/
		/*  
		List<Book> books = bc.getBookList();
		for(Item b: books)
			System.out.println(b);
		
		Item[] pens = pc.getPenList();
		
		for(int i = 0; i < pc.getLatestEntry(); i++)
			System.out.println(pens[i]);
		
		HashMap<Integer, Toy> toys = tc.getToyList();
		
		toys.entrySet().forEach(entry->{
		    System.out.println(entry.getValue());  
		 });*/
		 
		
		displayCollection(bc.iterator());
		displayCollection(pc.iterator());
		displayCollection(tc.iterator());
	   
		
		
	}
	
	public void displayCollection(Iterator it)
	{

		while(it.hasNext())
		{
			Item item = (Item) it.next();
			if(item != null)
				System.out.println("\t"+item);
		}
		
	}
	
}

