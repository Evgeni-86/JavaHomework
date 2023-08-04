package Zaur;
//Вопрос про инкапсуляцию. правильно ли я понимаю.

class Student {
    private int studentBilet;
    private String name;
    private String surname;
    private int year;
    private double gradeMath;
    private double gradeEconomic;
    private double gradeForeign;

    Student (int studentBilet, String name, String surname, int year,
             double gradeMath, double gradeEconomic, double gradeForeign) {
        this.studentBilet = studentBilet;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.gradeMath = gradeMath;
        this.gradeEconomic = gradeEconomic;
        this.gradeForeign = gradeForeign;
    }

    double getAverageRating () { //default доступ в пакете
        return (gradeMath + gradeEconomic + gradeForeign) / 3;
    }

    static void getAverageRating2 (Student obj) { //default доступ в пакете
        System.out.println( (obj.gradeMath + obj.gradeEconomic + obj.gradeForeign) / 3 );
    }
}

public class StudentTest {



    public static void main(String[] args) {
        Student student1 = new Student(45, "Ivan", "Ivanov",
                2015, 3, 4, 5);
        Student student2 = new Student(98, "Petr", "Petrov",
                2017, 4, 4, 3);

        Student.getAverageRating2(student1);//метод класса (через static)

    }
}