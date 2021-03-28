package Program_practrice;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class phonepe {

    public static int checkmaxsubarray(int arr[]) {

        int length = arr.length;
        int maxsum = 0;
        int sum = 0;


        for (int i = 0; i < length; i++) {

            sum = sum + arr[i];

            if (sum < 0) {
                sum = 0;
            } else if (maxsum < sum)
                maxsum = sum;

        }

        System.out.println(maxsum);
        return maxsum;
    }

    public static void checkanagram(String a, String b) {


        int length1 = a.length();
        int length2 = b.length();
        char temp;
        char first[] = a.toCharArray();

        char second[] = a.toCharArray();

        if (length1 != length2) {

            System.out.println("It is not anagram");
        }

        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length1; j++) {

                if (first[i] < first[j]) {

                    temp = first[i];
                    first[i] = first[j];
                    first[j] = temp;

                }

            }
        }

        System.out.println(first);


    }

    public static void checkanagramviahashmap(String a, String b) {

        int length1=a.length();
        int length2=b.length();
        int k=0;
        if (length1 != length2) {

            System.out.println("It is not anagram");
        }
        char c[]=a.toCharArray();
        char d[]=b.toCharArray();

        Map<Character,Integer> map1= new HashMap<>();


        for (int i=0;i<length1;i++) {

            if (map1.containsKey(c[i])) {
                map1.put(c[i], map1.get(i)+1);

            }
            else {
                map1.put(c[i],1);
                System.out.println(map1.get(c[i]));
            }

        }

        while (k<length1){

          if (map1.containsKey(d[k])){

                System.out.println("It is anagram");
            }
            else {
                System.out.println("it is not a anagram");
            }
            k++;
        }

        System.out.println(map1);


    }


    public static void main(String[] args) {


        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        String a = "dog";
        String b = "god";

//        checkmaxsubarray(arr);
//        checkanagram(a, b);
        checkanagramviahashmap(a, b);


    }


}
