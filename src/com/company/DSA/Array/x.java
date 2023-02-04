package com.company.DSA.Array;

import java.util.HashMap;
import java.util.Map;

public class x {
    public static void main(String[] args) {
        int b[] = {1,1,2,5,5,5,5};
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i =0; i<b.length; i++){

            if(m.containsKey(b[i])){
                m.put(b[i], m.get(b[i])+ 1);
            }else{
                m.put(b[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e : m.entrySet()){
            System.out.println("Key is "+e.getKey() + "and frequency is " +e.getValue());
        }
    }
}
