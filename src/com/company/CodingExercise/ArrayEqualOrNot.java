package com.company.CodingExercise;

import java.util.Arrays;

public class ArrayEqualOrNot {
    public static boolean check() {
        int[] a = {1, 5, 0, 4};
        int[] b = {5, 1, 0, 4};
        Arrays.sort(a);
        Arrays.sort(b);
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;

                }
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(check());
    }
}
