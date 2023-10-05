package org.collectionframeworkdemo.PerformingVariousOperationsOnSortedSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AddingElements {
    public static void main(String[] args) {
        Set<String> stringSet= new HashSet<>();
        stringSet.add("B");
        stringSet.add("B");
        stringSet.add("C");
        stringSet.add("A");

       // System.out.println(stringSet);
        /*for(String str:stringSet){
            System.out.println(str);
        }*/
        Iterator itr=stringSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        

    }
}
