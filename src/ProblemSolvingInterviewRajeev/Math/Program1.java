package ProblemSolvingInterviewRajeev.Math;

//To count no of digit in number
public class Program1 {

    static int countDigits(int x)
    {
        int res = 0;

        while(x > 0)
        {
            x = x / 10;

            res++;
        }

        return res;
    }

    public static void main (String[] args) {

        int number = 733;

        System.out.println(countDigits(number));

    }
}
