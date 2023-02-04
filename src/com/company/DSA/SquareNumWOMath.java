package com.company.DSA;

public class SquareNumWOMath {
    public static void main(String[] args) {
        setNumber(4);
    }
    public static void setNumber(int num){
        int result = num;
        for(int i = 1 ; i<num; i++){
            result = result + num;
        }
        System.out.println(result);

    }
}
