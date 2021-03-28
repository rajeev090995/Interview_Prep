package Program_practrice;

import java.util.*;

public class anagram {


    static void  checkanagram(String s1, String s2) {

        char[] array1 = s1.toLowerCase().toCharArray();
        char[] array2 = s2.toLowerCase().toCharArray();
        boolean status=true;
        if (array1.length != array2.length) {
            status= false;
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        for (int i = 0; i < array1.length; i++) {

            if (array1[i] != array2[i]) {
                status = false;
            }
        }

        if(status){
            System.out.println("It is anargaram");

        }
        else{

            System.out.println("It is not anargaram");
        }

    }

    static void checkanagramwwithequalsmethod(String s1, String s2){

        boolean status=true;
        String s3= s1.replaceAll("\\s","");
        String s4=s2.replaceAll("\\s","");

        char [] array1=s1.toLowerCase().toCharArray();
        char [] array2=s2.toLowerCase().toCharArray();

        if (array1.length!=array2.length){
            status=false;
        }

        Arrays.sort(array1);
        Arrays.sort(array2);
        status= Arrays.equals(array1,array2);

        if(status){
            System.out.println("It is anargaram");

        }
        else{

            System.out.println("It is not anargaram");
        }

    }


    public static void  funwithanagrams(String[] text){

        String[]s1;
//        ArrayList<char[]> finalist= new ArrayList<>();
        Set<String> c1 = new HashSet<>();
        boolean status=true;
        int k = 0;
        s1=text[0].split(",",0);
        for (int i = 0; i < s1.length; i++){
            char[] aaray1= s1[i].toLowerCase().toCharArray();
            for (int j = 1 ; j <s1.length ; j++){

                char[] aaray2 = s1[j].toLowerCase().toCharArray();

                if(aaray1.length!=aaray2.length){
                    status=false;
                }
                else{

                    Arrays.sort(aaray1);
                    Arrays.sort(aaray2);
                    status=Arrays.equals(aaray1, aaray2);
                }

                if (status){
                    String arr= new String(aaray1);
                    c1.add(arr);
                }
            }
        }
        System.out.println(c1);


    }



    public static void main(String[] args) {
//        String s1 = "love";
//        String s2 = "vole";

        String[] arr = new String[]{"code,doce,4,anagram,gramana"};
//        checkanagram(s1, s2);
//        checkanagramwwithequalsmethod(s1,s2);
        funwithanagrams(arr);


        }
    }

