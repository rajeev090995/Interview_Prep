package ProblemSolvingInterviewRajeev.Mathematics;

//Program to compute power of number

public class Program11 {
    static int power(int x, int n)
    {
        if(n == 0)
            return 1;

        int temp = power(x, n/2);

        temp = temp * temp;

        if(n % 2 == 0)
            return temp;
        else
            return temp * x;
    }

    static int powerIterative(int x, int n) //0(log n)
    {
        int res=1;
        while(n>0){
            if(n%2 !=0){ //if(n&1)
                res=res*x;
            }
            x=x*x;
            n=n/2;  //n=n>>1;
        }
        return res;
    }

    public static void main (String[] args) {

        int x = 3, n = 5;

        System.out.println(power(x, n));
        System.out.println(powerIterative(x, n));

    }
}
