package Arrays;

public class copyArray {


public static void main (String[]args){

          char[]copyFrom ={'q','w','e','s','h','a','r','m','a','r','t','y'};
          char[]copyTo= new char[6];
          char[]copy1=new char[6] ;

          System.arraycopy(copyFrom,3,copyTo,0, 6);
          System.arraycopy(copyFrom,0,copy1,0,3);
          System.out.println(new String(copyTo));

//        String copy1 = char[9],[10],[11]
//    System.out.println(copy1);
}
}