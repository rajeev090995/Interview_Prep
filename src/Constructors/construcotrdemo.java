package Constructors;

public class construcotrdemo {

	
	 construcotrdemo(int a) {
        System.out.println("I am in the first Constructors");
	 }
	
	 public construcotrdemo(String a){
				
		 System.out.println(a);
	}
	 
	 public static void main (String[]args){
		 
		 
		construcotrdemo c2 =new construcotrdemo("Wah Taj");
		construcotrdemo c1=new construcotrdemo(15);
		
	 }
	 
}
