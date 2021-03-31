package ProblemSolvingInterviewRajeev.BitWise;

public class Program6 {
    static boolean isPow2(int n)
    {
        if(n == 0)
            return true;

        while(n != 1)
        {
            if(n % 2 != 0)
                return false;

            n = n / 2;
        }

        return true;
    }

    static boolean isPow2SecMethod(int n)
    {
        if(n == 0)
            return true;

        return ((n & (n - 1)) == 0);
    }
    public static void main (String[] args) {

        int n = 4;
        System.out.println(isPow2(n));
        System.out.println(isPow2SecMethod(n));
    }
}
