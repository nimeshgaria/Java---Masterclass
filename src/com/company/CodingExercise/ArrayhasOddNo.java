package com.company.CodingExercise;

import java.util.ArrayList;
import java.util.List;

public class ArrayhasOddNo {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(2);
        a.add(10);
        for(int i : a){
            if(i%2 != 0){
                System.out.println("odd");
            }
            System.out.println("even");
        }
    }
}
