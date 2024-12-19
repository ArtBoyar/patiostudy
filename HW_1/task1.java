package HW_1;

import java.util.Scanner;

public class task1 {
    public static boolean isDivisibleBy7And5(int number) {
        return (number % 7 == 0) && (number % 5 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (isDivisibleBy7And5(number)) {
            System.out.println(number + " делится на 7 и на 5.");
        } else {
            System.out.println(number + " не делится на 7 и на 5.");
        }

    }
}