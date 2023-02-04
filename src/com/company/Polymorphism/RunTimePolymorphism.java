package com.company.Polymorphism;

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        v1.print(); // derived class bike
        v1.p(); // p

    }
}
class Vehicle{
    void print(){
        System.out.println("Base class vehicle");
    }
    void p(){
        System.out.println("p");
    }
}
class Bike extends Vehicle{
    void print(){
        System.out.println("Derived class bike");
    }
    void t(){
        System.out.println("T");
    }
}
