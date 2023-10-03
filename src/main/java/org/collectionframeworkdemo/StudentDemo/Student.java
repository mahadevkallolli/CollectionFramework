package org.collectionframeworkdemo.StudentDemo;

public class Student {
    private int roleNo;
   private String fName,lname,nativeName;

    Student(int roleNo, String firstName,String lastName,String nativeName){
        this.roleNo=roleNo;
        this.fName=firstName;
        this.lname=lastName;
        this.nativeName=nativeName;
    }

    public int getRoleNo() {
        return roleNo;
    }

    public String getfName() {
        return fName;
    }

    public String getLname() {
        return lname;
    }

    public String getNativeName() {
        return nativeName;
    }
}
