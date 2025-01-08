package HW_2;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        String result = checkSum(num1, num2);
        System.out.println(result);
    }
    public static String checkSum(int num1, int num2) {
        int sum = num1 + num2;

        if (sum % 2 == 0 && sum % 10 == 0) {
            return "Even and Divisible by 10";
        } else if ((sum % 2) == 0) { // тут указал что бы смотрел на целочисленный остаток, т.к если юзать без скобок, всегда тру возвращает
            return "Even but not Divisible by 10";
        } else {
            return "Odd";
        }
    }
}
