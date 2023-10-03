package org.collectionframeworkdemo.GeneralDemo;

public class MainClass {
    public static void main(String[] args) {
    Employee emp = employee();
        emp.display();
    }
    public static Employee employee(){
        return new Employee(32,"Mahadev Kallolli");
    }
}
