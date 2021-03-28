package Program_practrice;

public class singleton {


    private static singleton myobj;

    static {
        myobj=new singleton();
    }


    private singleton(){

    }
 public static singleton getInstance() {
    return myobj;
}


public static void main(String[]args){


        singleton ms=getInstance();


}
}
