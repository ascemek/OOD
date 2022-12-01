package proxy;

public class DemoProxyImage {
	
	public static void main(String[] args) {
	      Image image = new ProxyImage("test_10mb.jpg");

	      //image will be loaded from disk
	      image.showImage(); 
	      System.out.println("Image will be loaded from disk");
	      
	      //image will not be loaded from disk
	      image.showImage(); 	
	      System.out.println("Image will not be loaded from disk");
	   }

}
