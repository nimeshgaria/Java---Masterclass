package com.company.CodingExercise;

public class ArrayIndex {
    public static void main(String[] args) {
    index();
    }
    public static void index(){
        int a[] ={12,32,-10,20,13};
        for(int i=0; i< a.length; i++){
            if(a[i] == 20){
                System.out.println(" Index at : " + i + " and value is " + a[i] );
            }
        }

    }
}
