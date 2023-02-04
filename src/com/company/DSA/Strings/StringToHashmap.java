package com.company.DSA.Strings;

import java.util.HashMap;
import java.util.Map;

public class StringToHashmap {
    public static void main(String[] args) {
        String[] stuName = {"nim", "raj", "priya"};
        Integer[] stuRoll = {1,2,4};

        Map<String, Integer> map = new HashMap<>();
        for(int i =0; i<stuName.length; i++){
            map.put(stuName[i], stuRoll[i]);
        }
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println("Key = "+e.getKey() + ",Value = "+e.getValue());
        }
    }
}
