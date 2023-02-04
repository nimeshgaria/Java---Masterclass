package com.company.DSA.Strings;

import java.util.Arrays;

public class AnagramOrNot {
    static void isAnagram(String str1 , String str2 )
    {
        String s1= str1.replaceAll("\\s" , "");
        String s2= str2.replaceAll("\\s" , "");
        boolean status = true;
        if(s1.length() != s2.length())
        {
            System.out.println("Not possible");
        }else{
            char[] s1Array = s1.toLowerCase().toCharArray();
            char[] s2Array = s2.toLowerCase().toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            status = Arrays.equals(s1Array, s2Array);
            if(status == true){
                System.out.println(s1 + " " + s2 + " " + " are anagrams");
            }else{
                System.out.println(s1 + " " + s2 + " " + " are not anagrams");
            }
        }


    }
    public static void main(String[] args) {
    isAnagram("Mother In Law" , "Hitler Woman");
    }
}
