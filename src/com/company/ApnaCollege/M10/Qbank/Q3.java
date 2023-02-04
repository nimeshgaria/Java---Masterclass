package com.company.ApnaCollege.M10.Qbank;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter n ");
        int n = s.nextInt();
        int fact = 1;
        for(int i =1; i<=n; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
