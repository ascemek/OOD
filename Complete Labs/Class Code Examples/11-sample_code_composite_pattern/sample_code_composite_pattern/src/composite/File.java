package composite;

public class File extends Component{
		
		// file is a simple/primitive class
		
		private String type;
		
		public File(String fileName, String type,  Double size)
		{
			super(fileName, size);
			this.type = type;
		}
		
		
		public String getType() { return type; }
		
		public void setType(String type) { this.type = type; }
		
		public String toString() { return "FileName: " 
				+ getName() + "." + type 
				+ ", size: " + getSize(); }
}


