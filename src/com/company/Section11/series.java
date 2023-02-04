package com.company.Section11;

public class series {
    public static void main(String[] args) {

    }
    public static long nSum(long n){
    return (n*(n+1) / 2);
    }
    public static long factorial(long factorial){
        if(factorial ==0){
            return 0;
        }
        long fact = 1;
        for(int i =1; i<=factorial; i++){
            fact *= i;
        }
        return fact;
    }
    public static long fibonnaci(long number){
    if(number ==0){
        return 0;
    }
    else if(number == 1){
        return 1;
    }
    long nMinus1= 1;
    long nMinus2= 0;
    long fib = 0;
    for(int i =1; i<number; i++){
        fib = (nMinus1 + nMinus2);
        nMinus2 =nMinus1;
        nMinus1 = fib;
    }
    return fib;
    }
}
