package Program_practrice;

import java.util.*;

public class findsecondrepetative {


    public static void findsecond(int arr[]) {

        int size = arr.length;
        int count = 0;
        Set<Integer> s1 = new HashSet<Integer>();


        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j])
                    s1.add(arr[i]);
            }

        }
        ArrayList<Integer> finalarray = new ArrayList<>(s1);
        System.out.println(finalarray.get(1));
    }


    public static void findsecondusingmap(int arr[]) {

        int count = 0;

        HashMap<Integer, Integer> mymap = new HashMap<>();

        for (int i : arr) {
            if (mymap.containsKey(i)) {

                mymap.put(i, mymap.get(i) + 1);
            } else {
                mymap.put(i, 1);
            }
        }


        for (int j : arr) {

            if (mymap.get(j) == 2) {

                count++;
            }
            if (count == 2) {
                System.out.println(j);
            }


        }

//        System.out.println(mymap);

    }


    public static void check(int n[]) {

        int temp = 0;

        int flag = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] == n[j]) {
                    flag = 1;
                    temp = n[i];
                }
                if (n[i] == n[j] && flag == 1 && n[i] != temp) {

                }
            }

        }
        System.out.println(temp);
    }


    public static void difference(Set l1, Set l2) {

       Set<String> union= new HashSet<>(l1);
       union.addAll(l2);
       Set<String> intersection= new HashSet<>(l1);
       intersection.retainAll(l2);
       union.removeAll(intersection);


           System.out.println(union);


    }

    public static void main(String[] args) {

        int inputarray[] = {3, 8, 7, 3, 7, 6};
        Set<String> set1 = new HashSet<>();
        set1.add("Iron Man");
        set1.add("Avengers");
        set1.add("Captain America");
        set1.add("Hulk");
        Set<String> set2 = new HashSet<>();
        set2.add("Avengers");
        set2.add("Black Panther");
        set2.add("Ant Man");
        set2.add("Iron Man");


        findsecond(inputarray);
        findsecondusingmap(inputarray);
//         check(inputarray);
        difference(set1, set2);

    }

}
