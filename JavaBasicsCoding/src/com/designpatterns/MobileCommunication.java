package com.designpatterns;

public class MobileCommunication implements Communication {

	@Override
	public void process(Employee emp) {
		System.out.println(emp.getName()+"Commiunicated via mobile:"+emp.getPhonenumber());
		
	}

}
