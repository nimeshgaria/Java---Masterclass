package com.company.DSA.Strings;

public class CountOfDigits {
    public static void main(String[] args) {
        String s= "12345";
        int sIntoInt = Integer.parseInt(s); // converts String to int .

        int count =0 ;
      /*  for(int i=0; i<s.length();i++){
            if(Character.isDigit(s.charAt(i)))
            {
                count++;
            }*/
            // OR
        while(sIntoInt != 0){
            count++;
            sIntoInt /= 10;
        }
        System.out.println(count);
    }
}
