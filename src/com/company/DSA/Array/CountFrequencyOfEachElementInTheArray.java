package com.company.DSA.Array;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfEachElementInTheArray {
    public static void main(String[] args) {
            int arr[] = {10, 10, 15, 10, 5,5};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {

            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else {
                hashMap.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> e : hashMap.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
