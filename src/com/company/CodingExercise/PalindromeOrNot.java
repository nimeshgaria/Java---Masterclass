package com.company.CodingExercise;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String s = "abba";
        char[] sch  = s.toCharArray();
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                System.out.println("false");
                break;
            }
        }System.out.println("true");
    }
}
