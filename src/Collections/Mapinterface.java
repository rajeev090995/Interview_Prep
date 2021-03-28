package Collections;

import java.util.*;

public class Mapinterface {


    public static void main(String[]args) {


        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
        hm.put(1, "Monday");
        hm.put(2, "Tuesday");
        hm.put(3, "Wednesday");
        hm.put(4, "Thrusday");
        hm.put(5, "Friday");
        hm.put(6, "Saturday");
        hm.put(7, "sunday");

        System.out.println(hm.get(7));
//        hm.remove(7);
        System.out.println(hm.get(5));


        Set sn = hm.entrySet();

        Iterator it = sn.iterator();
        while (it.hasNext()) {

//            System.out.println(it.next());


            Map.Entry mp = (Map.Entry) it.next();
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());

        }
        //containskey(KEY)
        //keyset
        //entryset

    }
    }
