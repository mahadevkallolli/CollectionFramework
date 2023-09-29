package org.collectionframeworkdemo;

import java.util.ArrayList;

public class ArrayListSizeDemo {
    public static void main(String[] args) {
        //by default epmty list capacity is 10, if we try to insert 11 the element then
        //new capacity = current capacity+3/2+1 , means new capacity of list will be 16 or 0 to 15 of index
        ArrayList arrayList= new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(15);
        arrayList.add(16);
        System.out.println(arrayList.size());

    }
}
