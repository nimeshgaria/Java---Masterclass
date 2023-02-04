package com.company.ApnaCollege.M10;

import java.util.Scanner;

public class SumOfFirstNnum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number");
        int n = s.nextInt();
        int i = 1;
        int sum = 0 ;
        while(i<=n){
            sum+= i;
            i++;
        }
    }
}
