package ProblemSolvingInterviewRajeev.Math;

//Given a positive integer N. You have to find Nth natural number after removing all the numbers containing digit 9 .

public class Program13 {

    public static long findNth(long N)
    {
        //code here
        long result = 0;

        long  p = 1;

        // Iterate while N is
        // greater than 0
        while (N > 0) {

            // Update result
            result += (p * (N % 9));

            // Divide N by 9
            N = N / 9;

            // Multiply p by 10
            p = p * 10;
        }
        // Return result
        return result;
    }

    public static void main(String arg[]){
        System.out.println(findNth(9));
    }
}
