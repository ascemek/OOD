package proxy2;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class RealInternet implements AccessInternet{

   @Override
   public void loadPage(String urlInput) throws IOException
   {
	   	
	      URL url = new URL(urlInput);
	     
	      Scanner sc = new Scanner(url.openStream());
	      
	      StringBuffer sb = new StringBuffer();
	      
	      while(sc.hasNext()) {
	         sb.append(sc.next());
	      }
	     
	      String result = sb.toString();
	      System.out.println(result);
	   
	      result = result.replaceAll("<[^>]*>", "");
	      System.out.println("Contents of the web page: "+result);
	   
   }
}