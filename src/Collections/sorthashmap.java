package Collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class sorthashmap {
    public static void main(String[] args) {

        HashMap<Integer, String> unsortMap = new HashMap<Integer, String>();
        unsortMap.put(85, "English");
        unsortMap.put(69, "Maths");
        unsortMap.put(22, "Social");
        unsortMap.put(99, "Science");
        unsortMap.put(88, "Chemistry");
        unsortMap.put(55, "Physics");


        printMap(unsortMap);

        System.out.println("\nSorted Map......By Key");
        Map<Integer, String> treeMap = new TreeMap<Integer, String>(
                new Comparator<Integer>() {

                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }

                });


        treeMap.putAll(unsortMap);

        printMap(treeMap);

    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }

}
