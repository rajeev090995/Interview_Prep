package Program_practrice;

public class Quicksort {


    public static int partition(int arr[], int low, int high) {


        int pivot = arr[low];
        int i = low;
        int j = high;


        while (i < j) {

            do {
                i++;
            }
            while (arr[i] <= pivot);
            do {
                j--;
            }
            while (arr[j] > pivot);

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp1 = arr[low];
        arr[low] = arr[j];
        arr[j] = temp1;

        return j;


    }


    public static void quicksort(int arr[], int low, int high) {


        if (low < high) {

            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot);
            quicksort(arr, pivot + 1, high);

        }

    }

    public static void main(String[] args) {

        int arr[] = {10, 2, 4, 15, 20, 9, 6, 18, 16};

        quicksort(arr, 0, 8);


    }


}
