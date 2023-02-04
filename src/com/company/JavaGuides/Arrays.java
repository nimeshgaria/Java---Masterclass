package com.company.JavaGuides;

import com.company.InterfacesChallenge.Monster;

import java.util.List;

public class Arrays {
    public static void dimensionalArray(){
        String[][] names = {{"Mr ","Mrs"}, {"Smith", "Jones"}};
        System.out.println(names[0][0] + names[1][1]);
    }
    public static void equals(){
        String a = "hello";
        String b = new String("hello");
        System.out.println(a.equals(b));
        System.out.println(a==b);
    }
    public static void divideArray(){
        String s = "This is it";
        StringBuilder sb = new StringBuilder(s);
        char alp[] = s.toCharArray();

        for(int i=0; i< alp.length; i++){
            if(alp[i] != ' '){
              sb.append(alp[i]);
            }
            System.out.println(sb);
        }


       /* System.out.println(s);
        String sec[] = s.split(" ");
        //String sec = s[2];
        System.out.println("First name" +sec[0]);
        System.out.println("last" +sec[2]);*/
    }
    /*
    public static void arrayStore(){
        Object no= new Monster("43",54,34)[5];
        no[2] =  new String("we");
    }*/
    public static void main(String[] args) {
        dimensionalArray();
       // arrayStore();
      divideArray();
      int[] a= new int[3];
      a[0] = 4;
        java.util.Arrays.asList("asd");
        List<char[]> test = java.util.Arrays.asList("nimesgh".toCharArray());
        System.out.println(test.get(1));

    }
}
