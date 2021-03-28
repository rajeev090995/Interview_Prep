package Datastructures.LinkedListImplementation;

public class linkedlistimplementation {

    class linkedlist {

        node head; // head of list


        class node {

            int data;
            node next;

            node(int d) {
                data = d;
                next = null;
            }
        }

        public void pushelement(int new_data) //function to insert node.
        {

            node new_node = new node(new_data);

            new_node.next = head;

            head = new_node;

        }
  /*    Appends a new node at the end.  This method is
      defined inside linkedlistoldmethod class shown above */

        public void appendatend(int new_data) {

         /* 1. Allocate the Node &
           2. Put in the data */

            node new_node = new node(new_data);

            if (new_node == null) {
                head = new node(new_data);
                return;
            }
          /*   This new node is going to be the last node, so
            make next of it as null */
            new_node.next = null;

            /*Else traverse till the last node */

            node last = head;

            while (last.next!=null)
                last=last.next;

            /*  Change the next of last node */
            last.next = new_node;
            return;
        }


    }


}
