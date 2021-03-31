package ProblemSolvingInterviewRajeev.BitWise;

public class Program4 {
    static void isKthBitSet(int n,
                            int k)
    {
        if (((n >> (k - 1)) &
                1) == 1)
            System.out.println("SET");
        else
            System.out.println("NOT SET");
    }

    public static void isKthBitSetLeftShift(int n,
                                   int k)
    {
        if ((n & (1 << (k - 1))) == 1)
            System.out.print("SET");
        else
            System.out.print("NOT SET");
    }

    // Driver code
    public static void main (String[] args)
    {
        int n = 5, k = 1;
        isKthBitSet(n, k);
    }
}
