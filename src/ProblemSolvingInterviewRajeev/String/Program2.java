package ProblemSolvingInterviewRajeev.String;

public class Program2 {
    public static void main (String[]args){


        //Initialize String

        //String is immutable in java and when we perform any operation on string then it creates new string not modify existing


        char ch[]={'R','a','j','e','e','v'};
        String s11= "hello";
        String s12=new String(ch); //converting char array to strings
        String s13= new String("Example");

        System.out.println(s11);
        System.out.println(s12);
        System.out.println(s13);

        //String is mutable

        StringBuffer stringBuffer=new StringBuffer("Hello");
        StringBuilder stringBuilder=new StringBuilder("Hello");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);


        //String comparison

        String s1= "Rajeev";
        String s2= "Kumar";
        String s3= "Rajeev";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equalsIgnoreCase(s1));

        //String pool literal - if you use new to create string then only it create new string object

        System.out.println("-----------------------");

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3==s1);

        System.out.println("-----------------------");

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s2));

        String s111 = "geeksforgeeks";
        String s112 = "for";

        int res = s111.compareTo(s112);

        if(res == 0)
            System.out.println("Same");

        if(res > 0)
            System.out.println("s111 is Greater");

        if(res < 0)
            System.out.println("s111 is Smaller");
    }
}
