package HW_3;

public class Product {
    private String name;
    private String category;
    private int quantity;
    private double pricePerUnit;


    public Product(String name, String category, int quantity, double pricePerUnit) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }


    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }


    public double calculateTotalPrice() {
        return quantity * pricePerUnit;
    }


    public void printProductInfo() {
        System.out.println("Товар: " + name + ", Категория: " + category + ", Количество: " + quantity + ", Общая стоимость: " + calculateTotalPrice());
    }

    public static void main(String[] args) {

        Product product = new Product("Ноутбук", "Портативные компьютеры", 5, 1200);

        product.setQuantity(10);

        product.printProductInfo();
    }
}
