package com.company.CodingExercise;

import java.util.Locale;

public class CountCharacter {
    public static void main(String[] args) {
        System.out.println(sentence("my name is "));
    }
    public static int sentence(String s){
        s= s.replaceAll("\\s", "");
        s = s.toLowerCase();

        char c[]= s.toCharArray();
        int counter =0;
        for(int i =0; i<c.length; i++){
                counter++;
        }
        return counter;
    }
}
