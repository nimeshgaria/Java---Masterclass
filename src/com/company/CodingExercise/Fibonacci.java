package com.company.CodingExercise;

public class Fibonacci {
    public static void main(String[] args) {
        int n  = 3;
        int result= 1;
        if(n== 0 ){
            System.out.println(0);
        }else if(n == 1){
            System.out.println(1);
        }else{
            for(int i=1; i<=n; i++){
                    result = result * i;
                }
            System.out.println("Fact of "+n +" is" + " " + result);
        }
    }
}
