package proxy2;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements AccessInternet{

	AccessInternet internet;
	private static List<String> bannedSites; 
	
	static
    { 
        bannedSites = new ArrayList<String>(); 
        bannedSites.add("https://www.youtube.com/"); 
        bannedSites.add("https://maven.apache.org/"); 

    }
	
	
	@Override
	public void loadPage(String url) throws Exception {
	
		if(bannedSites.contains(url.toLowerCase())) 
        { 
            throw new Exception("Access Denied"); 
        } 
          
        if(internet == null)
        	internet = new RealInternet();  // on demand, lazy initialization
        internet.loadPage(url); 
		
	}

}
