package ProblemSolvingInterviewRajeev.Mathematics;
// Program to find count trailing zeros in factorial of number
public class Program4 {
    static int countTrailingZeros(int n)
    {
        int res = 0;

        for(int i=5; i<=n; i=i*5)
        {
            res = res + (n / i);
        }

        return res;
    }

    public static void main (String[] args) {

        int number = 251;

        System.out.println(countTrailingZeros(number));

    }
}
