package org.collectionframeworkdemo.MethodsOrFuctions;

import org.collectionframeworkdemo.GeneralDemo.Address;

public class MethodWithMultiParams {

    public static String Methods( String name,int age,Address address){
        address.Disp();
        return name+" "+age;

    }

    public static void main(String[] args) {
       String s= Methods("mk",33,new Address(579800l,"JKD","JSL"));
        System.out.println(s);

    }
}
