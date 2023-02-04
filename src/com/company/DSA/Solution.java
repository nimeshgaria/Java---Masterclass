package com.company.DSA;

public class Solution {


    public static void main(String[] args) {
        sorting();
    }

    public static void sorting(){

        int[] A = {0, 1, 2, 0, 1, 2};
        int temp = 0;
        if (A.length< 1){
            System.out.print("no elements");
        }
        else{
            for(int i= 0 ; i<A.length; i++)
            {
                for(int j= i+1 ; j <A.length; j++)
                {
                    if(A[i] > A[j]) //
                    {
                        temp = A[i]; // 2
                        A[i] = A[j]; // 1
                        A[j] = temp; // 2
                    }
                }

                System.out.println(A[i]);
            }
        }
    }
}
