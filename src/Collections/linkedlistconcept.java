package Collections;

import java.util.LinkedList;

public class linkedlistconcept {



   public static void main (String[]args){

       LinkedList<String> l1 =new LinkedList<String>();

       l1.add("sharma");
       l1.add("lav");
       l1.add("Washington");
       l1.add("gupta");
       l1.add("tony");
       l1.add("seattle");


       System.out.println(l1);

       l1.addFirst("chakna");

       System.out.println(l1);

       System.out.println(l1.getFirst());
       System.out.println(l1.get(2));
       System.out.println(l1);
       System.out.println(l1.set(4,"whatsapp"));
       System.out.println(l1);

//       for (int i=0;i<l1.size();i++){
//
//           System.out.println(l1.get(i));
//       }


       for (String str:l1){
           System.out.println(str);
       }
   }


}
