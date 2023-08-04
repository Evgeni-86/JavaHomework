package Zaur;

class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    void doublingSalary() {
        salary *= 2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee person1 = new Employee(12,"Ivanov",25,150,"D1");
        Employee person2 = new Employee(20,"Petrov",22,120,"D2");
        person1.doublingSalary();
        person2.doublingSalary();
        System.out.println(person1.salary);
        System.out.println(person2.salary);
    }
}
