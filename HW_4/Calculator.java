package HW_4;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.println("Выберите операцию (+, -, *, /, ^, sqrt): ");
        String operation = scanner.next();

        double result = 0;

        if (operation.equals("sqrt")) {
            if (num1 < 0) {
                System.out.println("Ошибка: нельзя извлечь корень из отрицательного числа");
                return;
            }
            result = Math.sqrt(num1);
        } else {
            System.out.println("Введите второе число: ");
            double num2 = scanner.nextDouble();

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Ошибка: деление на ноль запрещено");
                        return;
                    }
                    result = num1 / num2;
                    break;
                case "^":
                    result = Math.pow(num1, num2);
                    break;
                default:
                    System.out.println("Ошибка: неверная операция");
                    return;
            }
        }

        System.out.println("Результат: " + result);
        scanner.close();
    }
}