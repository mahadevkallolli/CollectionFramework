package org.collectionframeworkdemo.SetInterfaceDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterfaceDemo {
    public static void main(String[] args) {
        Set<String> strings= new HashSet<>();
        strings.add("Money");
        strings.add("is");
        strings.add("king");
        strings.add("and");
        strings.add("make");
        strings.add("money");

      /*  System.out.println(strings);
        for(String s:strings){
            System.out.println(s);
        }*/
        Iterator itr =strings.iterator();
        while(itr.hasNext()){
            System.out.println("while loop iterating : "+itr.next());
        }
    }
}
