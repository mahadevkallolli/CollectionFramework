package org.collectionframeworkdemo.ClassNameAsMethodArgs;

public class Address {
    int pincode;
    String area;
    String landmark;
    String city;

    public String getCity() {
        return city;
    }

    public int getPincode() {
        return pincode;
    }

    public String getArea() {
        return area;
    }

    public String getLandmark() {
        return landmark;
    }

    public Address(int pincode,String area,String landmark,String city){
        this.pincode=pincode;
        this.area=area;
        this.landmark=landmark;
        this.city=city;
    }
    public  void display(){
        System.out.println("-----------THis is the Employee Address-----------");
        System.out.println(pincode+"    "+area+"    "+landmark);
    }

}
