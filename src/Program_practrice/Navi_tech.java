package Program_practrice;

public class Navi_tech {

    public static void secondLargestNumber(int arr[]) {

        int largest = arr[0];
        int secondlargest = arr[0];

        for (int i = 1; i < arr.length ; i++) {


            if (arr[i] > largest) {

                secondlargest = largest;
                largest = arr[i];

            } else if ( arr[i] < largest &&  arr[i] < secondlargest ) {
                secondlargest = arr[i];

            }


        }
        System.out.println(largest);
        System.out.println(secondlargest);
    }






    public static void main (String args[]){
        int array[]={-1,-2,-3,-4};

        secondLargestNumber(array);

    }


}
