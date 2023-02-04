package com.company.ApnaCollege.M13;

public class HollowRectangle {
    public static void rectangle(int totRows, int totCols){

        for(int i =1; i<= totRows; i++){
            // inner - columns
            for(int j=1; j<= totCols; j++){
                // condition for printing *
                if(i == 1 || j == 1 || i == totRows || j == totCols ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void invertedTriangle(int n ){
        // outer
        for(int i = 1; i<=n; i++){
            // spaces print
            for(int  j = 1 ; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void halftPyramidWithNumber(int n){

        for(int i=1; i<=n; i++){
            //inner no.
            for(int j =1; j<=n-i+1; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void floydTriangle(int n ){
        int counter =1;
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void zeroOneTriangle(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        for(int i = 1 ; i<=n;i++){
            // stars - i
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            // spaces for i (2*(n-i)) = 2*(4-1) = 6
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // stars - i

            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half or reflection of above
        for(int i = n ; i>=1;i--){
            // stars - i
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            // spaces for i (2*(n-1)) = 2*(4-1) = 6
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // stars - i

            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void rhombus(int n ){
        for(int i =1;i<=n; i++){
            //spaces
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // hollow rectangle - stars
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i ==n || j ==n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    public static void diamond(int n){
    // 1st half
    for(int i=1;i<=n; i++){
        //spaces
        for(int j=1; j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
        }

        System.out.println();
    }
    // 2nd half
        for(int i=n; i>=1; i--){
            // spaces

            for(int j=1; j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {/*
        rectangle(4,5);
        System.out.println("Inverted triange : ");
        System.out.println();
        invertedTriangle(5);
        halftPyramidWithNumber(5);
        System.out.println("Floyd triangle");
        floydTriangle(5);
        zeroOneTriangle(5);
        butterfly(5);
        rhombus(10);
        hollow_rhombus(6);     */
        diamond(6);
    }
}
