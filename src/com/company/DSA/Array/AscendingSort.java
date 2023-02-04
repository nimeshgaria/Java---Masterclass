package com.company.DSA.Array;

public class AscendingSort {
    public static void main(String[] args) {
        int a[] = {3,2,6,2,10};
        int temp = 0;
        for(int i = 0 ; i< a.length; i++){
            for(int j = i+1; j< a.length; j++)
            if(a[i] > a[j]) // 3 ,2
            {
                temp = a[i]; // 3
                a[i] = a[j]; // 2
                a[j] = temp; // 3
            }

            System.out.println(a[i]);
        }
    }
}
