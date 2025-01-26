package HW_1;

import java.util.Scanner;

public class task2 {
        public static boolean isWithinInterval(int number) {
            return number >= 10 && number <= 20;
        }
        public static void main(String[] args) {

            System.out.println(isWithinInterval(25));
        }
    }
