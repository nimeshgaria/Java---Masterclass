package com.company.ApnaCollege.M12.QBank;

public class QMain {
    public static void averageOfThree(int a , int b, int c){
        int sum = (a+b+c)/3;
        System.out.println(sum);
    }
    public static boolean isEven(int a){
        if(a %2 == 0){
            return true;
        }
        return false;
    }
    public static boolean isPalindrome(int num){
        int result = 0 ;
        int savedNum = num;
        while(num > 0){
            int lastDigit = num % 10; // 1 , 2
            result = ( result*10) + lastDigit;
            num/= 10;
        }
        if(result == savedNum){
            return true;
        } return false;
        }
        public static void computeSumOfDigits(int num){
        int sum  = 0;
        while(num> 0){

        }
        String s ="32";
        char[] a = s.toCharArray();
    }

    public static void main(String[] args) {
    averageOfThree(5,3,8);
        System.out.println(isEven(9));
        System.out.println(isPalindrome(121));
    }
}
