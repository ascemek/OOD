import java.util.Comparator;

//import javax.lang.model.util.ElementScanner6;

/**
 * @author fahmidahamid
 * @author Sami Cemek
 * @date Aug 25 2021
 * @version 1.1
 * 
 * The Robot class is used to create a Robot object with the following properties:
 *  name, rank, salary, faceMask, bodyColor
 *  
 */
public class Robot implements Comparable<Robot>{

	private String name;
	private int rank;  // the lower the better
	private double salary; //per week
	private boolean faceMask; 
	private String bodyColor;
	
	
	Robot(){
		this.name = "essential worker";
		this.rank = 10; //lowest rank
		this.salary = 1000.00; //lowest possible salary
		this.faceMask = false; //
		this.bodyColor = "yellow";
	}
	
	Robot(Robot r){
		this.name = r.name;
		this.rank = r.rank; 
		this.salary = r.salary; 
		this.faceMask = r.faceMask; 
		this.bodyColor = r.bodyColor;
	}
	
	
	Robot(String[] information){
		this.name = information[0];
		this.rank = Integer.valueOf(information[1]); 
		this.salary = Double.valueOf(information[2]); 
		this.faceMask = Boolean.valueOf(information[3]); 
		this.bodyColor = information[4];
	}
	
	Robot(String name, int rank, double salary, boolean faceMask, String bodyColor)
	{
		this.name = name;
		this.rank = rank;
		this.salary = salary;
		this.faceMask = faceMask;
		this.bodyColor = bodyColor;
		
	}
	
	//Getters
    public String getName() {
        return name; 
    }

	public int getRank(){
        return rank;
    }

	public double getSalary(){
		return salary;
	}

	public boolean getFaceMask(){
        return faceMask;
    }

    public String getBodyColor(){
        return bodyColor;
    }
    
    //Setters
    public void setName(String robotName){
        this.name = robotName;
    }

	public void setRank(int rank){
        this.rank = rank;
    }

	public void setSalary(double salary){
		this.salary = salary;
	}

	public void setFacemask(boolean faceMask){
        this.faceMask = faceMask;
    }

    public void setBodycolor(String bodyColor){
        this.bodyColor = bodyColor;
    }

	//Task 2, alter the facemask status of the robot (if the mask is on, take it off and vice versa)
	public void alterFaceMask(){
		if(this.faceMask == true){
			this.faceMask = false;
		} else{
			this.faceMask = true;
		}
	}

	public String toString(){
		return (name + " is a rank" + rank + " robot. Salary is: " + salary + " Face mask: " + faceMask + "Body Color: " + bodyColor);
		 
		//return something like lieutenantRobot is a rank 1 robot.
	}

	@Override
	public int compareTo(Robot o) {

		return this.rank - o.rank;
	}
}

//Compare robots by their salary
class CompareBySalary implements Comparator<Robot>{
	@Override
	public int compare(Robot i, Robot j) {
	if(i.getSalary() > j.getSalary())
	return 1;
	else if (i.getSalary() < j.getSalary())
	return -1;
	else
	return 0;
	}
}

//Compare robots by their ranks
class CompareByRank implements Comparator<Robot>{
	@Override
	public int compare(Robot i, Robot j) {
	if(i.getRank() > j.getRank())
	return 1;
	else if (i.getRank() < j.getRank())
	return -1;
	else
	return 0;
	}
}

/* 
class CompareByName implements Comparator<Robot> {
	@Override
	public int compare(String obj1, String obj2) {
	  if (obj1 == obj2) {
		  return 0;
	  }
	  if (obj1 == null) {
		  return -1;
	  }
	  if (obj2 == null) {
		  return 1;
	  }
	  return obj1.compareTo(obj2);
	}
  }

Comparator<Robot> CompareByName = (Robot i, Robot j)->i.getName().compareTo(j.getName());
*/

  
