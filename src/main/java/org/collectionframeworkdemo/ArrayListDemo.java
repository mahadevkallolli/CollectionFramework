package org.collectionframeworkdemo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("mahadev");
        arrayList.add(10);
        arrayList.add("mahadev");
        arrayList.add("10");
        arrayList.add(null);
        arrayList.add(200);
        System.out.println(arrayList);//output is mahadev,10,mahadev,10,null,200
        arrayList.remove(2);
        System.out.println(arrayList);//output is mahadev,10,,10,null,200
        arrayList.add(2,"kallolli");
        arrayList.add("N");//N will be added at last in the list
        System.out.println(arrayList);//mahadev,10,Kallolli,10,null,200,N


        System.out.println( arrayList.size());


    }
}

