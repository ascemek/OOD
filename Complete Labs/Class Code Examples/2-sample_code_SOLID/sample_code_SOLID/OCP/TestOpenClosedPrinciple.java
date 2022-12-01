
interface Shape{

	public double area();
}

class Circle implements Shape{
	
	private double radius;
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	@Override
	public double area()
	{
	 
		  return Math.PI * radius;
	}
}


class Rectangle implements Shape{
	
	private double length;
	private double width;
	
	@Override
	public double area()
	{
	 
		  return length * width;
	}
}


class Triangle implements Shape{
	
	private double base;
	private double height;
	
	@Override
	public double area()
	{
	 
		  return 0.5 * base * height;
	}
}


public class TestOpenClosedPrinciple {
	
	
	public static void main(String[] args) {
		
		
		Circle s1 = new Circle(3.55);
		
		System.out.println(s1.area());
		
	}

}
