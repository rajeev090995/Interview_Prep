package ProblemSolvingInterviewRajeev.BitWise;

public class Program5 {
    static int []table = new int[256];

    /* Function to get no of set bits in binary representation of positive integer n */
    static int countSetBits(int n)
    {
        int count = 0;
        while (n != 0) {
            if (n % 2 != 0)
                count++;
            n = n/2;
        }
        return count;
    }

    /* Function to get no of set
	bits in binary representation
	of passed binary no. */
    static int countSetBitsSec(int n) // theta(set bit count)
    {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    // recursive function to count set bits
    public static void initialize() {

        // To initially generate the table algorithmically:
        table[0] = 0;
        for (int i = 0; i < 256; i++)
        {
            table[i] = (i & 1) + table[i / 2];
        }
    }

    public static int countSetBitsLast(int n)
    {
        return table[n & 0xff] +
                table[(n >> 8) & 0xff] +
                table[(n >> 16) & 0xff] +
                table[n >> 24];
    }

    // driver program
    public static void main(String args[])
    {
        int i = 9;
        System.out.println(countSetBits(i));

        initialize();
        int n = 9;
        System.out.println(countSetBitsLast(n)); //theta(1)
    }
}
