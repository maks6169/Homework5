package geekbrains.lesson_5;

public class Employee5 {


    // Задание 1
    String initials;
    String position;
    String email;
    long phoneNumber;
    long salary; //long потому что я оптимист)
    int age;

    public Employee5(String initials, String position, String email, long phoneNumber, long salary, int age) {
        this.initials = initials;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public Employee5(String initials, String position, long salary, int age) {
        this.initials = initials;
        this.position = position;
        this.salary = salary;
        this.age = age;

    }

    public Employee5(String initials, int age) {
        this.initials = initials;
        this.age = age;
    }

    // Задание 2
    public Employee5() {
        this("Pupkin A. V.", "manager", 90000, 35);
        System.out.printf(" Employee %s\n Position %s\n Age %d\n", initials, position, age);
    }

    // Задание 3
    public void getInfo() {
        System.out.println();
        System.out.printf(" Employee %s\n Position %s\n Age %d\n email %s\n phoneNumber %d\n", initials, position, age, email, phoneNumber);
    }
}

