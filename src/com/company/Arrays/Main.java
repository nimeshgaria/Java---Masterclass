package com.company.Arrays;

import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        //printArray(myIntegers);
        int[] sorted = sortArray(myIntegers);
        printArray(sorted);
    }
    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println(" Enter" +capacity + " numbers :");
        for (int i = 0; i<array.length; i++){
            array[i] = s.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array){
        for(int i =0; i< array.length; i++){
            System.out.println(" Elements : " + array[i]);
        }
    }
    public static int[] sortArray(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i = 0; i<array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag= true;
        int temp;
        while(flag) {
            flag = false;
            for(int i = 0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i]= sortedArray[i+1];
                    sortedArray[i+1] = sortedArray[i];
                    flag = true;
                }

            }
        }
        return sortedArray;
    }

}
