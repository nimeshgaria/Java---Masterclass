package com.company.Section8;

import java.util.Arrays;

public class MinElementChallenge {
    public static void main(String[] args) {
    int[] array = {1,4,10,2,6,3};
        System.out.println(" Array" + Arrays.toString(array));
        reverse(array);
        System.out.println(" Reverse array" + Arrays.toString(array));

    }
    public static void reverse(int array[]){

        int maxIndex = array.length-1;
        int halfLength = array.length /2;
        for(int i = 0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }
}
