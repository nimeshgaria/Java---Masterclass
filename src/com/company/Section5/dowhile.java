package com.company.Section5;

public class dowhile {
    public static void main(String[] args) {
    int number = 4;
    int finalnumber = 20;
    int eno = 0;
    while(number <= finalnumber){
        number++;
        if(!isEvenNumber(number)){
            continue;
        }
        eno++;
        System.out.println("Even number : " +number );
    }
        System.out.println(eno);
    }
    public static boolean isEvenNumber(int number){
    if(number%2 == 0){
        return true;
    }
    else {
        return false;
    }
    }
}
