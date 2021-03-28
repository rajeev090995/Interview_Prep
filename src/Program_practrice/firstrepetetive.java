package Program_practrice;

import java.util.HashMap;
import java.util.Map;

public class firstrepetetive {

     static int findfirstrepetetive(int arr1[]){



        for (int i=0;i<arr1.length;i++) {

            int j;

            for ( j = 0; j < arr1.length; j++)

                if (i != j && arr1[i] == arr1[j])
                    break;
            if (j == arr1.length)

                return arr1[i];
        }
            return -1;


        }


         static void usinghashmap(int arr[],int n){


             Map<Integer,Integer> hm= new HashMap<Integer, Integer>();

             for (int i=0; i<n; i++){

                 if(hm.containsKey(arr[i])){
                     hm.put(arr[i],hm.get(arr[i])+ 1);
                 }
                else {
                    hm.put(arr[i],1);
                 }

             }

             for (Map.Entry<Integer,Integer> st:hm.entrySet()){

                  if (st.getValue()==1){
                      System.out.println(st.getKey());

                  }

             }


        }


        static int maxnumber(int arr2[]){

         int n= arr2.length;
          int max=arr2[0];
         for (int i=0;i<n;i++)

                 if (arr2[i]> max)
                    max =arr2[i];


             return max;
         }





    public static void main(String[]args){

        int arr[] = { 9, 4, 9, 6, 7, 4,2};

        int arr1[]={10,3,5,2,15,7,25,7};


//          System.out.println(findfirstrepetetive(arr));
        int number= arr.length;
        firstrepetetive.usinghashmap(arr,number);
//        System.out.println(maxnumber(arr1));



    }
}
