package HW_2;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {

        int max = findMax(10, 12, 20);
        System.out.println(max);

    }

    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
