package Program_practrice;

import java.util.HashMap;
import java.util.Map;

public class walmart {


    // array

//    Map<> value = new hashmap<>;


    public static void checktriplets(int arr[], int size, int finalsum) {


        for (int i = 0; i < size - 2 ; i++) {


            Map<Integer,Integer> map1=new HashMap<>();

            int initialsum = finalsum - arr[i];

            for (int j = i + 1; j < size; j++) {

                int currentsum=initialsum-arr[j];

                if (map1.containsKey(currentsum)){

                    System.out.println("The value's are:- "+arr[i]+" , "+arr[j]+", "+currentsum);
                }

                map1.put(arr[j],j);
            }
        }

    }


    public static void main(String args[]) {

        int input[] = {12, 3, 1, 2, -6, 5, -8, 6};

        int input1[]={-8,-6,1,2,3,5,6,12};
        int sum = 0;
        int size = input.length;
        checktriplets(input,size,sum);
    }


}
