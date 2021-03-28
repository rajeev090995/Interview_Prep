package Collections;

import java.util.*;

public class genericsandarraylist {


    public static void main(String[]args){


        List<Integer> values = new ArrayList<Integer>();

        values.add(212);
        values.add(545);
        values.add(3143);
        values.add(1236);
        values.add(67454);


        Comparator<Integer> com = new COMimpl();

        Collections.sort(values,com);


//        Iterator i = values.iterator();
//
//        while (i.hasNext()){
//
//            System.out.print(i.next());
//
//        }


        for (Object i:values){

            System.out.println(i);
        }

    }
}
