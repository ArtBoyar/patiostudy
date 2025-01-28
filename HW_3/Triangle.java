package HW_3;

public class Triangle {
    private double a;
    private double b;
    private double c;
    public Triangle(double a, double b, double c) {
        if (isValidTriangle(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        if (isValidTriangle(a, this.b, this.c)) {
            this.a = a;
        }
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        if (isValidTriangle(this.a, b, this.c)) {
            this.b = b;
        }
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        if (isValidTriangle(this.a, this.b, c)) {
            this.c = c;
        }
    }
    private boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
    public double calculatePerimeter() {
        return a + b + c;
    }
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public void printTriangleInfo() {
        System.out.println("Стороны треугольника: A = " + a + ", B = " + b + ", C = " + c);
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
    }
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(3, 4, 5);

            triangle.printTriangleInfo();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
