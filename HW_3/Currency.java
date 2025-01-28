package HW_3;

public class Currency {

    private String name;
    private double rateToUSD;

    public Currency(String name, double rateToUSD) {
        this.name = name;
        this.rateToUSD = rateToUSD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRateToUSD() {
        return rateToUSD;
    }

    public void setRateToUSD(double rateToUSD) {
        this.rateToUSD = rateToUSD;
    }

    public double convertToUSD(double amount) {
        return amount * rateToUSD;
    }

    public void printCurrencyInfo() {
        System.out.println("Валюта: " + name + ", Курс к USD: " + rateToUSD);
    }

    public static void main(String[] args) {

        Currency euro = new Currency("Евро", 1.12);

        euro.printCurrencyInfo();

        double amountInEuro = 100;
        double amountInUSD = euro.convertToUSD(amountInEuro);
        System.out.println(amountInEuro + " " + euro.getName() + " = " + amountInUSD + " USD");
    }
}