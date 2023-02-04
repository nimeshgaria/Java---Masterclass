package com.company.ApnaCollege.M14Array;

import java.util.HashSet;

public class QBank {
    public static boolean containsDuplicate(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i< nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }else {
                set.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,4,6,2};
        System.out.println(containsDuplicate(nums));
    }
}
