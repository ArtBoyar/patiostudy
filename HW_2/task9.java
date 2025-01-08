package HW_2;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        String result = checkEvenOrOdd(num1, num2);
        System.out.println(result);

        scanner.close();
    }
    public static String checkEvenOrOdd(int num1, int num2) {
        int sum = num1 + num2;
        return (sum % 2 == 0) ? "Even" : "Odd";
    }
}
