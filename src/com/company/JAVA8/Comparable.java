package com.company.JAVA8;

import java.util.Arrays;

class Pair implements java.lang.Comparable<Pair> {
    String firstName;
    String lastName;

    public Pair(String x, String y){
        this.firstName = x;
        this.lastName = y;
    }
    public String toString(){
        return "(" + firstName + " , " + lastName + ")";
    }
    @Override
    public int compareTo(Pair a){
        if(this.firstName.compareTo(a.firstName) != 0){
            return this.firstName.compareTo(a.firstName);
        }else{
            return this.lastName.compareTo(a.lastName);
        }
    }
}
public class Comparable {
    public static void main(String[] args) {
        Pair p[] = new Pair[3];
        p[0]=  new Pair("a","b");
        p[1]=  new Pair("d","z");
        p[2]=  new Pair("c","t");
        Arrays.sort(p);
        for(Pair z : p){
            System.out.print(z.firstName);
            System.out.print(z.lastName);
            System.out.println();
        }

    }
}
