package HW_1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        System.out.println(endWithNumb(25));

    }
        public static boolean endWithNumb(int e) {
            return Math.abs(e) % 10 == 5;
        }
    }

