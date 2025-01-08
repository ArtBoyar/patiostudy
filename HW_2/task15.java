package HW_2;

import java.util.Scanner;
public class task15 {

    public static String getAgeCategory(int age) {
        if (age <= 12) {
            return "Child";
        } else if (age >= 13 && age <= 17) {
            return "Teenager";
        } else if (age >= 18 && age <= 64) {
            return "Adult";
        } else {
            return "Senior";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        String category = getAgeCategory(age);
        System.out.println(category);

        scanner.close();
    }
}
