package HW_2;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {

        Integer result = processNumbers(10, 20);
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

