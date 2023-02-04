package com.company.DSA;

public class print_GFG_n_times {
    public static void main(String[] args) {
        printGfg(5);
    }
    static void printGfg(int N) {
        // code here
        if(N > 0){
            System.out.print("GFG" + " ");
            printGfg(N-1);
        }
}}
