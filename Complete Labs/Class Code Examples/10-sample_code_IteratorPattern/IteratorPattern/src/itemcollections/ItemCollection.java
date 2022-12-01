package itemcollections;

import items.Book;
import items.Item;
import items.Pen;

public interface ItemCollection<T extends Item> extends Iterable{

	public void addItem(T item);
}


/*
Another way of defining the iterator pattern is

--> public interface ItemCollection<T extends Item>{
}

Then say,
 public class BookCollection implements ItemCollection<Book>, Iterable<Book>
 {
 ...
 }
public class PenCollection implements ItemCollection<Pen>, Iterable<Pen>
{
 ...
}

public class ToyCollection implements ItemCollection<Toy>, Iterable<Toy>
{
 ...
}

*/