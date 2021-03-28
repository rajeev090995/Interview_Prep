package Program_practrice;

import java.util.ArrayList;
import java.util.HashMap;

public class Printuniquenumber {

    public static void main(String[] args) {

        int array1[] = {4, 5, 5, 4, 5, 5, 6, 6, 3, 5, 3, 6, 7, 8, 9, 9, 7, 8};

//    int array1[]={4,5,5,4,5,6,7,6,6,9,4};


        ArrayList<Integer> a1 = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            int count = 0;
            if (!a1.contains(array1[i])) {

                a1.add(array1[i]);
                count++;

                for (int j = i + 1; j < array1.length; j++) {

                    if (array1[i] == array1[j]) {

                        count++;

                    }

                }
                System.out.println(array1[i] + " total count:- " + count);
//         System.out.println();

            }


        }
    }
}