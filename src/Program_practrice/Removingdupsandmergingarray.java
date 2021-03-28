package Program_practrice;


public class Removingdupsandmergingarray {


    public static void mergethearray(int arr1[], int arr2[]) {

        int array3[] = new int[arr1.length + arr2.length];

        int count = 0;
        int n = 0;

        for (int i = 0; i < arr1.length; i++) {

            array3[i] = arr1[i];

            count++;
        }

        for (int j = 0; j < arr2.length; j++) {

            array3[count] = arr2[j];
            count++;
        }

        while (n < array3.length) {

            System.out.println(array3[n]);
            n++;
        }


    }


    public static void main(String[] args) {

        int array1[] = {3, 4, 5, 6, 4, 12, 16};
        int array2[] = {5, 3, 2, 5, 12, 4, 8, 4};


        mergethearray(array1, array2);
    }


}
