package Program_practrice;

public class Interview {


    public static void findlargestandsecondlargest(int arr[]) {
        int largest =arr[0] ;
        int secondlargest = 0;

        for (int i = 0; i < arr.length-1; i++) {


                if(arr[i]>largest){

                    largest=arr[i];

                }
                else {
                    largest=arr[i+1];

                }

            }

        System.out.println(largest);

        }



    public static void main(String[] args) {

        int arr[] = {3, 4, 5, 74 , 12, -10, 10, 21};


        findlargestandsecondlargest(arr);


    }


}