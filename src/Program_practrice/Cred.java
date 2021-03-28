package Program_practrice;

public class Cred {


    public static void stairscount(int n) {

        int oldnum;
        int t1 = 0;
        int t2 = 1;



        for (int i = 1; i <=n; i++) {

            oldnum = t1 + t2;
            t1 = t2;
            t2 = oldnum;

            System.out.println(t2);
        }

    }

    public static int stairscountviadifferentlogic(int n){

        if(n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }
        else {
            n=(n-1)+(n-2);
        }

        System.out.println(n);
        return n;

    }


    public static  void c1(int arr[]){

        int i =0,j=0 ,k=0 ;


        while (i<arr.length);

    }



    public static void main(String[] args) {
        int arr1[]={1,5,3,2};
//        stairscount(5);
        stairscountviadifferentlogic(6);
       c1(arr1);
    }


}
