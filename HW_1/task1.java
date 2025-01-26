package HW_1;

import java.util.Scanner;

public class task1 {
    public static boolean isDivisibleByFiveAndSeven(int number) {
        return number % 5 == 0 && number % 7 == 0;
    }

    public static void main(String[] args) {

        System.out.println(isDivisibleByFiveAndSeven(42));

    }
}