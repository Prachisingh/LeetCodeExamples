package com.prachi;

import java.util.LinkedList;

/**
 * @author prachi
 */
public class AddTwoLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList();
        LinkedList<Integer> list2 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(5);
        list2.add(6);

        addTwoLinkedList(list1, list2) ;
    }


    private static void addTwoLinkedList(LinkedList list1, LinkedList list2) {

        System.out.println(list1);
        System.out.println(list2);


    }


}
