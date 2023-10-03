package org.collectionframeworkdemo.MethodsOrFuctions;

public class MthodsWithArgs {

    public static void main(String[] args) {
        Method1("mahadev");
       String s= Student("Anjali","kallolli");
        System.out.println(s);
    }

    public static void Method1(String fname){
        System.out.println(fname +" Kallolli");
    }
    public static String Student(String fname,String lname){
        return fname+" "+lname;
    }
}
