package HW_5;

class Student extends Person {
    private double averageGrade;
    public Student(String name, int age, double averageGrade) {
        super(name, age);
        this.averageGrade = averageGrade;
    }
    public double getAverageGrade() {
        return averageGrade;
    }
}


