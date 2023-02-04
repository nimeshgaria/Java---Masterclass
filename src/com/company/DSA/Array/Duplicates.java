
package com.company.DSA.Array;

import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        int[] inputArray = {21,21,5,3,1};
       /* findDuplicatesUsingHashMap(inputArray);
        checkArrayListDuplicatesElement();*/
        printDuplicates();
    }
    private static void checkArrayListDuplicatesElement(){
        List<Integer> integerList = Arrays.asList(21,21,5,3,1);
        Set<Integer> set = new HashSet<>(integerList);
        if(integerList.size() == set.size()){
            System.out.println("No duplicates");
        }else{
            System.out.println("Duplicates present");
        }
    }
    private static void printDuplicates(){
        List<Integer> integerList = Arrays.asList(21,21,5,3,1);
        Set<Integer> set = new HashSet<>();
        for(Integer i : integerList){
            if(set.add(i) == false){ // false because set adds non duplicates when true, false -> duplicates
                System.out.println(i);
            }
        }

    }
    private static void findDuplicatesUsingHashMap(int[] inputArray)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int element : inputArray)
        {
            if(map.get(element) == null)
            {
                map.put(element, 1);
            }
            else
            {
                map.put(element, map.get(element)+1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        for (Map.Entry<Integer, Integer> entry : entrySet)
        {
            if(entry.getValue() > 1)
            {
                System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
            }
        }
    }}

