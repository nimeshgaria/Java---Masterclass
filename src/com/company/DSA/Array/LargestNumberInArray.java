package com.company.DSA.Array;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 9};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Max is" + " " +max);
    }

}
