package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorSample {

	public static void main(String[] args) {
      TreeSet<login>ts=new TreeSet<login>(new Unamecompare());
      ts.add(new login("Abi","welcome"));
      ts.add(new login("Benny","star"));
      ts.add(new login("karthi","moon"));
      ts.add(new login("Hari","ddd"));
		
		for(login l:ts) {
			System.out.println(l);
		}
	}

}
class Unamecompare implements Comparator<login>{

	@Override
	public int compare(login l1, login l2) {
		
		return l1.getUsername().compareTo(l2.getUsername());
	}
	
}

class login {
	private String Username;
	private String password;
	
	
	public login(String username, String password) {
		super();
		Username = username;
		this.password = password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Name:"+this.Username+  "Password:"   +this.password;
	}
}