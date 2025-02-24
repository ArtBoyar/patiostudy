package HW_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double averageGrade;
    public Student(String name, int age, double averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getAverageGrade() {
        return averageGrade;
    }
}
class StudentDatabase {
    private Map<String, Student> students;

    public StudentDatabase() {
        this.students = new HashMap<>();
    }
    public void addStudent(Student student) throws IllegalArgumentException {
        if (students.containsKey(student.getName())) {
            throw new IllegalArgumentException("Студент с именем " + student.getName() + " уже существует в базе данных.");
        }
        students.put(student.getName(), student);
    }
    public void removeStudent(String name) throws IllegalArgumentException {
        if (!students.containsKey(name)) {
            throw new IllegalArgumentException("Студент с именем " + name + " не найден в базе данных.");
        }
        students.remove(name);
    }
    public double getAverageGrade(String name) throws IllegalArgumentException {
        if (!students.containsKey(name)) {
            throw new IllegalArgumentException("Студент с именем " + name + " не найден в базе данных.");
        }
        return students.get(name).getAverageGrade();
    }
}

class Menu {
    public static void main(String[] args) {
        StudentDatabase database = new StudentDatabase();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1 - Добавить студента");
            System.out.println("2 - Удалить студента");
            System.out.println("3 - Получить средний балл студента");
            System.out.println("4 - Выйти");
            System.out.print("Введите номер действия: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Введите имя студента: ");
                        String name = scanner.nextLine();
                        System.out.print("Введите возраст студента: ");
                        int age = scanner.nextInt();
                        System.out.print("Введите средний балл студента: ");
                        double averageGrade = scanner.nextDouble();
                        scanner.nextLine();

                        Student student = new Student(name, age, averageGrade);
                        database.addStudent(student);
                        System.out.println("Студент добавлен.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Введите имя студента для удаления: ");
                        String nameToRemove = scanner.nextLine();
                        database.removeStudent(nameToRemove);
                        System.out.println("Студент удален.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Введите имя студента для получения среднего балла: ");
                        String nameToGetGrade = scanner.nextLine();
                        System.out.println("Средний балл " + nameToGetGrade + ": " + database.getAverageGrade(nameToGetGrade));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный ввод, попробуйте снова.");
            }
        }
    }
}


