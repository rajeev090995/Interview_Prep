package Collections;

import java.lang.reflect.Array;
import java.util.*;

public class treeset {

    public static void inttosetandtreeset(Integer a[]) {

        Set<Integer> st = new HashSet<Integer>();

        for (int i = 0; i < a.length; i++) {

            st.add(a[i]);
        }

        TreeSet<Integer> sortedset = new TreeSet<Integer>(st);

        System.out.println(sortedset);

    }


    public static void usinglistandtreeset(Integer[] b) {

//        Integer[] count=a;

        List<Integer> list1 = Arrays.asList(b);

        Set<Integer> st = new TreeSet<Integer>(list1);


        System.out.println(st);

        System.out.println("The first element:- " + ((TreeSet<Integer>) st).first());
        System.out.println("The Last element:-  " + ((TreeSet<Integer>) st).last());


    }

    public static void main(String[] args) {


        Integer count[] = {23, 2, 55, 12, 1, 23, 18, 19, 8, 0};

        inttosetandtreeset(count);
        usinglistandtreeset(count);


    }

}
