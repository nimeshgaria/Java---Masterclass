package com.company.ApnaCollege.M10;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Enter n");
        int n = s.nextInt();
        boolean isPrime = true;
        long startTime = System.currentTimeMillis();
        if(n == 2){
            System.out.println("Prime");
        }
        else{

            for(int i =2; i<=n-1; i++){
                if(n % i ==0){
                   isPrime = false;
                }
            }

        }
    if(isPrime)
    {
        System.out.println("Prime");
    }else{
        System.out.println("Not prime");
    }
        System.out.println(" Time taken : " +( System.currentTimeMillis() - startTime));
    }
}
