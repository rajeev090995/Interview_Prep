package Collections;


import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class Hashtableconcept {


    public static void main(String[] args) {

        //Contains unique values
        //No null key and null values
        //Synchronised



        Hashtable h1 = new Hashtable();

        h1.put(1, "TOM");
        h1.put(2, "JERRY");
        h1.put(3, "SANDY");


        //create a clone of one hashtable
        Hashtable h2 = new Hashtable();

        h2 = (Hashtable) h1.clone();


        System.out.println("Values from : " + h1);

        System.out.println("Values from : " + h2);

        h1.clear();
        System.out.println("Values from : " + h1);
        System.out.println("Values from : " + h2);


        //Containsvalue method

        Hashtable st = new Hashtable();

        st.put("A", "Bawa");
        st.put("B", "Baloo");
        st.put("C", "Ek no bade");

        if (st.containsValue("Bawa")) {
            System.out.println(" Found it");
        } else {
            System.out.println(" Didn't found ");

        }

        //print all the values using --Enumeration --elements in Hashtable. (instead of for each and iterator)

        Enumeration e = st.elements();

        while (e.hasMoreElements())
            System.out.println(e.nextElement());


        if (!st.containsKey("D")) {
            st.put("B", "Khatarnak");
        } else {
            System.out.println(" Didn't found ");
        }

         Enumeration e1= st.elements();
        while (e1.hasMoreElements())
            System.out.println(e1.nextElement());


        // get all the values using enumeration using entry set.
        //Convert into Set.

     Set set1= st.entrySet();

        System.out.println(set1);


        if(h1.equals(h2)){
            System.out.println("Equals");
        }
         else {
            System.out.println("Not Equals");
        }

        System.out.println(st.get("A"));

        System.out.println(st.hashCode());
    }
}
