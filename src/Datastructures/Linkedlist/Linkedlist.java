package Datastructures.Linkedlist;

public class Linkedlist {


    Node head;

    public void insertAtend(int data) {

        Node node = new Node(); //Creating a new node
        node.data = data; // Setting the data in node.
        node.Next = null; // Next node will be null {Not required since it's the first node so next will be null}

        if (head == null) {
            head = node;
        } else {
            Node n = head; // Will create a new as head  because  you are inserting at the last

            while (n.Next != null)  //It will run the loop till it finds it next node as null

            {
                n = n.Next; //iterating from one node to another node
            }
            n.Next = node; // the loop will break before reaching here  which means we have found the null value(n.Next=null).
            // now assinging the new node at the last.
        }

    }

    public void insertAtFirst(int data) {


        Node node = new Node(); //Creating a new node
        node.data = data; // Setting the data in node.
        node.Next = null; // Next node will be null {Not required since it's the first node so next will be null}
        node.Next = head; // Whatever the value we have for previous node will have for this node.(
        // prevoiously 18 was head we have assigned a new node so 12 will be head )
        head = node;
    }


    public void insertat(int index, int data) {

        Node node = new Node(); //Creating a new node
        node.data = data; // Setting the data in node.
        node.Next = null; // Next node will be null {Not required since it's the first node so next will be null}

        if (index == 0) {
            insertAtFirst(data);
        } else {
            Node n = head; // Whenever you have to traverse to you have to traverse from head.

            for (int i = 0; i < index - 1; i++) //This loop will run to reach a node prior  to the index.
            // Insert at 2 so to make changes we need to go at index 1.
            {
                n = n.Next;
            }

            node.Next = n.Next;    //Here node is a new node which is at position 2
            // n is 18 here at 1(position) so we are assigning the address of 3 position node (45)
            n.Next = node;       //n is 18 here at 1(position) so assinging it's next address to New Node.
        }
    }

    public void delete(int index) {
        if (index == 0) {
            head = head.Next;    //Deleting the first element shifting the current head to next node.

        } else {
            Node n = head;       // N equals the head node
            Node n1 = null;       // N1 is the null node
            for (int i = 0; i < index - 1; i++) {    //traversing till we find a node before reaching the index.
                n = n.Next;                   //Prior node before deleting which is at position 1
            }
            n1 = n.Next;           //n is at 1 position so it's next node will be n1 the one which we want to delete.
            n.Next = n1.Next;   // n1 is at 2 position. So n1.next fetch the address of next node.

            System.out.println(" N1 is deleted :- " + n1.data);
        }
        Node n1 = null;
    }


//    public Node findmiddlenode(Node head) {
//
//        Node high = head;
//        Node low = head;
//
//        while (high && high.Next) {
//
//           low= low.Next;
//           high= high.Next.Next;
//        }
//        return low;
//
//    }

    public void show() {

        Node node = head;

        while (node.Next != null) {

            System.out.println(node.data);
            node = node.Next;
        }
        System.out.println(node.data);
    }


}
