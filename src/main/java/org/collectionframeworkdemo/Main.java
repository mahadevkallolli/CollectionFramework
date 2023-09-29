package org.collectionframeworkdemo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();
        list.add(0,100);
        list.add(100);
        list.add(2,200);

        for(Integer lists: list){
            System.out.println(lists);
        }
    }
}