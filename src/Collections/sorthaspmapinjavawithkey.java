package Collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class sorthaspmapinjavawithkey {

    public static void main(String[] args) {


        //unique elements
        //hashmap is a class implements map Interface
        //stores in key-value pair
        //it maintains no order
        //it can hold multiple node values as well
        //hashmap is not-synchronised -- not thread safe
        //concurrent modification exception --fail fast condition
        // occurs when one thread is updating the value and simultaneously other thread is fetching(Deadlock)

        HashMap<Integer, String> unsortMap = new HashMap<Integer, String>();

        unsortMap.put(85, "English");
        unsortMap.put(69, "Maths");
        unsortMap.put(99, "Science");
        unsortMap.put(22,"Social");
        unsortMap.put(88, "Chemistry");
        unsortMap.put(55, "Physics");
        unsortMap.put(75, "Physics");


//        printMap(unsortMap);


        for (Map.Entry entry:unsortMap.entrySet()){

            System.out.println("Key : "+entry.getKey() +
                    " Value : "+entry.getValue());
        }

        System.out.println("\nSorted Map......By Key");

        Map<Integer, String> treeMap = new TreeMap<Integer, String>(
                new Comparator<Integer>() {

                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }

                });


        treeMap.putAll(unsortMap);

//        printMap(treeMap);


        for (Map.Entry entry:treeMap.entrySet()){

            System.out.println("Key : "+entry.getKey() +
                    " Value : "+entry.getValue());
        }

    }

//    public static <K, V> void printMap(Map<K, V> map) {
//        for (Map.Entry<K, V> entry : map.entrySet()) {
//            System.out.println("Key : " + entry.getKey()
//                    + " Value : " + entry.getValue());
//        }

}