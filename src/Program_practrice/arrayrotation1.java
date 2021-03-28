package Program_practrice;

import java.util.ArrayList;

public class arrayrotation1 {


    public static  void shiftingarray(int num,int arr[]){

         int j=0;
        ArrayList<Integer> a1= new ArrayList<>();
        ArrayList<Integer> a2= new ArrayList<>();
        for (int i=0;i<num;i++){

            a1.add(arr[i]);
        }

        for (int i=num;i<arr.length;i++){

            a2.add(arr[i]);
//            arr[j]=arr[i];
//            j++;

        }
        a2.addAll(a1);
//        System.out.println(a1);
        System.out.println(a2);

    }


    public static void main (String[]args){


        int arr[]={1,2,3,4,5};

        shiftingarray(4,arr);

    }

}
