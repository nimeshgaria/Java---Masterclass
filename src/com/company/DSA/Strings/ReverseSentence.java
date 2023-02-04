package com.company.DSA.Strings;

public class ReverseSentence {
    public static void main(String[] args) {
        String str=  "I love programming";
        String rev = "";

        //Breaking the sentence into words
        String s[] = str.split(" ");

        //Adding the words stored in the array to the last
        for(int i=s.length-1;i>=0;i--){
            rev += s[i]+" ";
        }
        System.out.println(rev); // programming love I

}
}
