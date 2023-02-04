package com.company.DSA.Array;

import java.util.ArrayList;
import java.util.List;
/*   Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
   Input: nums = [2,7,11,15], target = 9
   Output: [0,1]

   rem_n = 9-2*/
public class paysafe {
        static void integerSum(int[] nums, int target){
            List<Integer> indexList = new ArrayList<Integer>();
            for(int i =0; i<nums.length-1;i++)
            {

                int rem_n = target-nums[i];
                for(int j = i+1; j<nums.length; j++)
                {
                    if(nums[j] == rem_n)
                    {
                        indexList.add(i);
                        indexList.add(j);
                        System.out.println(indexList);

                    }

                }

            }


        }

    public static void main(String[] args) {
        int abc[] = {2,7,11,15};
        integerSum(abc, 9);
    }
}




     /*   static void integerSum(int[] nums, int target){

            List<Integer> indexList = new ArrayList<Integer>();
            for(int i =0; i<nums.length-1;i++)
            {

                int rem_n = target-nums[i];
                for(int j = nums.length; j>--)
                {
                    if(a[j] == rem_n)
                    {
                        indexList.add(i);
                        indexList.add(j);
                        return indexList;
                    }
                    if(a[j] > rem_n)
                    {
                        j--;
                    }

                }

            }


            Given two strings s and t, return true if t is an anagram of s, and false otherwise.

                    input : s = abcd , t = bcad
            output : true.


            static boolean anagram(String s, String t){
                char[] s_arr = s.toCharArray();
                char[] t_arr = t.toCharArray();

                Map<Character, Integer> hmForS = new HashMap<Character, Integer>();
                Map<Character, Integer> hmForT= new HashMap<Character, Integer>();


                for(Map.entry() : hmForS : char i : Integer a){
                    if(char[a] != s_arr ){
                    }else{
                        hmForS.put(i, a+1); }

                }
            }





        }*/
