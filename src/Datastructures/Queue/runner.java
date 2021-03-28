package Datastructures.Queue;

public class runner {

    public static void main (String[]args){

        Queue q1 = new Queue();

        q1.enqueue(4);
        q1.enqueue(6);
        q1.enqueue(2);
        q1.enqueue(7);
        q1.show();
        q1.dequeue();
        q1.dequeue();
        q1.enqueue(12);
        q1.enqueue(15);
        q1.enqueue(20);
        q1.enqueue(25);
        System.out.println( q1.getsize());
        System.out.println(q1.isEmpty());
        System.out.println(q1.isFull());
        System.out.println( q1.getsize());
        q1.show();

    }



    }


