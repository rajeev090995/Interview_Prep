package ProblemSolvingInterviewRajeev.CircularLinkedList;

import java.util.*;
import java.io.*;
import java.lang.*;

class Program2 {

    public static void main(String args[])
    {
        Node head=new Node(10);
        head.next=new Node(5);
        head.next.next=new Node(20);
        head.next.next.next=new Node(15);
        head.next.next.next.next=head;
        printlist(head);

    }

    public static void printlist(Node head){
        if(head==null)return;
        System.out.print(head.data+" ");
        for(Node r=head.next;r!=head;r=r.next)
            System.out.print(r.data+" ");
    }
}
