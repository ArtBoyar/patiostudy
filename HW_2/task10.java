package HW_2;

import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {

        boolean result = isDivisibleByFourAndSix(24);
        System.out.println(result);
    }
    public static boolean isDivisibleByFourAndSix(int number) {
        return number % 4 == 0 && number % 6 == 0;
    }
}
