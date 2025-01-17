package HW_2;

import java.util.Scanner;

public class task6 {
    public static boolean areAbsoluteValuesEqual(int num1, int num2) {
        return Math.abs(num1) == Math.abs(num2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.println(areAbsoluteValuesEqual(num1, num2));

        scanner.close();
    }
}
