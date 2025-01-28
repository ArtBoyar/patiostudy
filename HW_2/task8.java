package HW_2;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {

        boolean result = isDivisibleByTwentyOrThree(11);
        System.out.println(result);
    }
    public static boolean isDivisibleByTwentyOrThree(int num) {
        if (num % 2 == 0) {
            return true;
        } else if (num % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
