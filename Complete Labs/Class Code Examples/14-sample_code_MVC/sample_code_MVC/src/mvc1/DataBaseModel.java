package mvc1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import database_basics.*;


public class DataBaseModel implements Iterable{

	private Map<Integer, Student> students;
	
	public DataBaseModel()
	{
		students = new HashMap<Integer, Student>();	
	}
	
	public void LoadDataBase()
	{
		
		//default file
		String relativePath = "./";
		String fileName = "testSet01.txt";
		List<Student> db = ReadData.read(relativePath + fileName);
		
		for (Student s: db)
		{
			students.put(s.getId(), s);
		}	
		
	}
	

	public Integer getId(String name)
	{
		for(Integer k: students.keySet())
		{
			Student s = students.get(k);
			if(s.getName().equalsIgnoreCase(name))
				return s.getId();
		}
		return null;
		
	}
	
	
	public String getName(Integer id)
	{
		for(Integer k: students.keySet())
		{
			Student s = students.get(k);
			if(s.getId().equals(id))
				return s.getName();
		}
		return null;
		
	}
	
	@Override
	public Iterator iterator() {
		return students.values().iterator();
	}
	
	public void displayAll()
	{
		for(Integer k: students.keySet())
		{
			System.out.print(students.get(k));
		}
		
	}

	//inner class
	static class ReadData{
		
		public static List<Student> read(String filename) {
			
			String line = null;
			List<Student>  db = new ArrayList<Student>();
			
			
			try {
				BufferedReader bfReader = new BufferedReader(new FileReader(filename));
			
		        while((line = bfReader.readLine())!= null)
		        	{
		        		String[] data = line.split(",");
		        	 	Student s = new Student(data[0], data[1]);
		        	 	db.add(s);
		        	}
		        bfReader.close();
		        }
			catch (IOException e) {
				e.printStackTrace();
			}
			return db;	
			
		}
		
	}
	
}



/* just test
public static void main(String[] args)
{
	DataBaseModel dbm = new DataBaseModel();
	dbm.LoadDataBase();
	Iterator it = dbm.iterator();
	while(it.hasNext())
	{
		System.out.print(it.next());
	}
	//dbm.displayAll();
}
*/