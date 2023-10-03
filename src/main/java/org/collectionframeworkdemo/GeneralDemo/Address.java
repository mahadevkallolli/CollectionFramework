package org.collectionframeworkdemo.GeneralDemo;

public class Address{
    Long pincode;
    String Area;
    String Landmark;

    public Long getPincode() {
        return pincode;
    }

    public void setPincode(Long pincode) {
        this.pincode = pincode;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getLandmark() {
        return Landmark;
    }

    public void setLandmark(String landmark) {
        Landmark = landmark;
    }

    public Address(Long pc,String area,String lm){
        this.pincode=pc;
        this.Area=area;
        this.Landmark=lm;
    }
    public void Disp(){
        System.out.println("Address of the employee is="+"Pncode is: "+pincode+"  Area is: "+Area+" Landmask is:"+Landmark);
    }

}
