package com.company.ApnaCollege.M10;

import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Enter no. : ");
            int n = s.nextInt();
            if(n % 10 == 0){
                continue;
            }
            System.out.println("number was" + n);
        }while (true);
    }
}
