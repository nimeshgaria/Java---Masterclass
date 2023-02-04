package com.company.QuestionBank;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter distance");
    int taxi= s.nextInt();
        calculateFare(taxi);
    }
    private static double calculateFare(double distance)
    {
        double remaining_kilometer_fare;
        double fare = 800;
        double totalfare;
        if(distance <=100)
        {
            System.out.println("Rs 800");
        }
        else if(distance> 100 && distance <=200)
        {
            remaining_kilometer_fare = (distance - 100) * 10;
            totalfare = fare + remaining_kilometer_fare;
            System.out.println("Fare is " +totalfare);
        }
        else if(distance> 200)
        {
            remaining_kilometer_fare= (distance - 200) * 15;
            totalfare = fare + remaining_kilometer_fare;
            System.out.println("Fare is " +totalfare);
        }
    return distance;
    }

}
