package com.company.ApnaCollege.M14Array;

import java.util.Arrays;

public class Main {
    public static void updateArgument(int nonChangeable) {
        nonChangeable = 10;
        int marks[] = {97, 95, 92};
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
            System.out.println(marks[i]);
        }
    }

    public static int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void largestInArray() {

        int numbers[] = {2, 61, 54, 1, 54, 3};
        int largest = Integer.MIN_VALUE; // -ve infinity
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("Largest is " + largest);
        System.out.println("Smallest is " + smallest);
    }

    public static void reverseArray() {

        int numbers[] = {2, 4, 6, 8, 10};
        int first = 0;
        int last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }
    public static void pairs(){
        int nums[] = {2,4,6,8,10};
        for(int i=0; i< nums.length;i++){
            int curr = nums[i];
            for(int j=i+1; j< nums.length; j++){
                System.out.print("(" + curr + "," + nums[j] + ")");
            }
            System.out.println();
        }
    }
    public static void printSubArray(int num[]){
        //  int[] numbers = {6, 4, 2, 8, 10};
        for(int i=0; i< num.length; i++){
            for(int j=i; j< num.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(num[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void printSubArraySum(int num[]){
        //  int[] numbers = {6, 4, 2, 8, 10};
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i< num.length; i++){
            for(int j=i; j< num.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(num[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void kadanesOrMaxSubArraySum(){
        int num[] = {1,2,6,-3,-1,-6,7,3};
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i= 0; i<num.length; i++){
            cs = cs + num[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Max subarray sum" + " " +ms);
    }

    public static void main(String[] args) {/*
        updateArgument(3);
        int nonChangeable = 4;
        System.out.println(nonChangeable); */// prints 4 because declared here and method nonchangeable scope is limited.
        int[] numbers = {6, 4, 2, 8, 10};
      /*  int key = 10;
        int index =   linearSearch(numbers,key);
        if(index == -1){
            System.out.println("NOT found");
        }else {
            System.out.println("Index present at" + " " + index);
        }
        largestInArray()
        reverseArray();
        pairs();;*/
        //printSubArray(numbers);
        kadanesOrMaxSubArraySum();
    }
}
