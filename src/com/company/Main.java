package com.company;

class Main  {
    public static void main(String[] args) {
        Horse h= new Horse();
        h.eat();
    }
}
abstract class Animal{
    Animal(){
        System.out.println("animal called");
    }
    void eat(){
        System.out.println("eats");
    }
}
class Horse extends Animal{
    void eat(){
        System.out.println("horse eats");
    }

        }