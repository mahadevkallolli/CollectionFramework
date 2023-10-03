package org.collectionframeworkdemo.ClassNameAsMethodArgs;

public class Employee {


    public static void main(String[] args) {
        EmployeeDetails();
    }

    public static void EmployeeDetails(){
        int empId=223434;
        String fname="mahadev";
        String lname="Kallolli";
        int age=23;
        System.out.println("-----------------EMployee Detail is:--------------------");
        System.out.println("Emlpoyee Id:"+empId);
        System.out.println("Employee First Name:"+fname);
        System.out.println("Employee Last Name:"+lname);
        System.out.println("Age of the Employee:"+age);

       address().display();

    }
    public static Address address(){
        return new Address(411057,"Shinde_Vasti","YumNoTum","pune");
    }

}
