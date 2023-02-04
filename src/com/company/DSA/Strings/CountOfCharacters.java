package com.company.DSA.Strings;

public class CountOfCharacters {
    public static void main(String[] args) {
        String s = "Hello world";
        String sNoSpace = s.replaceAll("\\s","");
        char[] newB = sNoSpace.toCharArray();
        int count = 0;
        for(int i = 0; i<sNoSpace.length(); i++){
                count++;}

        System.out.println("Numbers of digits are " +count);

    }
}
