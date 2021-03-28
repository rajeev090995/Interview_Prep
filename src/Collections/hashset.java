package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	//Not accept duplicate values. No guarantee of elements oder. It will return in random order.
	
	public static void main (String[]args){
		
		
	 HashSet<String> h1 =new HashSet<String>();	
		
	 h1.add("Java");
//     h1.add(0,"Science");
	   System.out.println(h1);
	   h1.add("Maths");
	   h1.add("Caio");
	   h1.add("Caio");
	   h1.add("Caio");
	   System.out.println(h1);
//	   h1.remove("Maths");
	   System.out.println(h1);
	   System.out.println(h1.contains("Science"));
//	   System.out.println(h1.indexOf("Java"));
	   System.out.println(h1.size());
       System.out.println(h1.isEmpty());	
	 
       Iterator<String> i= h1.iterator();
         
       while (i.hasNext()){
    	
    	   System.out.println(i.next());
       }
	}
	
}
