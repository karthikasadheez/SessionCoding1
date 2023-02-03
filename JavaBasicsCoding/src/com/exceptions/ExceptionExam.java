package com.exceptions;

public class ExceptionExam {

	public static void main(String[] args) {
		int i = 5;
		String s = null;
		try {
			System.out.println(s.length());
			i = 10 / 0;
			System.out.println(i);

		} catch (NullPointerException np) {
            np.printStackTrace();
		}
	      catch(ArithmeticException ar) {
	    	  ar.printStackTrace();
	      }
		// always  end of the exception because this is super class  
	      catch(Exception e) {
	    	e.printStackTrace();  
	      }
	
	}

}
