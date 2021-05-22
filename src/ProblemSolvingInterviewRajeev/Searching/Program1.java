package ProblemSolvingInterviewRajeev.Searching;
//Time Complexity: O(Log N), where N is the number of elements in the array.
public class Program1 {
    static int bSearch(int arr[], int n, int x)
    {
        int low = 0, high = n - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(arr[mid] == x)
                return mid;

            else if(arr[mid] > x)
                high = mid - 1;

            else
                low = mid + 1;
        }

        return -1;
    }

    public static void main(String args[])
    {
        int arr[] = {10, 20, 30, 40, 50, 60}, n = 6;

        int x = 25;

        System.out.println(bSearch(arr, n, x));

    }
}
