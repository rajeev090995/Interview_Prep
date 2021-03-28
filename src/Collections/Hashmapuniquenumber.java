package Collections;

import java.util.HashMap;

public class Hashmapuniquenumber {


    public static void main(String[]args) {

        int array1[] = {4, 5, 5, 4, 5, 6, 7, 6, 6, 9, 4};

        HashMap<Integer, Integer> a1 = new HashMap<Integer, Integer>();

        int count;

        for (int i = 0; i < array1.length; i++) {

            count = array1[i];

            if (a1.containsKey(count))
                a1.put(count, a1.get(count) + 1);


            else
                a1.put(count, 1);


        }

        for (int i = 0; i < array1.length; i++) {

            count = (array1[i]);

            if (a1.get(count) == 1)
                System.out.println(count);

        }

    }

}