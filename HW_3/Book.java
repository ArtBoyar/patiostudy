package HW_3;

public class Book {

    public String title;
    public String author;
    public double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public static void main(String[] args) {

        Book myBook = new Book("Java Rush", "RussiaBooksHoldings", 45.99);

        myBook.setAuthor("MinskBooksHoldings");
        myBook.setPrice(80);

        System.out.println("Book Details:");
        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Price: BYN" + myBook.getPrice());
    }
}
