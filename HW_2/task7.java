package HW_2;

import java.util.Scanner;

public class task7 {
    public static String checkNumber(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для проверки: ");
        int number = scanner.nextInt();
        System.out.println(checkNumber(number));

        scanner.close();
    }
}