package HW_1;

import java.util.Scanner;

public class task2 {
        public static boolean isWithinInterval(int number) {
            return number >= 10 && number <= 20;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите число: ");
            int userInput = scanner.nextInt();

            System.out.println(isWithinInterval(userInput));

            scanner.close();
        }
    }
