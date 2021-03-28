package Arrays;

public class multidimarray {


    public static void main(String[]args){

        int arr4[][]={{2,4,6},{1,3,5},{4,16,36}};

        for(int i=0;i<arr4.length;i++){

          for(int j=0;j<arr4.length;j++){

              System.out.print(arr4[i][j]);
              System.out.print(",");
          }
            System.out.println();
        }
    }
}
