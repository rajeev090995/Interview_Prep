package ProblemSolvingInterviewRajeev.Array;

public class Program13 {

    static void min(int arr1[]) {

        int min = arr1[0];

        int k;
        for (k = 0; k < arr1.length; k++) {

            if (min > arr1[k]) {

                min = arr1[k];

            }
        }

        System.out.println(min);

    }

    public static void max(int arr2[]) {


        int max = arr2[0];
        int j;
        for (j = 0; j < arr2.length; j++) {

            if (max < arr2[j]) {

                max = arr2[j];
            }
        }
        System.out.println(max);
    }


    public static void secondmax (int arr3[]) {

        int max1 =arr3[0];
        int secondmax1=arr3[0];
        int i;
        for (int l=0;l<arr3.length;l++){

            if (arr3[l]>max1) {

                secondmax1 = max1;
                max1 = arr3[l];
            }
            else if (arr3[l]>secondmax1){

                secondmax1=arr3[l];

            }

        }

        System.out.print(secondmax1);
    }


    public static void main(String []args){
        System.out.println("Program Start");
        int ac[]={15,14,47,10,45} ;
        min(ac);
        secondmax(ac);


    }
}
