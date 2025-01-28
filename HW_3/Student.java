package HW_3;

public class Student {
    private String name;
    private int studentId;
    private double gpa;

    public Student(String name, int studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void printStudentDetails() {
        System.out.println("Студент: " + name + ", ID: " + studentId + ", GPA: " + gpa);
    }

    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student("Влад", 101, 6.8);
        students[1] = new Student("Олег", 102, 7.6);
        students[2] = new Student("Игорь", 103, 8.9);

        for (Student student : students) {
            student.printStudentDetails();
        }
    }
}
