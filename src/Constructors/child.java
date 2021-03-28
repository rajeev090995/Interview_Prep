package Constructors;

import Inheritances.pota;

public class child extends Parent{

	 public child(){
		
		super();
		System.out.println("This is the child");
	}
	
	String name =" Don't know my name";
	
	public void getdata(){
	
		String name ="Whatsup";	
		super.getdata();
		System.out.println(name.concat(this.name));
	    System.out.println(super.name);
	    
	}

	public static void main (String[]args){
		
//		Parent p =new Parent();
//		child cd = new child();
//		cd.getdata();
//	    p.getdata();
		pota p1 =new pota();
		  p1.City();
//		  p1.Country();
		  p1.Family("boss");
//           	
	try {
		int i = 7;
		int j=0;
	  
		int k=i/j;
		
	}
	
	catch(Exception e){
		System.out.println("There is some error in try block.");
	  
	  }
	}
}
