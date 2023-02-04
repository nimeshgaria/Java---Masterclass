package com.company.DSA;

public class Substring {
    public static void main(String[] args) {
        String s= "This is it";
        String arr[] = s.split(" ",3);
        String first = arr[0];
        String last = arr[2];
        System.out.println(first + " " + last);


        System.out.println(s.substring(0,4)); // prints this
    }
}
