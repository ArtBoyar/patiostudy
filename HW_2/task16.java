package HW_2;

import java.util.Scanner;
public class task16 {

    public static boolean isDivisibleWithRemainderTwo(int a, int b) {
        if (b == 0) {
            return false;
        }
        return a % b == 2;
    }
    public static void main(String[] args) {

        boolean result = isDivisibleWithRemainderTwo(10, 5);
        System.out.println(result);

    }
}

