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

        String category = getAgeCategory(18);
        System.out.println(category);

    }
}
