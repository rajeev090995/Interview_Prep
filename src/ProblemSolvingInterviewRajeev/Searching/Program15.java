package ProblemSolvingInterviewRajeev.Searching;

public class Program15 {
    static int repeat(int arr[], int n)
    {
        boolean visit[] = new boolean[n];

        for(int i = 0; i < n; i++)
        {
            if(visit[arr[i]])
                return arr[i];
            visit[arr[i]] = true;
        }

        return -1;
    }

    static int repeatEfficient(int arr[], int n)
    {
        int slow = arr[0], fast = arr[0];

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];

        }while(slow != fast);

        slow = arr[0];

        while(slow != fast)
        {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    public static void main(String args[])
    {

        int arr[] = {0, 2, 1, 3, 2, 2}, n= 6;

        System.out.println(repeat(arr, n));

    }
}
