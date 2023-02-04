package com.company;

public class MethodOverloading {
    public static void main(String[] args) {
       double centimeters = calcFeetAndInchesToCentimeters(6,0);
       calcFeetAndInchesToCentimeters(6);
       if(centimeters < 0){
           System.out.println("Invalid");
       }
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || inches < 0 || inches > 12 ){
            System.out.println("Invalid ");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
       // centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " +centimeters + "cm");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0 ){
            return -1;
        }
        double feet = inches/12;
        double remainingInches = inches % 12;
        System.out.println(inches + "inches is equal to " + feet + "feet and " + remainingInches);
        double centimeters = calcFeetAndInchesToCentimeters(6,0);
        return calcFeetAndInchesToCentimeters(feet, inches);
    }


}
