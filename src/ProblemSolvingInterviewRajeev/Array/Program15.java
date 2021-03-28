package ProblemSolvingInterviewRajeev.Array;

import java.util.HashSet;

public class Program15 {
    static int remDups(int arr[], int n)
    {
        int res = 1;

        for(int i = 1; i < n; i++)
        {
            if(arr[res - 1] != arr[i])
            {
                arr[res] = arr[i];
                res++;
            }
        }

        return res;
    }

    static void remDuplicateUsingSet(int arr[], int n)
    {
        HashSet<Integer> hashSet=new HashSet<Integer>();
        for (int i=0;i<n-1;i++) {
            hashSet.add(arr[i]);
        }
        System.out.println(hashSet);
    }



    public static void main(String args[])
    {
        int arr[] = {10, 20, 20, 30, 30, 30}, n = 6;

        System.out.println("Before Removal");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        n = remDups(arr, n);

        System.out.println("After Removal");

        remDuplicateUsingSet(arr,n);

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
