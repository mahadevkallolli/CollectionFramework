package org.collectionframeworkdemo.PerformingVariousOperationsOnSortedSet;

import java.util.HashSet;
import java.util.Set;

public class AccessingElements {

    public static void main(String[] args) {
        Set<String> strings= new HashSet<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("A");
        System.out.println("set is:"+strings);
        String s="D";
        System.out.println("Contains "+s+" "+strings.contains(s));
    }
}
