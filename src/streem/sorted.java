package streem;

import java.util.*;
import java.util.stream.Collectors;

public class sorted {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 7, 1, 4, 6, 5, 8};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

        Student2 student1 = new Student2("Ivan", 'm', 22, 3, 8.3);
        Student2 student2 = new Student2("Nikolai", 'm', 28, 2, 6.4);
        Student2 student3 = new Student2("Elena", 'f', 19, 1, 8.9);
        Student2 student4 = new Student2("Petr", 'm', 35, 4, 7);
        Student2 student5 = new Student2("Mariya", 'f', 23, 3, 7.4);

        List<Student2> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

//        Collections.sort(students, new Comparator<Student2>() {
//            @Override
//            public int compare(Student2 o1, Student2 o2) {
//                if (o1.getAvgGrade() > o2.getAvgGrade()){
//                    return -1;
//                } else if (o1.getAvgGrade() == o2.getAvgGrade()) {
//                    return 0;
//                }
//                return 1;
//            }
//        });
//        System.out.println(students);


        List<Student2> studentSort = students.stream().sorted((el1, el2) ->
                el1.getAge() - el2.getAge()).collect(Collectors.toList());
        System.out.println(studentSort);

    }
}

class Student2 {

    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student2(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}

