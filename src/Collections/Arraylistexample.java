package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistexample {

	//Accepts duplicate values. It guarantee the elements oder 
	
	public static  void main (String[]args){
		
       ArrayList <String> a1= new ArrayList<String> ();	
		
       a1.add("Java");
       a1.add(0,"Science");
	   System.out.println(a1);
	   a1.add("Maths");
	   a1.add(1,"Caio");
	   System.out.println(a1);
//	   a1.remove(1);
//	   a1.remove("Science");
//	   System.out.println(a1);
	   System.out.println(a1.contains("Science"));
	   System.out.println(a1.indexOf("Java"));
	   System.out.println(a1.size());
       System.out.println(a1.isEmpty());	
	
       Iterator<String> i =a1.iterator();
       while (i.hasNext()){
     
              System.out.println(i.next());
       }
	}
}
