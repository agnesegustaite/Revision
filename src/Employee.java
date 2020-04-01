package defaultpackage;

import java.util.Random;
public class Employee {
	
   private int id; //instance variable id
   private String name; //instance variable name
   private String position; //instance variable position
   private String department; //instance variable department
   private String company; //instance variable company
   private double salary; //instance variable salary
	
   //constructor with 4 params, except id and department
   this.name = name;
   this.position = position;
   this.company = company;
   this.salary = salary;
	
   //inside the constructor generate a random number between 1 and 100 as ID number
   Random random = new Random();
   int id = random.nextInt(100)+1;
   this.id = id;
   
   //inside the constructor provide a message for department "Department not yet assigned";
   this.setDepartment("Department not yet assigned");
   
	}
   
   //declare set get Methods for department, position, salary
	public void setDepartment(String department) {
		this.department = department;
	}