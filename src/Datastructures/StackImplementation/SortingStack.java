package Datastructures.StackImplementation;

import java.util.Stack;

public class SortingStack {


    public static Stack<Integer> sortedstack(Stack<Integer> inputstack) {


        Stack<Integer> tmpstack = new Stack<Integer>();


        while (!inputstack.empty()) {


            //Popping out first element
            int tmp = inputstack.pop();


            //Condition where top element of temporary stack is lesser than temp element
            while (!tmpstack.empty() && tmpstack.peek() < tmp) {

                //Push top element of temporary stack into the input stack
                inputstack.push(tmpstack.pop());
                //Pop the element from temporary stack
            }

            //if the above condition is failed then push diretcly in the temporary stack
            tmpstack.push(tmp);

        }


        return tmpstack;

    }


    public static void main(String[] args) {

        Stack<Integer> inputstack = new Stack<Integer>();


        inputstack.add(34);
        inputstack.add(3);
        inputstack.add(31);
        inputstack.add(98);
        inputstack.add(92);
        inputstack.add(23);

        //Creating a Temporary Stack

        Stack<Integer> temporarystack = sortedstack(inputstack);

        while (!temporarystack.empty()) {
            System.out.print(temporarystack.pop() + " ");
        }

    }

}
