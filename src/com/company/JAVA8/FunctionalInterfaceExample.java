package com.company.JAVA8;

@FunctionalInterface
interface A{
    void show();        // functional interface can have only one method
 /*
 * Q. can we create object of interface
 * a. No, we can create class implements that interface then create object of class.
 * */
}
interface Add{
    public int add(int a, int b);
}
class B {

    public static void main(String[] args) {
        System.out.println("main");
        A a1 = () ->System.out.println("show B");
        a1.show();
        Add add = (a,b) -> a+b;
        System.out.println(add.add(2,54));
        Draw d2 = () -> System.out.println("drawing is called");
        d2.draws();
    }

    interface Draw{
        void draws();
    }


}

