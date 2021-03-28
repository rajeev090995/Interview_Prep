package Program_practrice;

public class makemytrip {


    public static void findsecondmax(int arr[]) {

        int max = 0;
        int secondmax = 0;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                secondmax = max;
                max = arr[i];
            }

            if (arr[i] < max && secondmax<arr[i]){

                secondmax=arr[i];
            }
        }
        System.out.println(secondmax);

    }



public static void findpair (int arr2[]){



        for (int i=0;i<arr2.length;i++){

            for (int j=i+1;j<arr2.length;j++){

                if (arr2[i]+arr2[j]==9){

                    System.out.println(" Sum of two numbers equal to 9 are :" +arr2[i]+" and "+arr2[j]);
                }
            }
        }
    }

    public static void main(String[] args) {

        int array[] = {10, 55, -16, 22, 102, 4, 1, -32, 57};
        int arr[]={4, 5, 7, 11, 9, 13, 8, 12,14,-5};
//        findsecondmax(array);
        findpair(arr);
    }
}
