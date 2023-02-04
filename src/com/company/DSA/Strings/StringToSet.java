package com.company.DSA.Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringToSet {
    public static void main(String[] args) {
        String[] words = {"ace", "boom", "crew", "dog", "eon","ace"};
        Set<String> mySet = new HashSet<String>(Arrays.asList(words));
        for(String s: mySet){
            System.out.print(s+ " ");
        }

    }
}
