package Program_practrice;

public class multipleprogramspart1 {


    public static void findlargestnumberinarray(int arr[]) {

        int largestnum = 0;


        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] > largestnum) {

                largestnum = arr[i];

            }
        }

        System.out.println(largestnum);


    }

    public static void findascii(char arr1[]) {

        for (int i = 0; i < arr1.length; i++) {

            int asciinumber = (int) arr1[i];

            System.out.println(asciinumber);

        }
    }

    public static void swap(int a, int b) {


        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of a:- " + a);
        System.out.println("Value of a:- " + b);

    }

    public static void findalphabet(String a) {


        char b = a.charAt(0);

        int ascii = (int) b;

        if (ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122) {

            System.out.println(" it's an alphabet:- " + a);
        } else {
            System.out.println(" not an alphabet");
        }
    }

    public static void factorial(int number) {
        int j = 1;

        for (int i = number; i > 0; i--) {

            j = j * i;

        }

        System.out.println(j);

    }

    public static void multiplicationtable(int num) {


        for (int i = 0; i <= 10; i++) {

            System.out.println(+num + " * " + i + " is equal to:- " + num * i);

        }

    }

    public static void fibbonaciseries(int number) {

        int num = 0;
        int oldnum = 1;
        int newnum;
//        System.out.println(+oldnum + "," + num);
        for (int i = 2; i < number; ++i) {

            newnum = oldnum + num;
            System.out.println("" + newnum);
            oldnum = num;
            num = newnum;
        }

    }

    public static void convetbinarytodecimal(long num) {

        long rem;
        double decimal = 0;
        int i = 0;


        while (num != 0) {
            rem = num % 10;
            num = num / 10;
            decimal = decimal + rem * Math.pow(2, i);
            ++i;
        }

        System.out.println(decimal);


    }


    public static void convertdecimaltobinary(long num) {

        long reminder = 1;
        long binary = 0;
        int i = 1;

        while (num != 0) {

            reminder = num % 2;
            num = num / 2;
            binary += reminder * i;
            i *= 10;

        }
        System.out.println(binary);

    }

    public static void findsecondlargestnumber(int arr[]) {

        int largest = 0;
        int secondlargest = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] > largest) {

                  secondlargest=largest;
                  largest=arr[i];

            } else if ( arr[i] > secondlargest && arr[i]<=largest ) {
                secondlargest = arr[i];

            }

        }
        System.out.println(largest);
        System.out.println(secondlargest);
    }


    public static void fibonaci(int num){

        int old=1;
        int next=0;
        int sum ;

        for (int i=2; i<num; i++){

            sum=old+next;
            System.out.println(sum);
            old=next;
            next=sum;


        }


    }





    public static void main(String[] args) {


        int arr[] = {2, 12, 92, 31, 9};
        char arr1[] = {'a', 'A', 'B', 'c', 'd', 'e', 'f', 'Z', 'z'};

          fibonaci(10);
//        findlargestnumberinarray(arr);
        findascii(arr1);
//        swap(10, 20);
//        findalphabet("B");
        factorial(8);
//        multiplicationtable(9);
        fibbonaciseries(10);
//        convetbinarytodecimal(10011011);
        convertdecimaltobinary(156);
        findsecondlargestnumber(arr);

    }

}
