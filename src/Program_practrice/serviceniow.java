package Program_practrice;

import java.util.*;

public class serviceniow {


    public static void findrepeat(String a) {


        char c[] = a.toCharArray();

        int count = 0;

        HashMap<Character, Integer> map1 = new HashMap<>();


        for (int i = 0; i < c.length; i++) {

            if (map1.containsKey(c[i])) {
                map1.put(c[i], map1.get(c[i]) + 1);

            } else {

                map1.put(c[i], 1);
            }
        }
        System.out.println(map1);


    }

    public static void usingarray(String a) {
        char arr[] = a.toCharArray();
        int count = 0;
        List<Character> s1 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    s1.add(arr[i]);

            }
        }
        System.out.println(s1);
//        ArrayList<Character> finalarray = new ArrayList<>(s1);
    }


    public static void main(String[] args) {

        String a = "TodayisMonday";
        //output > o,d,a,y
        findrepeat(a);
        usingarray(a);
    }

}
