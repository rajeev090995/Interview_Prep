package Program_practrice;

import java.util.*;

public class games {


        public static void removeduplicates(String a){

            char b[]=a.toCharArray();



//            List<Character> list1= new ArrayList<>();

            Set<Character> set1= new HashSet<>();

            for (char f: a.toCharArray()){

//                list1.add(f);
                set1.add(f);

            }

            String array1[]= set1.toArray(new String[set1.size()]);
            System.out.println(Arrays.toString(array1));


//            System.out.println(set1);

        }


        public static void main(String []args){

            String a ="aaaaaabbbbbddddhhhhg";



            removeduplicates(a);


        }
    }


