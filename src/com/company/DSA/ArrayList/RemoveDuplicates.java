package com.company.DSA.ArrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
/*  Q. Make a new list which does not contain element present in old list.

*
        List<Integer> integerList  = Arrays.asList(1,3,3,2);
        List<Integer> newList = new ArrayList<>();
        for(Integer a : integerList){
            if(!newList.contains(a)){
                newList.add(a);
            }
        }
        System.out.println(newList);
    }

 */
/*
*
*
*Approach 3: This problem can also be solved using extra space that is by using an
 additional data structure that will check if the element is seen before or not if
 seen then we can return true.

For this, we can use any data structure like HashSet, HashTable, or
ArrayList as almost all data structures have a predefined function that
 checks if there already exists a given integer or not.
 * Time Complexity:  O(N), where N is the length of the array. As searching hash_set takes O(1)

Space Complexity: O(N), Where N is the number of elements stored in the set
 *
 * */
        List<Integer> integerList= Arrays.asList(1,4,3,2,2);
        Set<Integer> set = new HashSet<>();
        for(int a : integerList){
            set.add(a);
        }
        if(set.size() == integerList.size()){
            System.out.println("Duplicates not present");
        }else {
            System.out.println("Duplicates present");
        }

    }

}
