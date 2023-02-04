package com.company.JavaGuides;

public class StringsTricky {
    public static void questions(){
        String s = null;
        System.out.println(s.valueOf(10)); // prints 10;
        ///////////////////////

        String s1  = "abc";
        StringBuffer s2 = new StringBuffer(s1);
        String s3 =  "abc";
        String s5= "abc";
        String s4 = new String("abc");
        System.out.println("s1.equals(s2) "+s1.equals(s2)); // false
        System.out.println(s3==s5); // true
        System.out.println("s1.equals(s3) "+s1.equals(s3)); //true
        System.out.println("s1.equals(s4) "+s3.equals(s4)); // true
        //////////////////

        String he = "hello"; // scp
        String he2 = new String("hello"); // heap
        he2= he2.intern(); // heap to scp as making copy so true
        System.out.println(he == he2); //tr
    }
    public static void main(String[] args) {
        questions();
    }
}
