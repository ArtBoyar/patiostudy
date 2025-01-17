package HW_3;

public class Phone {

    private String brand;
    private String model;
    private double price;

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            this.price -= this.price * (percentage / 100);
        } else {
            System.out.println("Некорректный процент скидки.");
        }
    }

    public void printPhoneDetails() {
        System.out.println("Телефон: " + brand + " " + model + ", Цена: " + price);
    }

    public static void main(String[] args) {

        Phone phone = new Phone("Iphone", "SE", 799.99);
        phone.printPhoneDetails();

        double discount = 10;
        phone.applyDiscount(discount);
        phone.printPhoneDetails();
    }

}

