package com.company.Polymorphism;

public abstract class t {

        static{
             {
                 System.out.print("1");
             }

    }
    public t(String name) {
        super();
        System.out.print("2");
        }
    {
        System.out.print("3");
    }
}
     class BlueCar extends t{
    {
        System.out.print("4");
    }
    public BlueCar() {
        super("blue");
        System.out.println("5");
    }
    public static void main(String[]gears) {
        new BlueCar();
    }
}
