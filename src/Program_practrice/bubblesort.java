package Program_practrice;

import java.util.Arrays;

public class bubblesort {


    public static void main(String[] args) {

        int[] arr = {5, 4, 1, 6, 2, 7};
        int[] unsorted = {10, 64, 34, 92, 12, 22, 11, 90, 9};

        bubblesort(arr);
        palindrone(454);
        int temp;

        System.out.println("After sorting array looks like " + Arrays.toString(arr));

        printarray(arr);


    }

    static  void printarray(int arr[]){

        int k;

        for (k=0;k>arr.length;k++){

            System.out.print(arr[k]+ "  ");
            System.out.println();
        }
    }

    static void palindrone(int checkpalindronenumber) {


        int i = checkpalindronenumber / 10;
        int j = checkpalindronenumber % 10;
        int expectednumber = 10 * i + j;

        System.out.println(expectednumber);


        if (checkpalindronenumber == expectednumber) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");

        }
    }

    public static void bubblesort(int[] arr) {
        int temp;
        boolean swapped =false;

        System.out.println(" Before sorting array looks like " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {


            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    temp = arr[j];

                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;

                }
            }
            if (swapped == false)

                break;


        }


    }


}
