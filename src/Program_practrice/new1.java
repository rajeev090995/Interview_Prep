package Program_practrice;

public class new1 {

    public static void sort01(int arr[]) {

        int temp;
        int j = 1;
        for (int i = 0; i < arr.length - 1; i++) {


            if (arr[i] == 1) {

                if (arr[i] > arr[j]) {


                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];

                }
                else if (arr[i] == arr[j]) {

                    while (arr[i] ==arr[j] ) {
                        j++;
                    }
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];

                }

            }

            System.out.println(arr[i]);


        }


    }


    public static void main(String[] args) {

        int arr[] = {1, 0, 1, 0, 1, 0, 0, 0, 1, 1};

//        for( int a:arr){
//            System.out.println(a+ " ");
//        }
        sort01(arr);

    }
}
