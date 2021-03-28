package Arrays;


class operation{

    int data = 50;

 void change(operation o1){

 o1.data = o1.data + 100;
 }
}

public class callbyvalue1 {

    public static void main (String[]args){

        operation o1 = new operation();
        o1.change(o1);
        System.out.println(o1.data);

    }
}
