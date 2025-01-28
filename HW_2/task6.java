package HW_2;

import java.util.Scanner;

public class task6 {
    public static boolean areAbsoluteValuesEqual(int num1, int num2) {
        return Math.abs(num1) == Math.abs(num2);
    }
    public static void main(String[] args) {

        System.out.println(areAbsoluteValuesEqual(5, 5));

    }
}
