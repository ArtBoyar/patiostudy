package HW_1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        System.out.println(endWithNumb(number));

        scanner.close();
    }
        public static boolean endWithNumb(int e) {
            return Math.abs(e) % 10 == 5;
        }
    }

