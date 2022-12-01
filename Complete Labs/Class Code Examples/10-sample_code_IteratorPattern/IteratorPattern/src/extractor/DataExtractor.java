package extractor;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

import itemcollections.BookCollection;
import itemcollections.PenCollection;
import itemcollections.ToyCollection;

import items.Book;
import items.Item;
import items.Pen;
import items.Toy;

public class DataExtractor{
	
	enum CollectionTypes{
		BOOK,
		PEN,
		TOY,
	};
	
				
	public Pair<CollectionTypes, Item> itemFactory(String d, CollectionTypes typeClue)
	{
		Item i;
		String[] data = d.split(", ");
		switch (typeClue)
		{
			case BOOK:
				i = new Book(data);
				break;
			case PEN:
				i = new Pen(data);
				break;
			case TOY:
				i = new Toy(data);
				break;
			default:
				i = null;
			
		}	
		
		Pair<CollectionTypes, Item> myPair = new Pair<CollectionTypes, Item>(typeClue, i);
		return myPair;
		
	}
	
	public Pair<CollectionTypes, Item> process(String s) {
		
		String[] clues = s.split(":");	
		CollectionTypes ct = CollectionTypes.valueOf(clues[0]);
		String info = clues[1];
		return itemFactory(info, ct);
   }
	
	public void updateCollection(BookCollection bcc, 
			PenCollection pcc,  
			ToyCollection tcc, 
			String fileName) {
		
	List<String> dLst = ReadingFromDataFile.readData(fileName);
	
		for(String s: dLst)
		{
			Pair<CollectionTypes, Item> i = process(s);
			
			
			switch (i.getKey())
			{
				case BOOK:
					bcc.addItem((Book)i.getValue());
					break;
				case PEN:
					pcc.addItem((Pen) i.getValue());
					break;
				case TOY:
					tcc.addItem((Toy) i.getValue());
					break;
				default:
					System.out.println("Unrecognized item...");
				
			}	
		}
	}
	
	
}


