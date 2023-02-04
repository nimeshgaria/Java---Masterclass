package com.company.JavaGuides;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(null);
        set.add(null);
        set.add(5);
        System.out.println(set);
        List<Integer> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(3);
        System.out.println(list);
    }
}
