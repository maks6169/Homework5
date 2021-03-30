package geekbrains.lesson_5;

public class Lesson5 {

    public static void main(String[] args) {
        Employee employee = new Employee("Alexeev A.I.", "Tech.director", "alex4535@mail.com", 89531543498L, 999999, 28);
        employee.initials = "Alexeev A.I.";
        employee.position = "Tech.director";
        employee.email = "alex4535@mail.com";
        employee.phoneNumber = 89531543498L;
        employee.salary = 999999;
        employee.age = 28;
        System.out.printf(" Employee %s\n Position %s\n Age %d\n", employee.initials, employee.position, employee.age);
        System.out.println();
        Employee employee1 = new Employee();
        employee.getInfo();

        // Задание 4
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Batman B. W.", 48);
        employees[1] = new Employee("Superman C. C.", 45);
        employees[2] = new Employee("WonderWoman G. G.", 25);
        employees[3] = new Employee("Flash B. A.", 20);
        employees[4] = new Employee("AquaMan A. B.", 41);

        // Задание 5
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40)
                System.out.printf("Employee %s Age%d\n", employees[i].initials, employees[i].age);
        }
    }
}

