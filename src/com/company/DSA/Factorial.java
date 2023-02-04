package com.company.DSA;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        String s = "1";
        System.out.println(s.length());
    }
    public static int factorial(int n){
        int result = 1;
        for(int i = 1; i<=n; i++){
            result =  result*i; // 1
        }
        return result;
    }
}
