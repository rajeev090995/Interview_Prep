package Datastructures.StackImplementation;

public class stack {

    int sizeofstack;
    int top = -1;
    int stackarray[] = new int[5];
    int popelement;

    public void push(int data) {
        if (isfull()) {
            System.out.println(" Stack is full ");

        } else {
            top++;
            stackarray[top] = data;
            System.out.println(" Pushed Element = " + data);
        }
    }

    public int pop() {
        if (isempty()) {
            System.out.println(" Stack is  Empty ");
        } else {

            popelement = stackarray[top];
            top--;
            System.out.println(" Popped Element is :- " + popelement);
            return popelement;
        }
        return -1;

    }

    public void printstack() {

        for (int i = 0; i<=top; i++) {
            System.out.println(" CurrentStack list:- " + stackarray[i]+ " At Postion ["+i+"]");

        }
    }

    public void size() {

        System.out.println(" Stack size is :- " + top);

    }

    public void peek() {

        System.out.println(" \n Peek element or top element is:- " + stackarray[top]);

    }

    public boolean isempty() {

        return (top == -1);
    }

    public boolean isfull() {

        return (stackarray.length - 1 == top);
    }



    public static void main(String[] args) {

        stack s1 = new stack();


        s1.pop();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.size();
        s1.printstack();
//        s1.peek();
//        s1.pop();
//        s1.printstack();
//        s1.size();
//        s1.push(40);
//        s1.printstack();
//        s1.peek();
//        s1.pop();
//        s1.size();
//        s1.printstack();
//        s1.pop();
//        s1.printstack();
//        s1.peek();
    }
}