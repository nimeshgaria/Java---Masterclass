package com.company.Section5;

public class sumDigitschallenge {

    public static void main(String[] args) {
        System.out.println("Sum : " +sumDigits(125));
    }
    public static int sumDigits(int number){
        int sum = 0;
        if(number< 10){
            return  -1;
        }
        while(number > 0){
            int digit = number % 10;
            sum+= digit;

            number/= 10;
        }
        return  sum;
    }
}
