package org.collectionframeworkdemo.PerformingVariousOperationsOnSortedSet;

import java.util.HashSet;
import java.util.Set;

public class RemovingTheValues {
    public static void main(String[] args) {
        Set<String> set= new HashSet<>();
        set.add("A");
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("D");
        System.out.println("initial set is:"+set);
        set.remove("A");
        System.out.println("Set after removing is:"+set);

        for(String str:set)
            System.out.println(str+" , ");

    }
}
