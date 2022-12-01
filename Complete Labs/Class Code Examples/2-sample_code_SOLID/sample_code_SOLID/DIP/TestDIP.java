//import java.util.ArrayList;
import java.util.List;

//import org.javatuples.Triplet;

interface Developer
{
	void develop();
}



class BackEndDeveloper implements Developer{
    
	// write java code
	public void writeJava() {
    }

	@Override
	public void develop() {
		writeJava();
		
	}
}
//Encapsulation

class FrontEndDeveloper implements Developer{
   
	public void writeJavaScript() {
    }

	@Override
	public void develop() {
		writeJavaScript();
		
	}
    

}



class Project implements Developer{
        
		private List<Developer> dev;
		
		Project(List<Developer> dev)
		{
			this.dev = dev;
		}
		
        @Override 
        public void develop() {
           for (Developer d: dev)
        	   d.develop();
        }
    }


public class TestDIP{

	public static void main(String[] args) {
		
		
		
		
	}
}

