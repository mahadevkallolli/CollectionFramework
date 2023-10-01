package org.collectionframeworkdemo.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemoUsingIterator {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("PineApple");
        list.add("Banana");
        list.add("GreeApple");
        list.add("GreenOrange");
        list.add("RedApple");
        list.add("RedBanana");
        System.out.println("Simple Print"+list);

        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println("\n By Iterating Concept:"+itr.next());
        }
    }
}
