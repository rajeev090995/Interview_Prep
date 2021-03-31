package ProblemSolvingInterviewRajeev.Recursion;

public class Program2 {
    static void printToN(int n)
    {
        if(n == 0)
            return;

        printToN(n - 1);

        System.out.print(n+" ");

    }
    public static void main(String [] args)
    {
        int n = 4;

        printToN(n);

    }
}
