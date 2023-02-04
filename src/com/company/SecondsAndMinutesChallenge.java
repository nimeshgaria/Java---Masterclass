package com.company;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(65,2));
        System.out.println(getDurationString(30));
    }
    public static String getDurationString (long minutes, long seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59 ){
            return "Invalid value";
        }
        long hours = minutes/60;
        long remainingMinutes = minutes % 60 ;
        return hours + "h" + remainingMinutes + "m" + seconds + "s";
    }
    public static String getDurationString (long seconds){
        if(seconds < 0){
            return "Invalid value";
        }
        long min = seconds / 60;
        long remainingSeconds= seconds % 60;
        return getDurationString(min, remainingSeconds);
    }
}
