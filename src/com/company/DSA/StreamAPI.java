package com.company.DSA;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {


    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        long count = strList.stream()
                .filter(x -> x.startsWith("a"))
                .count();
        System.out.println(count);
    }
}
