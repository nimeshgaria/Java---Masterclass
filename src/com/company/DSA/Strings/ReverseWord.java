package com.company.DSA.Strings;

public class ReverseWord {
    public static void main(String[] args) {
        String s = "hello";
        char[] a = s.toCharArray();
        String reverse = "";

        System.out.println(s.length());
        for(int i =s.length()-1; i>=0; i--)
        {
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse); // olleh

    }
}
