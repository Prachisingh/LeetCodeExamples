package com.prachi;

/**
 * @author prachi
 */
public class QueueFromScratch {

    // it has head and tail , follows LIFO
    // initialise tail and head with -1
    // increment tail and head on first insertion
    // A queue enqueues, dequeue and peek.
    // Enqueue : if tail == array length and tail-head < length than enqueue element at  0th index i.e tail = 0
    // A queue where we enqueue the element by bringing the tail to 0th position after it has reached max length is called CIRCULAR QUEUE

    private int queue[] = new int[5];
    private int head = -1;
    private int tail = -1;

    public void enqueue(int element) {
        //check if the queue is empty
        if (head == -1 && tail == -1) {
            head = 0;
            tail++;
            queue[head] = element;
        }
        // making queue circular
        else if (tail == queue.length - 1 && tail - head < queue.length) {
            tail = 0;
            System.out.println("It is becoming a circular queue, setting tail as " + tail);
            queue[tail] = element;
        } else {
            tail++;
            queue[tail] = element;
        }
    }

    public int dequeue() {
        int dequeueElement = -1;
        if (head > -1) {
            dequeueElement = queue[head];
            head++;
        }
        return dequeueElement;
    }

    public int peek() {

        return queue[head];
    }

    public void display() {
        for (int i = head; i <= tail; i++) {
            System.out.println(queue[i]);
        }
        // if queue ha s become circular
        if (tail < head) {
            for (int i = 0; i <= queue.length - 1; i++) {
                System.out.println(queue[i]);
            }
        }
    }

    public static void main(String[] args) {
        QueueFromScratch queue = new QueueFromScratch();
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);

        queue.display();
        System.out.println("Deque element is " + queue.dequeue());
        System.out.println("Deque element is " + queue.dequeue());
        queue.display();

        queue.enqueue(15);
        queue.enqueue(16);
        queue.display();
    }

}
