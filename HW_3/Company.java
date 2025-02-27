package HW_3;

class Company {
    private String name;
    private int employees;
    private double revenue;

    public Company(String name, int employees, double revenue) {
        this.name = name;
        this.employees = employees;
        this.revenue = revenue;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmployees() {
        return employees;
    }
    public void setEmployees(int employees) {
        this.employees = employees;
    }
    public double getRevenue() {
        return revenue;
    }
    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
    public void printCompanyInfo() {
        System.out.println("Компания: " + name + ", Сотрудников: " + employees + ", Доход: " + revenue);
    }
    public static void main(String[] args) {

        Company company = new Company("Patio", 150, 5000000);
        company.printCompanyInfo();
    }
}

