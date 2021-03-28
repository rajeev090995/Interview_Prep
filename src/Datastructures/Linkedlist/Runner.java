package Datastructures.Linkedlist;


import Datastructures.Linkedlist.Linkedlist;

public class Runner {


    public static void main (String[]args){

        Linkedlist list = new Linkedlist();

        list.insertAtend(18);
        list.insertAtend(20);
        list.insertAtend(15);
        list.insertat(2,22);
        list.insertAtend(30);
        list.insertAtend(25);

//        list.delete(2);
//        list.insertAtFirst(12);
        list.show();

}

}
