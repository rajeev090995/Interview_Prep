package ProblemSolvingInterviewRajeev.Mathematics;

public class Program3 {
    static int fact(int n)
    {
        int res = 1;

        for(int i=2; i<=n; i++)
        {
            res = res * i;
        }
        return res;
    }

    static int fact1(int n)
    {
        if(n==0)
            return 1;

        return n * fact1(n-1);
    }

    public static void main (String[] args) {

        int number = 5;

        System.out.println(fact(number));
        System.out.println(fact1(number));

    }
}
