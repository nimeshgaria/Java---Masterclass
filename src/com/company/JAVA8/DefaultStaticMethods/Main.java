package com.company.JAVA8.DefaultStaticMethods;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.horn();

        vehicle = new Bike();
        vehicle.horn();
        Vehicle.oil();
    }
}
class Bike implements Vehicle{
    @Override
    public void horn() {
        System.out.println("Horn pee pee");
    }
}
class Car implements Vehicle{

    @Override
    public void horn() {
        System.out.println("Horn pee pee");
    }
}
interface Vehicle{
    void horn();
    /* static vs default
    * static called -> Interface.methodName, use when functionality is same for classes use static
    * defaultl -> instance/objectName.methodname , use when functionality is changing .
    * */
    default void speedMeter(){
        System.out.println("common functionality"); // came into use for updating methods for all child classes
    }
    static void oil(){
        System.out.println("Engine oil is good");
    }
}
