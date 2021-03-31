package ProblemSolvingInterviewRajeev.Mathematics;
//check no is prime or not
public class Program7 {
    static boolean isPrime(int n)
    {
        if(n==1)
            return false;

        for(int i=2; i*i<=n; i++)
        {
            if(n % i == 0)
                return false;
        }

        return true;
    }

    static boolean isPrimeEfficient(int n) // For large number
    {
        if(n==1)
            return false;

        if(n==2 || n==3)
            return true;

        if(n%2==0 || n%3==0)
            return false;

        for(int i=5; i*i<=n; i=i+6)
        {
            if(n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
    }

    public static void main (String[] args) {

        int n = 65;

        System.out.println(isPrime(n));
        System.out.println(isPrimeEfficient(n));

    }
}
