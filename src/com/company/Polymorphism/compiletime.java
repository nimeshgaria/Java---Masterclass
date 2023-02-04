package com.company.Polymorphism;

// method overloading / compile time
//void gfg() { ... }
//void gfg(int num1 ) { ... }
//void gfg(float num1) { ... }
//void gfg(int num1 , float num2 ) { ... }

 public class compiletime {
     void show(int num1) {
        System.out.println("Num one" + num1);
    }

     void show(int num1, int num2) {
        System.out.println("Num one" + " " + num1 + " " +  "Num two" + " " +num2);
    }

    void show(int a, String b) // changing return type
    {
        System.out.println("Int a" + " " + a + " " + "String" + " " + b);
    }

    void show(String b , int a)// changing sequence
    {
        System.out.println("String" + " "+b + " " + "int" +a);
    }



    static class Main {
        public static void main(String[] args) {
            compiletime c = new compiletime();
            c.show(2, 3);
            c.show(1);
            c.show(2,"y");
            c.show("y", 1);
        }
    }
    }


