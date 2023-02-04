package com.company.QuestionBank;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner s=  new Scanner(System.in);
        System.out.println("Enter monthly salary");
        double salary = s.nextInt();
       check(salary);

    }
    private static double check(double salary){
        double income_tax;
        if(salary > 90000)
        {
            income_tax = 0.2 * salary;
            System.out.println(income_tax);
        }
        else if (salary <= 90000 &&  salary > 60000 )
        {
            income_tax = 0.15 * salary;
            System.out.println(income_tax);
        }
        else if(salary < 60000)
        {
            income_tax = 0.10 * salary;
            System.out.println(income_tax);
        }
        return salary;
    }
}
