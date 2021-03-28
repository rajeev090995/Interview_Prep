package ProblemSolvingInterviewRajeev.String;

public class Program3 {
    public static void main (String[]args){

        //Concat string
        String s1 = "Rajeev";
        System.out.println(s1+" Kumar");

        String s2 = "Rajeev ";
        String s3 = "Kumar";
        System.out.println(s2.concat(s3));


        //String operations

        String str = "Payment of $100 paid";
        String str2 = "Payments of $100 paid";

        System.out.println(str.charAt(8));
        System.out.println(str2.charAt(9));
        int a = str.indexOf("$");

        System.out.println(str.indexOf("$"));

        String[] words = str.split("\\s");

        System.out.println(str2.substring(a));

        for (String w : words) {

            System.out.println(w);
        }

        //String index

        // Creating two string literals
        String s11 = "geeksforgeeks";
        String s12 = "geeks";

        // Returns the first occurrence of
        // s2 in s1 after index 1
        System.out.println(s11.indexOf(s12));
    }
}
