package demoExample;
//import java.io.File;

import java.util.List;
import client.Store;
import extractor.DataExtractor;
import itemcollections.BookCollection;
import itemcollections.PenCollection;
import itemcollections.ToyCollection;


public class DemoCollections {

	public static void main(String[] args) {
		
		DataExtractor et = new DataExtractor(); // factory method
		
		BookCollection bc= new BookCollection();
		PenCollection pc = new PenCollection();
		ToyCollection tc = new ToyCollection();
		
		et.updateCollection(bc,pc, tc, "CollectionInfo.txt");
		
		Store myStore = new Store(bc, pc, tc);
		
		myStore.displayCollections();
		
		
	}

}
