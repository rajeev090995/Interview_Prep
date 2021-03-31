package ProblemSolvingInterviewRajeev.Mathematics;

//Program to find all divisor of a number

public class Program9 {
    static void printDivisors(int n)
    {
        int i = 1;
        for(i=1; i*i < n; i++) // print all divisor from 1 to square root(n)
        {
            if(n % i == 0)
            {
                System.out.print(i+" ");
            }
        }

        for(; i >= 1; i--) // print all divisor from square root(n) to n
        {
            if(n % i == 0)
            {
                System.out.print((n / i)+" ");
            }
        }
    }

    static void printDivisorsEfficient(int n)
    {
        for(int i=1; i*i <= n; i++)
        {
            if(n % i == 0)
            {
                System.out.print(i+" ");

                if(i != n / i)
                    System.out.print((n / i)+" ");
            }
        }
    }


    public static void main (String[] args) {

        int n = 15;

        printDivisors(n);

        printDivisorsEfficient(n);

    }
}
