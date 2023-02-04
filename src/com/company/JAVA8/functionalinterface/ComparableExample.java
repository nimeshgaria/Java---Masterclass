package com.company.JAVA8.functionalinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableExample implements Comparator<Integer> {
    static List<Integer> numbers = Arrays.asList(10,5,90,18,100);
    public static void main(String[] args) {
        Collections.sort(numbers);
        System.out.println(numbers);
        Comparator<Integer> integerComparator = new ComparableExample();
        Collections.sort(numbers,integerComparator);
        System.out.println(numbers);
    //  startComparableFI();
    }

  /*  private static void startComparableFI(){
        Comparator<Integer> comparable = (a,b) ->{
           return a>b?-1:a<b?+1:0;
        };
        Collections.sort(numbers,comparable);
        System.out.println(numbers);
    }*/


    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1>o2)
            return -1; // o1 comes before o2
        else if (o1 < o2)
            return +1;  // o1 comes after o2
        else
            return 0;
    }

}


