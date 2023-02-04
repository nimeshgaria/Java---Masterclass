package com.company.DSA;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " " +n2);
        int count = 8;
        //0,1,1,2,3,5,8
        for(int i = 2 ;i<count; i++ )
        {
            n3 = n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2 = n3;
        }
    }
}
