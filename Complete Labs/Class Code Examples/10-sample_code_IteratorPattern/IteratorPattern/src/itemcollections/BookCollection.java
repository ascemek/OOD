package itemcollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import items.Book;
import items.Item;

public class BookCollection implements ItemCollection<Book>{

	private List<Book> bookList;
	
	public BookCollection()
	{
		bookList = new ArrayList<Book>();
	}
	
	public BookCollection(List<Book> books)
	{
		bookList = books;
	}
	
	@Override
	public void addItem(Book book) {
		bookList.add(book);
		
	}
	
	public List<Book> getBookList()
	{
		return bookList;
	}


	@Override
	public Iterator<Book> iterator() {
		return bookList.iterator();
	}

	
}
