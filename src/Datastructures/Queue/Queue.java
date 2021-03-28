package Datastructures.Queue;

public class Queue {

    int queue[] = new int[5];
    int size = 0;
    int front = 0;
    int rear = 0;
    int dqueueelement = 0;


    public void enqueue(int data) {

        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size++;
        } else {
            System.out.println(" Queue is full");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            dqueueelement = queue[front];
            front = (front + 1) % 5;
            size--;
            System.out.println("Dequeued element is :- " + dqueueelement);

        } else {
            System.out.println("Queue is empty");

        }
        return dqueueelement;
    }

    public void show() {

        for (int i = 0; i < size; i++)

            System.out.println(queue[(front + i) % 5] + "  ");
    }


    public int getsize() {

        return size;
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public boolean isFull() {

        return size == queue.length;
    }
}
