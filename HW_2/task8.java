package HW_2;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        boolean result = isDivisibleBy2Or3(number);
        System.out.println(result);
    }
    public static boolean isDivisibleBy2Or3(int num) {
        if (num % 2 == 0) {
            return true;
        } else if (num % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
