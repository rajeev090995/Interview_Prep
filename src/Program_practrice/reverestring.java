package Program_practrice;

public class reverestring {





    public static void throughchararrayfunction(String wantedtoreverse){


        char[] reversearray= wantedtoreverse.toCharArray();

        for (int i= reversearray.length -1 ; i>0 ;i--){

            System.out.println(reversearray[i]);

        }
    }


    public static void throughstringmethod(String input){

    StringBuilder s1 = new StringBuilder();

    s1.append(input);

    s1= s1.reverse();

    System.out.println(s1);

    }


    public static void main (String[]args){

        String needtoreverse= "LAVSHARMA";
        throughchararrayfunction(needtoreverse);
        throughstringmethod(needtoreverse);

    }









}

