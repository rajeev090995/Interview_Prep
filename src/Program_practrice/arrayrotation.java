package Program_practrice;

public class arrayrotation {


     void leftrotatearray(int arr[],int size,int d){

        int n=arr.length;

         reversearray(arr,0,d-1);
         reversearray(arr,d,n-1);
         reversearray(arr,0,n-1);

    }

    void rightrotatearray(int arr[],int size,int d){

         int n=arr.length;

         reversearray(arr,0,d+3);
         reversearray(arr,d+3,n-1);
         reversearray(arr,0,n-1);
    }




    void printarray(int arr[]){

         for(int i=0;i<arr.length;i++){

             System.out.print(arr[i]);

         }
    }



    void reversearray(int arr[],int start,int end) //this will traverse the loop

    {

        while (start<end){

           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
        }


    }



    public static void main(String[]args){


        int arr[]={1,2,3,4,5,6,7};

        int n=arr.length;

        int d =2;

        d=d % n;


        arrayrotation rotation= new arrayrotation();
        rotation.leftrotatearray(arr,n,d);
        System.out.println(" Left rotate array =========== ");
        rotation.printarray(arr);
        System.out.println();
        System.out.println(" Right rotate array =========== ");
        rotation.rightrotatearray(arr,n,d);
        rotation.printarray(arr);

    }
}
