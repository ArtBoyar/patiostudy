package HW_3;

public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public void printCircleInfo() {
        double circumference = calculateCircumference();
        double area = calculateArea();
        System.out.println("Круг: Радиус = " + radius + ", Площадь = " + area + ", Длина окружности = " + circumference);
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        
        circle.printCircleInfo();
    }
}

