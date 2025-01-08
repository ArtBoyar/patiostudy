package HW_1;

import java.util.Scanner;

public class task1 {
    public static boolean isDivisibleBy5And7(int number) {
        return number % 5 == 0 && number % 7 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для проверки: ");
        int testNumber = scanner.nextInt();

        System.out.println(isDivisibleBy5And7(testNumber));

        scanner.close();
    }
}