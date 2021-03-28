package Datastructures.StackImplementation;

public class LinkedlistStack {
    Node head;

    class Node {
        int value;
        Node next;
    }
    LinkedlistStack(){
        head=null;
    }

    public void push(int value) {
        Node extrahead = head;
        head = new Node();
        head.value = value;
        head.next = extrahead;
    }

    public int pop() {

        if (head == null) {
            System.out.println(" Stack is empty");
        }
        int value = head.value;

        head = head.next;
        return value;
    }


    public static void main(String[] args) {

        LinkedlistStack lls = new LinkedlistStack();
//        lls.pop();
        lls.push(10);
        lls.push(20);
        lls.push(30);
        lls.push(60);
        lls.push(90);


        System.out.println("Element Popped from stack "+ lls.pop());
        System.out.println("Element Popped from stack "+ lls.pop());
         lls.push(90);
        System.out.println("Element Popped from stack "+ lls.pop());
    }


}
