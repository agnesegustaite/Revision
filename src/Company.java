import java.util.Scanner;
public class Company {
	
    public static void main(String[] args) {
    	
        //declare and create 3 objects(as a employee1,2,3) and set params
    	Employee employee1 = new Employee("Rob", "doctor", "Qlinic", 2500);
    	Employee employee2 = new Employee("Bob", "salesperson", "Rimi", 1000);
    	Employee employee3 = new Employee ("Tim", "businessman", "Cabot", 1400);
  
    	
    	//set department for your employees
    	employee1.setDepartment("Medicine");
    	employee2.setDepartment("Sales");
    	employee3.setDepartment("Business");
    	
        int sal1 = employee1.getSalary();
        int sal2 = employee2.getSalary();
        int sal3 = employee3.getSalary();

        System.out.println("After 1 year inside the company:");
        //set to change your employee promotion from position to salary
        employee1.setPosition("lead doctor");
        employee1.setSalary(5000);
        
        employee2.setPosition("manager");
        employee2.setSalary(1200);
        
        employee3.setPosition("top businessman");
        employee3.setSalary(3500);
        
        //calculate employees salary difference after 1 year
 
        int salNew1 = employee1.getSalary();
        int salNew2 = employee2.getSalary();
        int salNew3 = employee3.getSalary();

        int diff1 = salNew1 - sal1;
        int diff2 = salNew2 - sal2;
        int diff3 = salNew3 - sal3;
        
        
      //out print your employees
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        System.out.println("Employee with an id: " + employee1.getId() + " salary increase is " + diff1 + " EUR");
        System.out.println("Employee with an id: " + employee2.getId() + " salary increase is " + diff2 + " EUR");
        System.out.println("Employee with an id: " + employee3.getId() + " salary increase is " + diff3 + " EUR");

    }
}
    }
}