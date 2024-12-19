package HW_1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для проверки: ");
        int number = scanner.nextInt();

        if (isWithinRange(number)) {
            System.out.println("Число входит в интервал от 10 до 20 включительно.");
        } else {
            System.out.println("Число не входит в интервал от 10 до 20 включительно.");
        }

        scanner.close();
    }
    public static boolean isWithinRange(int number) {
        return number >= 10 && number <= 20;
    }
}
