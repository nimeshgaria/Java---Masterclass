package com.company.QuestionBank;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter distance");
    int user_distance = s.nextInt();
    System.out.println("Enter taxi");
    int taxi= s.nextInt();
    System.out.println("Taxi no.: " +taxi);
    System.out.println("Distance covered " +user_distance);



        calculate(user_distance);
    }
    private static int calculate(int distance){
        int basefare = 100;
        int additional_fare;
        int final_fare = 0;

        if(distance <= 5)
        {
            System.out.println("Rs" +basefare);
        }
        else if ( distance <=15 && distance > 5)
        {
            additional_fare = (distance - 6)*10;
            final_fare = basefare + additional_fare;
            System.out.println("Rs" + final_fare);
        }
        else if(distance <=25 && distance > 15)
        {
            additional_fare = (distance - 16)* 8;
            final_fare = basefare + additional_fare;
            System.out.println("Rs" +  final_fare);
        }
        else if ( distance > 25)
        {
            additional_fare =(distance - 26)* 5;
            final_fare = basefare + additional_fare;
            System.out.println("Rs" + final_fare);
        }
return distance;
    }
}
