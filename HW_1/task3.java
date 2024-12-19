package HW_1;

import java.util.Scanner;

public class task3 {

    public static boolean isSquareOfEachOther(int a, int b) {
        return (a * a == b || b * b == a);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        if (isSquareOfEachOther(a, b)) {
            System.out.println("Одно число является квадратом другого.");
        } else {
            System.out.println("Ни одно число не является квадратом другого.");
        }
    }
}