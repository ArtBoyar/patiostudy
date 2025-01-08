package HW_2;

import java.util.Scanner;
public class task16 {

    public static boolean isDivisibleWithRemainderTwo(int a, int b) {
        if (b == 0) {
            return false;
        }
        return a % b == 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        boolean result = isDivisibleWithRemainderTwo(a, b);
        System.out.println(result);

        scanner.close();
    }
}

