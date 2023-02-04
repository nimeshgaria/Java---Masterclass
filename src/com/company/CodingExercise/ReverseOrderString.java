package com.company.CodingExercise;

public class ReverseOrderString {
    public static void main(String[] args) {
        Reverse();
    }
    public static void Reverse(){
        String s=  "man bites dog";
        String[] new_s =s.split("\\n",2);
        String reversesentence = " ";
        for(int i = new_s.length-1; i>0 ; i--){
            reversesentence =  new_s[i] ;
        }
        System.out.println(reversesentence);
    }
}
