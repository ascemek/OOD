package proxy2;

public class DemoProxy2 {

	public static void main(String[] args) throws Exception
	{
		AccessInternet internet = new RealInternet();
		
		internet.loadPage("https://www.who.int/");
		//internet.loadPage("https://www.youtube.com/");
		
		
		AccessInternet proxyInt = new ProxyInternet();
		

		//proxyInt.loadPage("https://www.youtube.com/");
		
		
		proxyInt.loadPage("https://www.who.int/");
		
	}
	
	
}
