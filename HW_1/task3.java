package HW_1;

import java.util.Scanner;
public class task3 {

    public static boolean isSquareOfEachOther(int a, int b) {
        return (a == Math.pow(b, 2) || b == Math.pow(a, 2));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.println(isSquareOfEachOther(num1, num2));

        scanner.close();
    }
}