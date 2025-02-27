package HW_5;

import java.util.HashMap;
import java.util.Map;

class StudentDatabase {
    private Map<String, Student> students;
    public StudentDatabase() {
        this.students = new HashMap<>();
    }
    public void addStudent(Student student) throws IllegalArgumentException {
        if (students.containsKey(student.getName())) {
            throw new IllegalArgumentException("Студент с именем " + student.getName() + " уже существует в базе данных.");
        }
        students.put(student.getName(), student);
    }
    public void removeStudent(String name) throws IllegalArgumentException {
        if (!students.containsKey(name)) {
            throw new IllegalArgumentException("Студент с именем " + name + " не найден в базе данных.");
        }
        students.remove(name);
    }
    public double getAverageGrade(String name) throws IllegalArgumentException {
        if (!students.containsKey(name)) {
            throw new IllegalArgumentException("Студент с именем " + name + " не найден в базе данных.");
        }
        return students.get(name).getAverageGrade();
    }
}
