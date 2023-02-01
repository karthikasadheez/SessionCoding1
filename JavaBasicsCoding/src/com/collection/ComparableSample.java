package com.collection;

import java.util.TreeSet;

public class ComparableSample {
	public static void main(String[] args) {
		
	
TreeSet<User>obj1=new TreeSet<User>();
    
    obj1.add(new User("Abi"));
    obj1.add(new User("Benny"));
    obj1.add(new User("karthi"));
    obj1.add(new User("Hari"));
	
	for(User u:obj1) {
	System.out.println(u);	
	}
	
	}
	}
class User implements Comparable<User>{
 private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public User(String username) {
		
		this.username = username;
	}

	@Override
	public int compareTo(User u) {
		return this.username.compareTo(u.username);
	}

	@Override
	public String toString() {
		return "Name:"+this.username;
	
	}
	}
