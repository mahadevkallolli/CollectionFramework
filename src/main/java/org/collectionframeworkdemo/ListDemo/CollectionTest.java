package org.collectionframeworkdemo.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionTest {
    public static void main(String[] args) {
        List<String> l1= new ArrayList<>();

        l1.add(0,"mahadev");
        l1.add(1,"kallolli");
        l1.add(2,"madev");
        l1.add(3,"kall");
        l1.add(4,"dev");
        l1.add(5,"kals");

        //System.out.println(l1);
//        for(String str :l1){
//            System.out.println(str);
//        }

        //HasNext() : if we are using hasNext() with the while loop for traversing in a collection then it returns a boolean value.
        //hasNext() method check is there any element left in a row if yes then it returns true and if not then it returns false and the pointer goes out the loop.
        //while the next() method retruns the value of the next element in a row

        Iterator iterator = l1.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


//       List<String> s= l1.stream().sorted().collect(Collectors.toList());
//        System.out.println(s);


    }
}
