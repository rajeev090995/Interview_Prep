package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmapconcepts {



    public static void main (String[]args){


        HashMap<Integer,employees> emp= new HashMap<Integer,employees>();


        employees e1= new employees ("lav sharma",233,"QA","PAYTM");
        employees e2= new employees ("Kiran",224,"QA","PAYTM");
        employees e3= new employees ("Rajesh",211,"DEV","PAYTM");
        employees e4= new employees ("Tom",247,"DEVOPS","PAYTM");
        employees e5= new employees ("RDJ",212,"Manager","PAYTM");


        emp.put(1,e1);
        emp.put(2,e2);
        emp.put(3,e3);
        emp.put(4,e4);
        emp.put(5,e5);

     for(Map.Entry<Integer,employees> em :emp.entrySet() ){

       int key = em.getKey();
       employees empl=em.getValue();

         System.out.println("Key INFO: "+ key+ " Value starts from here " );

         System.out.println(empl.name +" "+ empl.id +" "+empl.domain+ " " +empl.company);


     }



    }


}
