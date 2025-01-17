package HW_2;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        Integer result = processNumbers(num1, num2);
        System.out.println(result);
    }
    public static Integer processNumbers(int num1, int num2) {
        if (num1 % 3 == 0 && num2 % 3 == 0) {
            return num1 + num2;
        }
        else if (num1 % 3 == 0 || num2 % 3 == 0) {
            return num2 * 2;
        }
        return null;
    }
}

