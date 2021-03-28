package Datastructures.LinkedListImplementation;

public class linkedlistoldmethod {


    class Node {

        private int data;
        private Node next;

        public Node() {
            data = 0;
            next = null;
        }

        public Node(int d, Node n) {

        }

        public void setData(int d) {
            data = d;
        }

        public void setNext(Node n) {
            next = n;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

    }

    class Linkedlist {

        private int size;
        private Node start;

        public Linkedlist() {
            size = 0;
            start = null;
        }

        public Boolean isempty() {

            if (start == null) {
                return true;
            } else
                return false;
        }


        public int getlistsize() {
            return size;
        }

        public void viewlist() {
            Node t;

            if (isempty()) {
                System.out.println(start.getData());

            } else {
                t = start;
                for (int i = 1; i < size; i++) {

                    System.out.println(" " + t.getData());

                    t = t.getNext();
                }

            }

        }

        public void insertAtFirst(int value) {

            Node n;
            n = new Node();
            n.setData(value);
            n.setNext(start);
            size++;
        }

        public void insertAtLast(int value) {

            Node n, t;

            n = new Node();
            n.setData(value);

            t = start;

            if (start == null) {

                start = n;

            } else {
                while (t.getNext() != null) {
                    t = t.getNext();
                    t.setNext(n);

                }
                size++;
            }


        }

        public void insertAtPostion(int value, int pos) {

            if (pos == 1) {

                insertAtFirst(value);
            } else if (pos == size + 1) {

                insertAtLast(value);
            } else if (pos > 1 && pos <= size) {
                Node n, t;

                n = new Node(value, null);

                t = start;

                for (int i = 1; i < pos - 1; i++) {

                    t = t.getNext();

                    n.setNext(t.getNext());
                    t.setNext(n);
                    size++;
                }

            }
        }


        public void deletefirstnode() {

            if (start == null) {
                System.out.println("List is empty");
            } else {

                start = start.getNext();
                size--;
            }

        }

        public void deletelastnode() {

            Node t = start;

            if (start == null) {

                System.out.println("List is empty");

            } else if (size == 1) {

                start = null;

            } else {

                for (int i = 0; i < size - 1; i++) {

                    t = t.getNext();

                    t.setNext(null);

                    size--;
                }
            }

        }


        public void deleteAtPostion(int pos) {

            if (start == null) {
                System.out.println("List is empty");
            } else if (pos < 1 || pos > size) {
                System.out.println("Invalid deletion value");

            } else if (pos == 1) {
                deletefirstnode();
            } else if (pos == size) {
                deletelastnode();
            } else {

                Node t, t1;
                t = start;

                for (int i = 1; i < pos - 1; i++) {

                    t = t.getNext();
                    t1 = t.getNext();
                    t.setNext(t1.getNext());

                    size--;
                }


            }
        }


    }

    public static void main(String[] args) {




    }


}

