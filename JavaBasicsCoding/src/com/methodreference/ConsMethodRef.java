package com.methodreference;

public class ConsMethodRef {

	public static void main(String[] args) {
		message m=Display::new;
         m.getMessage("Constructor method reference");
	}

}
class Display{
	Display(String msg){
	System.out.println(msg);	
}
}
interface message{
	Display getMessage(String mes) ;
		
	
}