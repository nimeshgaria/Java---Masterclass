package com.company.ApnaCollege.M9;

import java.util.Scanner;

public class M9Main {
    public static void largestOfTwo(){
        int a  =1;
        int b = 2;
        if(a > b){
            System.out.println("A is larger");
        }else {
            System.out.println("B is larger");
        }
    }
    public static void  oddOrEven(){
        int a = 12;
        if(a%2 == 0 ) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void incomeTaxCalculator(int income){
     int tax;
        if(income < 500000){
            tax = 0;
        }
        if(income <= 1000000 && income > 500000){
            tax  = (int)(income * 0.20);
        }
        if(income > 1000000){
            tax = (int) (income * 0.30);
        }

    }
    public static void largestOfThree(){
        int a = 1, b = 2, c = 10;
        if(a >= b && a>=c ){
            System.out.println("A is largest");
        }
        else if(b >= c){
            System.out.println("B is largest");
        }
        else{
            System.out.println("C is largest");
        }
    }
    public static void ternaryExample(){
        int n = 5;
        String result  = (n % 2 == 0) ? "even" : "odd";
        System.out.println(result);
    }
    public static void calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Enter operation to perform");
        char operator = sc.next().charAt(0);

        switch (operator){
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
        }
    }
    public static void main(String[] args) {
     /*   largestOfTwo();
        oddOrEven();
        incomeTaxCalculator(1000000);
        largestOfThree();
        ternaryExample();*/
        calculator();

    }
}
