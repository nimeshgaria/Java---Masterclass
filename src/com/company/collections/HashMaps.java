package com.company.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        int[] a = {2,2,15,5,5,2};
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i =0 ; i<a.length; i++){
            if(m.containsKey(a[i])){
                m.put(a[i], m.get(a[i])+1);
            }else{
                m.put(a[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> s : m.entrySet()){
            System.out.println("No. -> " + s.getKey() + " occurence -> " +  s.getValue());
        }

    }
}
