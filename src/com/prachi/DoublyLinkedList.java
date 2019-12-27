package com.prachi;

/**
 * @author prachi
 */
public class DoublyLinkedList {
    Node head;

    public void add(int data) {
        // if LL is Empty
        if (this.head == null) {
            this.head = new Node(data);
            this.head.previous = this.head; // initially both are same (tail and head)
        }
        // If LL is not Empty
        else {
            Node nodeToAdd = new Node(data);
            nodeToAdd.next = this.head;
            this.head.previous = nodeToAdd; // before pointing to new head, just mark its previous position to new would be node
            this.head = nodeToAdd;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList listFromScratch = new DoublyLinkedList();
        listFromScratch.add(12);
        listFromScratch.add(13);
        listFromScratch.add(14);
        listFromScratch.add(15);
        System.out.println("HEAD Element " + listFromScratch.head.data);
        System.out.println("Next Element " + listFromScratch.head.next.next.next.data);
    }


    class Node {
        int data;
        Node next;

        // to use this node in Doubly linked list add previous node
        Node previous;


        Node(int data) {
            this.data = data;
        }
    }
}
