package com.company.DSA.Array;

public class CheckIfArraySortedOrNot {
    public static void main(String[] args) {

       System.out.println(sortedOrNot());
    }
      static boolean sortedOrNot(){
            int arr[] = {3,2,6,3,1};
            for(int i = 1; i<arr.length; i++)
            {
                if(arr[i] < arr[i-1])
                {
                    return false;
                }
            }return true;
        }


}
