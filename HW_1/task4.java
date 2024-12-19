package HW_1;

import java.util.Scanner;

public class task4 {

    public static boolean endsWithFive(int number) {
        return number % 10 == 5;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int userInput = scanner.nextInt();

        System.out.println(userInput % 10 == 5 ? "Число заканчивается на 5" : "Число не заканчивается на 5");

        scanner.close();
    }
}

