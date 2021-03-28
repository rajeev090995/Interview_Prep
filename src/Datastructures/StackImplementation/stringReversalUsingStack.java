package Datastructures.StackImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class reversalUsingStack {



    public static void main (String[]args) {


        List<String> list1 = new ArrayList<String>();

        list1.add("L");
        list1.add("A");
        list1.add("V");
        list1.add("S");
        list1.add("A");

        System.out.println(" Original Stack " + list1);

        Stack<String> str= new Stack<String>();

        while (list1.size()>0) {

            str.push(list1.remove(0));
        }
        while (str.size()>0){
            list1.add(str.pop());
        }

        System.out.println(" FINAL STACK :-----");


        System.out.println(" "+list1);

    }




    }

