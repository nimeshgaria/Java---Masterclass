package com.company.DSA;

public class stringEqualsandequals {
    public static void main(String[] args) {
        String a = "nimes";
        String b = "nimes";
        String b1 = "n";
        String c = new String("nimes");
        String d = new String("nimes");
        String d1 = new String("n");
        System.out.println("a==b" + a==b); // tr
        System.out.println("c.equals(d)" + c.equals(d)); //tr
        System.out.println("a==b1" + a==b1); // fa
        System.out.println("c.equals(b1)" + c.equals(b1));// fa
        System.out.println("c.equals(d1)" + c.equals(d1)); // fa
        System.out.println("c.equals(a)" + c.equals(a)); //tr
    }
}
