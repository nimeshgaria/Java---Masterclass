package com.company.Section11.Scope;

public class ScopeCheck {
    public int publicVar = 0 ;
    private int varOne = 1;

    public ScopeCheck(){
        System.out.println("Scopecheck created ,  publicVar = " +publicVar + " privateVar = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public int getPublicVar() {
        return publicVar;
    }

    public void timesTwo(){
        int privateVar = 2;
        for(int i =0 ; i<10 ; i++){
            System.out.println(i + " times two is " + i * this.varOne);
        }
    }
    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class " + innerClass.varThree);
    }
    public class InnerClass{
        public int varThree = 3;
        public InnerClass(){
            System.out.println("Inner class created, varOne is " + varOne + " and varThree is  " +varThree);
        }
    }
}
