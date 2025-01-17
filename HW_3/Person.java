package HW_3;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person () {
        this.name = "None";
        this.age = 0;
        this.gender = "None";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void printInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Пол: " + gender);
    }
    public static void main(String[] args) {
        Person person1 = new Person("Иван", 25);
        person1.setGender("Мужской");

        Person person2 = new Person("Мария", 30);
        person2.setGender("Женский");

        Person person3 = new Person();
        person3.setName("Алексей");
        person3.setAge(40);
        person3.setGender("Мужской");

        person1.printInfo();
        person2.printInfo();
        person3.printInfo();
    }
}
