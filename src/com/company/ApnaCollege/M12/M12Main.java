package com.company.ApnaCollege.M12;

public class M12Main {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int functionOverloading(int num1, int num2) {
        return num1 + num2;
    }

    public static int functionOverloading(int a, int b, int c) {
        return a + b + c;
    }

    public static float functionOverloading(float a, float b) {
        return a + b;
    }

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void primeNinRange(int n) {
        if (n == 2) {
            System.out.println(2);
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void binaryToDecimal(int binNum){
        int pow = 0;
        int decNum = 0;
        int myNum = binNum;

        while(binNum>0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum/ 10;
        }
        System.out.println("Decimal of " +myNum + " is" +" " + decNum);
    }


    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int prod = multiply(a, b);
      /*  System.out.println("a & b = " + prod);
        factorial(4);
        System.out.println("Bin coeff is :" + " " +binCoeff(5,3));
        System.out.println(functionOverloading(2,5));
        System.out.println(functionOverloading(2,7,6));
        System.out.println(functionOverloading(2.2f,5.7f));
        System.out.println(isPrime(4));*/
        primeNinRange(10);
        binaryToDecimal(23);
    }
}
