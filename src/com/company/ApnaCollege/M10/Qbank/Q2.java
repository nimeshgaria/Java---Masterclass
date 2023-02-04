package com.company.ApnaCollege.M10.Qbank;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int num ;
        int choice;
       do{
           System.out.println("Enter no.");
            num = s.nextInt();
            if(num % 2 == 0){
                evenSum+= num;
            }else{
                oddSum+= num;
            }
           System.out.println("Want to continue , 1 to continue , 0 to exit");
            choice = s.nextInt();

       }while (choice == 1);
       {
            System.out.println("Sum of even" +evenSum);
            System.out.println("Sum of odd" +oddSum);
        }
    }
}
