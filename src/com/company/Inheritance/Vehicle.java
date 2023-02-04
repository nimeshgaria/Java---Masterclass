package com.company.Inheritance;

public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;
    public static void f(){
        System.out.println("Horn");
    }

    public Vehicle(String name , String size){
        this.name = name;
        this.size=  size;
        this.currentDirection = 0;
        this.currentVelocity =  0;
    }
    public Vehicle(){

    }



}