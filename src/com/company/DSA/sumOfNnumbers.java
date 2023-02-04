package com.company.DSA;

public class sumOfNnumbers {
    static void logic(int N){
        int sum = N * (N+1)/2;
        System.out.println("Sum of first "+ N + " is " + sum);
    }
    public static void main(String[] args) {
        logic(5);
    }
}
