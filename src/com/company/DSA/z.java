package com.company.DSA;

public class z {
    public static void main(String[] args) {
        String s = "qwe is amazing";
        String sarr[] = s.split(" ");
        String rev = " ";
        for (int i = sarr.length-1; i>=0; i--)
        {
            rev =  rev + " " +  sarr[i];
    }
        System.out.println(rev);
}

}

