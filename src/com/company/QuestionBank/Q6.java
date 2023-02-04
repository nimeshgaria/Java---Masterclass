package com.company.QuestionBank;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter First Angle");
    int a= s.nextInt();
    System.out.println("Enter Second Angle");
    int b= s.nextInt();
    System.out.println("Enter Third Angle");
    int c= s.nextInt();

    if(a+b > c || b+c > a || c+a > b){
        System.out.println("Triangle is possible");
        if(a <  90 && b < 90 && c < 90)
        {
            System.out.println("Acute angle triangle");
        }
        else if((a == 90 || b == 90 || c == 90) && (a < 90 || b < 90 || c < 90)  )
        {
            System.out.println("Right angle triangle");
        }
        else if((a > 90 || b > 90 || c> 90) && (a > 90 || b > 90 || c > 90)  ){
            System.out.println("Obtuse angle triangle");
        }
    }
    else if(a+b < c || b+c < a || c+a < b) {
        System.out.println("Triangle not possible");
    }
    }

}
