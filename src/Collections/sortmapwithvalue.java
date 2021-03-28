package Collections;

import java.util.*;

public class sortmapwithvalue {


    public static HashMap<String, Integer> sortbyvalue(HashMap<String,Integer> sortvalue) {

        List<Map.Entry<String, Integer>> entries = new LinkedList<Map.Entry<String, Integer>>(sortvalue.entrySet());

        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {

                return (o1.getValue().compareTo(o2.getValue()));
            }
        });


        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();

        for (Map.Entry<String, Integer> st : entries) {

            temp.put(st.getKey(), st.getValue());
        }

        return temp;


    }


    public static void main(String[] args) {

        HashMap<String, Integer> unsortMap = new HashMap<String, Integer>();

        unsortMap.put("English", 85);
        unsortMap.put("Maths", 69);
        unsortMap.put("Science", 99);
        unsortMap.put("Social", 22);
        unsortMap.put("Chemistry", 88);
        unsortMap.put("Physics", 55);
        unsortMap.put("Physics", 75);

        Map<String,Integer>hm1= sortbyvalue(unsortMap);


        for(Map.Entry<String,Integer>st:hm1.entrySet()){

            System.out.println("Key :- "+ st.getKey()+"  value :- " +st.getValue());


        }

    }

}


