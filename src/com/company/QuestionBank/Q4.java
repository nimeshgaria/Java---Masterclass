package com.company.QuestionBank;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter cost price: ");
        double cp = s.nextDouble();
        System.out.println("Enter selling price");
        double sp = s.nextDouble();
        if(cp > sp){
            double loss = cp - sp;
            double loss_p = (loss/cp)* 100;
            System.out.println("Loss is : " + loss +  " and loss % is : " +loss_p);
        }
        else if (sp > cp){
                double profit = sp - cp;
                double profit_p = (profit/cp )* 100;
                System.out.println("Profit is : " + profit + " and profit % is : " +profit_p);
        }
        else if ( cp == sp ){
            System.out.println("Neither profit or loss");
        }

        s.close();
    }
}
   /* public static int calculate(){

    }*/

