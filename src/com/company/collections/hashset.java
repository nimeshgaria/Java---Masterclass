package com.company.collections;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(21);
        hashSet.add(304);
        hashSet.add(21);
        hashSet.add(211);
        System.out.println(hashSet);
        System.out.println(hashSet.contains(21));
        System.out.println(hashSet.isEmpty());
        hashSet.remove(21);
    }
}
