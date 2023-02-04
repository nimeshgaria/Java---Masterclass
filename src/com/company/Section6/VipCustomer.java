package com.company.Section6;

public class VipCustomer extends Account{
    String name;
    double creditlimit;
    String emailaddress;



    public VipCustomer(){
        this("Default", 20000.0,"default@gmail");
    }

    public VipCustomer(String name, double creditlimit) {
        this(name , creditlimit , "seconddefault@gmail");
    }
    public VipCustomer(String name, double creditlimit, String emailaddress){
        this.name = name;
        this.creditlimit = creditlimit;
        this.emailaddress = emailaddress;
    }

    public double getCreditlimit() {
        return creditlimit;
    }
    public String getName(){
        return name;
    }
    public String getEmailaddress() {
        return emailaddress;
    }
}
