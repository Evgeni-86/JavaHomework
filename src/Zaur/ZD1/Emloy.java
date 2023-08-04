package Zaur.ZD1;

class Employ {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    Employ(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    private Employ(String department, String surname) {
        this.department = department;
    }
    public Employ(String surname) {
        this.surname = surname;
    }


    void doublingSalary() {
        salary *= 2;
    }

    public int getId() {
        return this.id;
    }
    public double getSalary() {
        return salary;
    }
    public String getSurname() {
        return this.surname;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employ person1 = new Employ(12,"Ivanov",25,150,"D1");
        Employ person2 = new Employ(20,"Petrov",22,120,"D2");
        person1.doublingSalary();
        person2.doublingSalary();

    }
}

