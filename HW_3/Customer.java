package HW_3;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private String email;
    private List<String> purchaseHistory;
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();
    }
    public void addPurchase(String item) {
        purchaseHistory.add(item);
    }
    public void printPurchaseHistory() {
        System.out.println("Клиент: " + name + ", История покупок: " + purchaseHistory);
    }
    public static void main(String[] args) {
        Customer customer = new Customer("Иван Иванов", "ivan@mail.ru");

        customer.addPurchase("Ноутбук");
        customer.addPurchase("Мобильный телефон");
        customer.addPurchase("Наушники");

        customer.printPurchaseHistory();
    }
}

