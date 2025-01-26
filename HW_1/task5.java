package HW_1;

import java.util.Scanner;

public class task5 {

    public static boolean isEvenSumOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number);
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum % 2 == 0;
    }
    public static void main(String[] args) {

        System.out.println(isEvenSumOfDigits(25) ? "Сумма цифр четная." : "Сумма цифр нечетная.");

    }
}

