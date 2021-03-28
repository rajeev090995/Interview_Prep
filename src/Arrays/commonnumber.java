package Arrays;

import java.util.ArrayList;

public class commonnumber {


    public static void main (String[]args){


        int Arr1[]={1,2,3,4,5};
        int Arr2[]={6,7,2,1,9};

        ArrayList<Integer> Arr3= new ArrayList<>();

        for(int i=0;i<Arr1.length;i++){

            for(int j=0;j<Arr2.length;j++){

                if (Arr1[i]==Arr2[j]){

                    Arr3.add(Arr1[i]);
                }
            }
        }
        System.out.println(Arr3);

    }
}