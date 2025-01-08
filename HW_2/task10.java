package HW_2;

import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        boolean result = isDivisibleBy4And6(number);
        System.out.println(result);
    }
    public static boolean isDivisibleBy4And6(int number) {
        return number % 4 == 0 && number % 6 == 0;
    }
}
