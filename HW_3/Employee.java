package HW_3;

public class Employee {

    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
        } else {
            System.out.println("Процент увеличения зарплаты должен быть положительным.");
        }
    }

    public void printEmployeeInfo() {
        System.out.println("Сотрудник: " + name + ", Должность: " + position + ", Зарплата: " + salary);
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee("Иван Иванов", "Dev", 5000);
        Employee emp2 = new Employee("Мария Петрова", "QA", 2000);
        Employee emp3 = new Employee("Сергей Смирнов", "BA", 4000);

        emp1.printEmployeeInfo();
        emp2.printEmployeeInfo();
        emp3.printEmployeeInfo();

        emp1.increaseSalary(10);
        emp2.increaseSalary(15);
        emp3.increaseSalary(5);

        System.out.println("После увеличения зарплаты:");
        emp1.printEmployeeInfo();
        emp2.printEmployeeInfo();
        emp3.printEmployeeInfo();
    }
}

