package Program_practrice;

import java.util.*;

public class multipleprogramspart2 {


    public static void countnumberofelements(String number) {

        char c[] = number.toCharArray();

        ArrayList<Character> finalarray = new ArrayList<>();

        for (int i = 0; i < c.length; i++) {

            int count = 0;

            if (!finalarray.contains(c[i])) {

                finalarray.add(c[i]);

                count++;

                for (int j = i + 1; j < c.length; j++) {

                    if (c[i] == c[j]) {

                        count++;
                    }
                }
                System.out.println("Number :- " + c[i] + " Total count is :- " + count);
            }
        }
    }


    public static void reversenumber(String rev) {

        char d[] = rev.toCharArray();

        for (int i = rev.length() - 1; i >= 0; i--) {

            System.out.print(d[i]);
        }

    }

    public static void reverewithoutconversion(int num) {

        int rev = 0;
        int i = 0;
        int count = num;

        while (i < 4) {

            rev = count % 10;
            count = count / 10;
            System.out.print(rev);
            i++;
        }

    }

    public static void powerofanyinterger(int number, int power) {

        int powerofn = 1;
        for (int i = 0; i <= power; i++) {


            powerofn *= number;


        }

        System.out.println(powerofn);
    }


    public static void checkpalindrome(int inputnumber) {
        int rem, temp, sum = 0;

        temp = inputnumber;

        while (inputnumber > 0) {

            rem = inputnumber % 10;
            sum = (sum * 10) + rem;
            inputnumber = inputnumber / 10;

        }
        if (temp == sum) {
            System.out.println("Number is palindrome.");
        } else {
            System.out.println("number is not palindrome");
        }


    }


    public static void checkprimenumber(int check) {

//        int m = check / 2;
        int flag = 0;


        for (int i = 2; i <= check / 2; i++) {


            if (check % i == 0) {

                System.out.println(" Number is not prime ");

                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println(+check + " Number is  prime ");
        }


    }


    public static void amstrongnumber(int number) {

        int firstreminder;
        int itreatednumber;
        int count = 0;
        itreatednumber = number;

        while (itreatednumber != 0) {

            firstreminder = itreatednumber % 10;
            count = count + firstreminder * firstreminder * firstreminder;
            itreatednumber = itreatednumber / 10;

        }
        if (count == number) {
            System.out.println(+number + " number is armstrong ");

        } else {
            System.out.println(+number + " number is  not armstrong ");
        }


    }

    public static int factorialrecursive(int num) {

        int factorialnum = 1;
        if (num >= 1) {

            return num * factorialrecursive(num - 1);

        } else {
            return 1;
        }
    }


    public static void countnumberusinghashmap(int arr[]) {

        HashMap<Integer, Integer> h1 = new HashMap();


        for (int i : arr) {

            if (h1.containsKey(i)) {

                h1.put(i, h1.get(i) + 1);

            } else {

                h1.put(i, 1);
            }

        }

        for (Map.Entry entry : h1.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());


        }

    }


    public static void checksecondduplicatehashmap(int[] arr) {

        int count = 0;
        Map<Integer, Integer> map1 = new HashMap<>();

        for (int i : arr) {

            if (map1.containsKey(i)) {

                map1.put(i, map1.get(i) + 1);
            } else {
                map1.put(i, 1);
            }
        }
        for (int j : arr) {

            if (map1.get(j) == 2) {
                count++;
            }
            if (count == 2) {
                System.out.println(j);
                break;
            }

        }


    }

    public static void stringcount(String s1) {

        char[] c = s1.toCharArray();


        Map<Character, Integer> map1 = new HashMap<>();

        for (int i = 0; i < c.length; i++) {

            if (map1.containsKey(c[i])) {

                map1.put(c[i], map1.get(c[i]) + 1);
            } else {
                map1.put(c[i], 1);
            }

        }
        for (Map.Entry entry : map1.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void mergeTheSortedArray(int array1[], int array2[]) {

        int i = 0, j = 0, k = 0;

        int array3[] = new int[array1.length + array2.length];

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {

                array3[k] = array1[i];
                i++;
                k++;
            } else {
                array3[k] = array2[j];
                j++;
                k++;
            }
        }

        while (i < array1.length) {
            array3[k] = array1[i];
            i++;
        }

        while (j < array2.length) {
            array3[k] = array2[j];
            j++;
        }

        for (int l = 0; l < array3.length - 1; l++) {

            System.out.println(array3[l]);

        }

    }


    public static void isprime(int num) {


        int flag = 1;


        for (int j=2; j<num/2; j++ ) {
            for (int i = 2; i <= num / 2; i++) {

                if (num % i == 0) {
                    flag = 1;
                    break;
                } else {
                    flag = 0;
                }

                if (flag == 0) {
                    System.out.println(num);
                }
            }
        }


    }


    public static  void reversearray(int arr[]){

        int temp;
        int j=0;
         while (j<arr.length) {
             for (int i = 0; i < arr.length / 2; i++) {
                 temp = arr[i];
                 arr[i] = arr[arr.length - 1 - i];
                 arr[arr.length - 1 - i] = temp;
             }

             System.out.println(arr[j]);
             j++;
         }

    }


    public static void main(String[] args) {


        int[] arr = {5, 2, 1, 5, 2, 6};

        int[] arr1 = {1, 5, 7, 9, 12};
        int[] arr2 = {1, 2, 4, 5, 10, 11, 29, 31};
//        reversearray(arr1);
//        String str = "aabbccd";
        isprime(5);
//        countnumberofelements("21248827212412");
//        reversenumber("34567");
//        reverewithoutconversion(5678);
//        powerofanyinterger(2, 5);
//        checkpalindrome(1411);
        checkprimenumber(3);
//        amstrongnumber(152);
//        System.out.println(factorialrecursive(6));
//        countnumberusinghashmap(arr);
//        checksecondduplicatehashmap(arr);
        mergeTheSortedArray(arr1, arr2);
//           stringcount(str);
//

    }


}




