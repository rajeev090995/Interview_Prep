package Arrays;
public class Factorial

{
    int c=0;
    void arraysum(int d) {

      for (int i=0;i<=d;i++){

          c=c+i;
      }

        System.out.println(c);
    }

    void factorial(int f){
        int g=1;
        for (int i=1;i<=f;i++){

            g=g*i;
        }
        System.out.println(g);
    }
      public static void main (String[]args){

       Factorial s1 =new Factorial();

       s1.arraysum(5);
       s1.factorial(5);


    }
}