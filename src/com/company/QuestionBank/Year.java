package com.company.QuestionBank;

public class Year {
    public static void main(String[] args) {
 knowYear(2000);
    }
    public static double knowYear(double year){
        if (year % 4 == 0 && year % 100 !=0 )
        {
            System.out.println("Leap year");
        }
        else if ( year % 400 == 0)
        {
            System.out.println("Century leap year");
            //Century years are NOT leap years UNLESS they can be evenly divided by 400.
        }
        else if( year % 100 == 0 && year % 4 != 0)
        {
            System.out.println("Century year but not leap year");
            //A century is a period of 100 years.
        }
        return year;
    }
}
