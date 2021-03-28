package ProblemSolvingInterviewRajeev.Array;

public class Program5 {

    /*
    Two Pointer Approach: The idea is to solve this problem with constant space and linear time is by using a two-pointer or two-variable approach where we simply take two variables like left and right which hold the 0 and N-1 indexes. Just need to check that :

Check If the left and right pointer elements are negative then simply increment the left pointer.
Otherwise, if the left element is positive and the right element is negative then simply swap the elements, and Simultaneously increment or decrement the left and right pointers.
Else if the left element is positive and the right element is also positive then simply decrement the right pointer.
Repeat the above 3 steps until the left pointer ≤ right pointer.
     */
    // Function to shift all the
// negative elements on left side
    static void shiftall(int[] arr, int left,
                         int right)
    {

        // Loop to iterate over the
        // array from left to the right
        while (left <= right)
        {

            // Condition to check if the left
            // and the right elements are
            // negative
            if (arr[left] < 0 && arr[right] < 0)
                left++;

                // Condition to check if the left
                // pointer element is positive and
                // the right pointer element is negative
            else if (arr[left] > 0 && arr[right] < 0)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            // Condition to check if both the
            // elements are positive
            else if (arr[left] > 0 && arr[right] > 0)
                right--;
            else
            {
                left++;
                right--;
            }
        }
    }

    // Function to print the array
    static void display(int[] arr, int right)
    {

        // Loop to iterate over the element
        // of the given array
        for(int i = 0; i <= right; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Drive code
    public static void main(String[] args)
    {
        int[] arr = { -12, 11, -13, -5,
                6, -7, 5, -3, 11 };

        int arr_size = arr.length;

        // Function Call
        shiftall(arr, 0, arr_size - 1);
        display(arr, arr_size - 1);
    }
}
