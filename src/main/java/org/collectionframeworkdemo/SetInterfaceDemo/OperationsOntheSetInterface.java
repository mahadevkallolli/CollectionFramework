package org.collectionframeworkdemo.SetInterfaceDemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OperationsOntheSetInterface {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        set.addAll(Arrays.asList(new Integer[]{ 1, 3, 2, 4, 8, 9, 0 }));

        Set<Integer> set1=new HashSet<>();
        set1.addAll(Arrays.asList(new Integer[]{ 1, 3, 7, 5, 4, 0, 7, 5 }));

        Set<Integer> union = new HashSet<>(set);
        union.addAll(set1);
        System.out.println("Union of 2 Set is:"+union);

        Set<Integer> intersection = new HashSet<>(set);
        intersection.retainAll(set1);
        System.out.println("Intersection of 2 Sets is:"+intersection);

        Set<Integer> Difference = new HashSet<>(set);
        Difference.removeAll(set1);
        System.out.println("Common elements from 2 Set are:"+Difference);


          //tried to print duplicate elements from the given Set
        /*
        Set<Integer> duplicates = new HashSet<>();
        duplicates.addAll(Arrays.asList(new Integer[]{1,2,3,4,4,4,5,6,6}));
        duplicates.removeAll(duplicates);
        System.out.println("Duplicates are:"+duplicates);
        */


    }
}

