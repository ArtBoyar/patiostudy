package HW_2;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {

        String result = checkSum(10, 15);
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
