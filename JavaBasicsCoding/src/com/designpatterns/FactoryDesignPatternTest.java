package com.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class FactoryDesignPatternTest {

	public static void main(String[] args) {
	 List<Employee>emplist=createEmployeeList();
     
	 CommunicationFactory factory=new CommunicationFactory(); 
	 
	 Communication Processer;
	  
	 for(Employee emp:emplist) {
		 Processer=factory.getProcess(emp.getModeOfContact()); 
		 Processer.process(emp);
	 
	 }
	
	System.out.println("Using Java8");
	emplist.forEach(emp->{factory.getProcess(emp.getModeOfContact()).process(emp);});
		
	}
private static List<Employee>createEmployeeList(){
	List<Employee> emplist=new ArrayList<>();

  Employee e1=new Employee("Abi","1","Chennai",25,"email","Abi@gmail.com","978654903");
  Employee e2=new Employee("Hari","3","Pune",23,"mobile","Hari@gmail.com","878654903");
  Employee e3=new Employee("John","6","Hydrabad",28,"email","John@gmail.com","904654903");
  Employee e4=new Employee("Harry","8","Mysore",24,"mobile","Harry@gmail.com","907654903");
  Employee e5=new Employee("cally","5","Bangalore",27,"email","cally@gmail.com","955654903");

  emplist.add(e1);
  emplist.add(e2);
  emplist.add(e3);
  emplist.add(e4);
  emplist.add(e5);

return emplist;   

}
}
