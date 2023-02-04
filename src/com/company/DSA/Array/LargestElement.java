package com.company.DSA.Array;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 9, 1, 3};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("Largest element is " + max);
    }
}
