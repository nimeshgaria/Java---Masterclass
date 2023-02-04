package com.company.Section11.Scope.Challenge;

public class X {
    public int x;

    public X(int x) {
        this.x = x;
    }
    public void x(){
        for(int x = 1; x<13; x++){
            System.out.println(x + " times " + this.x + " equals " + x * this.x);
        }
    }
}
