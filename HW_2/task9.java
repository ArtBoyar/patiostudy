package HW_2;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {

        String result = checkEvenOrOdd(10, 4);
        System.out.println(result);

    }
    public static String checkEvenOrOdd(int num1, int num2) {
        int sum = num1 + num2;
        return (sum % 2 == 0) ? "Even" : "Odd";
    }
}
