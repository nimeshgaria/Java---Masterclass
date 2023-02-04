package com.company.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FInterfacePractice implements Comparator<Integer> {
    public static void main(String[] args) {
       listCompare();
    }
    public static void listCompare(){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        //Collections.sort(list);
        Comparator<Integer> c = new FInterfacePractice();
        Collections.sort(list,c);
        for(Integer a : list){
            System.out.print(a + " ");

        }
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1>o2){
            return -1;
        }else if(o1<o2){
            return 1;
        }else{
            return 0;
        }
    }
}
