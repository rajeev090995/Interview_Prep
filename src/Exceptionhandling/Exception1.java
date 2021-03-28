package Exceptionhandling;
import  Inheritances.pota ;
import Constructors.child;;

public class Exception1  {
	
	public static void main(String[]args){
		
		int i=7;
		int j=0;
		
		
		
		
		int b[]={12,14,16,17,14};
	try{			
		b[9]=15;
	    int k=i/j;
		
//		child  c1 =new child();
//		c1.getdata();
	}
	
	
	catch(ArithmeticException e) {
		
		System.out.println(e);
	}
	catch (ArrayIndexOutOfBoundsException f){
		
		System.out.println(f);
	}
	
	finally {
		
		System.out.println("This is the final block");
		
		child  c1 =new child();
        	c1.getdata();
        	
        	System.out.println("Final Block end");
	}
		
	
	}
	
		
	}
