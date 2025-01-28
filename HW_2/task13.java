package HW_2;

import java.util.Scanner;

public class task13 {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        if (number < 0) {
            return false;
        }

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
    public static void main(String[] args) {

        System.out.println(isPalindrome(123321));
    }
}

