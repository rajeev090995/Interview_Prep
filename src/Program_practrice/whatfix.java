package Program_practrice;

public class whatfix {


    public static void sortarray(int array[]) {

        int i = 0;
        int j = array.length - 1;
        int temp = 0;


        if (array.length == 0 || array.length == 1) {

            System.out.println("Empty array or single array");
        } else {

            while (i < j) {


                if (array[i] < array[j] && array[i]==0) {
                    i++;
                    j--;


                } else if (array[i] > array[j]) {

                    array[i] = array[i] + array[j];
                    array[j] = array[i] - array[j];
                    array[i] = array[i] - array[j];
                    i++;
                    j--;
                }
                else if (array[i]==array[j]){
                    j--;
                }
            }

            for (int k = 0; k < array.length; k++) {
                System.out.println(array[k]);
            }
        }

    }


    public static boolean checksubset(char arr[], char arr2[]) {

        int length = arr.length;
        int secondlength = arr2.length;

        int count = 0;


        for (int i = 0; i < length; i++) {

            for (int j = 0; j < secondlength; j++) {

                if (arr[i] == arr2[j]) {
                    count++;

                    if (count == secondlength) ;

                    break;
                }
            }
        }

        return false;
    }

    public static void convert(String input) {


        int length = input.length();
        int output = 0;

        if(input.length()!=0) {
            for (int i = 0; i < length; i++) {

                output = output * 10 + (input.charAt(i) - 48);

            }
            System.out.println(output);
        }

        else {
            System.out.println("Please pass a non empty string");
        }
    }

    public static void main(String[] args) {



//       int arr1[]= {0, 1, 1, 0, 1, 0,1};

        int arr1[]= {1,0, 1, 1, 0, 1, 0,1};


//
//        char arr2[]={'a','c','d','b','e'};
//
//
//        char arr3[]={'a','d','b','c','e','a','f'};

//          String a = "";

         sortarray(arr1);
//
//        checksubset(arr3,arr2);

//        convert(a);

    }

}
