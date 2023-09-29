package org.collectionframeworkdemo;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println(list);
        list.addFirst("LinkedList");

        System.out.println(list);
        list.set(2,400);
        System.out.println(list);
        list.addLast("demo of LinkedList is done");
        System.out.println(list);

    }
}
