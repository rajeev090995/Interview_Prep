package Datastructures.StackImplementation;

public class stackusingarray {

    /*   5 Methods used in Stack
         1) PUSH
         2) POP
         3) isEmpty
         4) isFull
         5) Peek
        */

    int size;
    int arr[];
    int top;
    int bottom;

    stackusingarray(int size) {

        this.size = size;
        this.arr = new int[size];
        this.top = -1;
        this.bottom = 0;
    }


    public void push(int element) {

        if (!isFull()) {
            top++;
            arr[top] = element;
            System.out.println("element added in stackn is : " + element);
        } else {
            System.out.println("Stack is full");
        }


    }


    public int pop() {

        if (isEmpty()) {
            int returnedtop = top;
            top--;
            System.out.println("Popped element is : " + arr[returnedtop]);
            return arr[returnedtop];
        } else {
            System.out.println("Stack is empty");
        }
        return -1;
    }

public int bottom(){

        if(!this.isEmpty()){
            System.out.println(" Bottom Element is :" + arr[bottom]);
            return arr[bottom];
        }
        else {
            System.out.println("Stack is empty");
        }

    return arr[bottom];
}

    public int peek() {

        if (!this.isEmpty()) {
            return arr[top];
        } else {

            System.out.println("Stack is empty");
            return -1;
        }
    }


    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (size - 1 == top);
    }



    public static void main (String[]args){

        stackusingarray stackarray1= new stackusingarray(10);
//        stackarray1.push(100);
        stackarray1.push(200);
        stackarray1.push(300);
        stackarray1.push(400);
        stackarray1.bottom();
        stackarray1.pop();
        stackarray1.pop();
        stackarray1.push(500);
        stackarray1.pop();
        stackarray1.pop();
        System.out.println(stackarray1.peek());
    }

}
