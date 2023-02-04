package com.company.ApnaCollege.M10;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int n = 12345;


        while(n>0){
           int lastdigit = n % 10;
            System.out.print (lastdigit);
                n = n/10;
        }
    }
}
