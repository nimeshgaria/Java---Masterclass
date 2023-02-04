package com.company.Polymorphism;

public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(boolean engine, int cylinders , int wheels){
    this.engine = true;
    this.cylinders = cylinders;
    this.wheels = 4;
    this.name = "Hyundai";
    }

    public int getCylinders(){
        return cylinders;
    }
    public String getName(){
        return name;
    }
    public String startEngine(){
        return " Start engine -> Starting... ";
    }
    public String accelerate(){
       return " Accelerating  -> Accelerated... ";
    }
     static class Santro extends Car{

        public Santro(boolean engine, int cylinders , int wheels){
        super(engine, cylinders,wheels);
        }
        @Override
        public String accelerate(){
            return "Santro -> Accelerating";
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public String startEngine() {
            return super.startEngine();
        }
    }

    public static void main(String[] args) {
        Santro santro = new Santro(true,3,2);
        System.out.println(santro.accelerate());
        System.out.println(santro.getName());
        System.out.println(santro.startEngine());
    }


}
