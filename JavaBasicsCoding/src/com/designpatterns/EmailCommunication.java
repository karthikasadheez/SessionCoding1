package com.designpatterns;

import com.designpatterns.Employee;
public class EmailCommunication implements Communication {

	@Override
	public void process(Employee emp) {
		System.out.println(emp.getName()+"Commiunicated via Email:"+emp.getEmail());
		
	}

}
