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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        System.out.println(isEvenSumOfDigits(number) ? "Сумма цифр четная." : "Сумма цифр нечетная.");

        scanner.close();
    }
}

