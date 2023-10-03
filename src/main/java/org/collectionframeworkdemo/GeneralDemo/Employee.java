package org.collectionframeworkdemo.GeneralDemo;

public class Employee {
    int Age;
    String name;

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Employee(int a, String n){
        this.Age=a;
        this.name=n;
    }
    public void display(){
        System.out.println("eAge is: "+Age+"    eName: "+name);
        Address a = address();
        a.Disp();
    }
    public static  Address address(){

        return new Address(411057l,"Shinde Nagar","YNOT");
    }
}
