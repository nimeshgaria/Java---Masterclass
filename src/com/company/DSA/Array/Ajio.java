package com.company.DSA.Array;

import java.util.HashMap;
import java.util.Map;

public class Ajio {


    //Input: nums = [2,5,7,11,15], target = 9
    //Output: [0,2]
    //Explanation: Because nums[0] + nums[2] == 9, we return [0, 2].

    static void sum() {
        int nums[] = {2, 5, 7, 11, 15};
        int target = 9;
        int rem_no = 0;
        int sum = 0;
        Map<Integer, Integer> hashmap = new HashMap<>();
        hashmap.put(2, 0);
        hashmap.put(5, 1);
        hashmap.put(7, 2);
        hashmap.put(11, 3);
        hashmap.put(15, 4);

        //hashmap.forEach((k,v)-> System.out.println("key = " +k + "value = " +v));
            for(Map.Entry<Integer, Integer> a: hashmap.entrySet() ){
                System.out.println("Key = "+a.getKey() + ", Value = "+ a.getValue());
            }
    }

    public static void main(String[] args) {
        sum();
    }
}
