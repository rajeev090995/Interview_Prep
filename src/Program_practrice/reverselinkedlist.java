package Program_practrice;

import java.util.LinkedList;

public class reverselinkedlist {


    public static void reverselinkedlist(LinkedList<String>l2){

        for(int i=l2.size()-1;i >0;i--){

            System.out.println(l2.get(i));
        }
    }


    public static void main(String[]args){

        LinkedList<String> l1 =new LinkedList<String>();

        l1.add("sharma");
        l1.add("lav");
        l1.add("Washington");
        l1.add("gupta");
        l1.add("tony");
        l1.add("seattle");


        System.out.println(l1);


        reverselinkedlist(l1);



    }
}
