package database_basics;

public class Student {
		
		private String name;
		private Integer id;
		
		public Student(String name, String id)
		{
			this.name = name;
			this.id = Integer.parseInt(id);
		}

		public String getName()
		{
			return this.name;
			
		}
		public Integer getId()
		{
			return this.id;
		}
		
		public String toString()
		{
			return "Name: " + name + ", ID: " + id + "\n";
		}

}


