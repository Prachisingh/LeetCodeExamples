package com.prachi;

/**
 * @author prachi
 */
public class LinkedListFromScratch {
    Node head;

    public void add(int data) {
        // if LL is Empty
        if (this.head == null) {
            this.head = new Node(data);
        }
        // If LL is not Empty
        else {
            Node nodeToAdd = new Node(data);
            nodeToAdd.next = this.head;
            this.head = nodeToAdd;
        }
    }

    public static void main(String[] args) {
        LinkedListFromScratch listFromScratch = new LinkedListFromScratch();
        listFromScratch.add(12);
        listFromScratch.add(13);
        listFromScratch.add(14);
        listFromScratch.add(15);
        System.out.println("HEAD Element "+listFromScratch.head.data);
        System.out.println("Next Element "+listFromScratch.head.next.data);
    }
}


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
