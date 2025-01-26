package HW_1;

import java.util.Scanner;
public class task3 {

    public static boolean isSquareOfEachOther(int a, int b) {
        return (a == Math.pow(b, 2) || b == Math.pow(a, 2));
    }
    public static void main(String[] args) {

        System.out.println(isSquareOfEachOther(5, 8));

    }
}