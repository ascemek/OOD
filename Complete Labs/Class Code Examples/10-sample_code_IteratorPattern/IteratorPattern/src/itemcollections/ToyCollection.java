package itemcollections;
//import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

//import items.Item;
import items.Toy;

public class ToyCollection implements ItemCollection<Toy>{

		
		HashMap<Integer, Toy> toyList;
		Integer id;
		
		public ToyCollection()
		{
			toyList = new HashMap<Integer, Toy>();
			id = 1;
		}
		
		@Override
		public void addItem(Toy i)
		{
			toyList.put(id, i);
			id++; 
		}
		
		
		public HashMap<Integer, Toy> getToyList()
		{
			return toyList;
		}

		@Override
		public Iterator<Toy> iterator() {
			return toyList.values().iterator();
		}

		
		
	}

