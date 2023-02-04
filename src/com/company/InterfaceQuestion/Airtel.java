package com.company.InterfaceQuestion;

public class Airtel implements MobileInterface{
    @Override
    public  void calling(){
        System.out.println("Airtel call incoming");
    }

    @Override
    public  void data() {
        System.out.println("Airtel data ");
    }
/*
    public static void main(String[] args) {
        Airtel a = new Airtel();
        a.calling();
        a.data();
    }*/
}
class PhoneImpl{
    public static void main(String[] args) {
        MobileInterface a = new Airtel();   // polymorphism
        a.calling();
        a.data();
    }
}