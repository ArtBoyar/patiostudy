package HW_3;

public class Rectangle {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public void printRectangleInfo() {
        System.out.println("Прямоугольник: Ширина = " + width + ", Высота = " + height + ", Площадь = " + calculateArea() + ", Периметр = " + calculatePerimeter());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7);

        rectangle.printRectangleInfo();
    }
}

