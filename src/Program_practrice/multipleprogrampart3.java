package Program_practrice;

import java.util.ArrayList;
import java.util.List;

public class multipleprogrampart3 {


    public static void CheckingsubstringinaString(String s1, String s2) {

        int j = 0;
        int i = 0;

        while (i < s1.length() && j < s2.length()) {

            if (s1.charAt(i) == s2.charAt(j)) {
                j++;

            }

            if (s2.length() == j) {
                System.out.println("it's a substring");
                break;
            }


            i++;

        }


    }


    public static void MultiplyAllExceptself(int arr[]) {

        ArrayList<Integer> a1 = new ArrayList<>();
        int j = 0;
        while (j < arr.length) {
            int temp = 1;
            {

                for (int i = 0; i < arr.length; i++) {

                    temp = temp * arr[i];
                }

                if (arr[j] == 0) {
                    temp = temp / 1;
                    a1.add(temp);
                } else {
                    temp = temp / arr[j];
                    a1.add(temp);
                }
                j++;
            }

        }
        System.out.println(a1);
    }

    public static void FindTwoNumbersWithMaxSum(int arr[]) {

        int highest = 0;
        int secondhighest = 0;
        int highestproduct;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>highest){

                secondhighest=highest;
                highest=arr[i];
            }

            else if (arr[i]<highest && arr[i]>secondhighest){
                 secondhighest=arr[i];
            }
        }
            highestproduct=highest*secondhighest;

        System.out.println("The highest product of two numbers in array is a product of:- " +
                ""+highest+" and "+secondhighest+" Which is :- "+highestproduct);

    }


        public static void Smallestinroatedarray() {



            int   array[]={ 7, 6, 5,1, 2, 3, 4, };


            for (int i=0; i<array.length; i++){

                if (array[i]<array[i+1])
                {
                    System.out.println(array[i]);
                    break;

                }

            }


        }



    public static String calculateScore(String text, String prefixString, String suffixString) {
        // Write your code here
        char arr[] = text.toCharArray();
        char prefix[] = text.toCharArray();
        char suffix[] = text.toCharArray();

        List<Character> list1 = new ArrayList<>();

        for (int i=0;i<arr.length;i++){

            for (int j=0;j<prefix.length;j++) {

               {
                    if (arr[i] == prefix[j])
                        list1.add(arr[i]);
                }
            }
            }

        System.out.println(list1);
        for (int j=0;j<prefix.length;j++){

            for (int k=0;k<suffix.length;k++){

                if (prefix[j] == suffix[k])
                    list1.add(arr[j]);
            }
        }

        String s1= list1.toString();
//        System.out.println(list1);
        return s1;

        }



    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4,5};

//        MultiplyAllExceptself(arr);
        CheckingsubstringinaString("Engine", "Eng");
        FindTwoNumbersWithMaxSum(arr);
//          Smallestinroatedarray();
//        calculateScore("nothing","bruno","ingenious");
    }
}
