package org.collectionframeworkdemo.StudentDemo;

public class StudentMain {
    public static void main(String[] args) {

        Student s = student();
        System.out.println(s.getRoleNo()+"  "+s.getfName()+"  "+s.getLname()+"  "+s.getNativeName());


    }

    public static Student student(){
        return new Student(1001,"mahadev","kallolli","JKD");
    }
}
