package streem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class mapToInt {
    public static void main(String[] args) {

        Student student1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student student2 = new Student("Nikolai", 'm', 28, 2, 6.4);
        Student student3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student student4 = new Student("Petr", 'm', 35, 4, 7);
        Student student5 = new Student("Mariya", 'f', 23, 3, 7.4);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        List<Integer> integerList = students.stream().mapToInt(elem -> elem.getCourse()).boxed().collect(Collectors.toList());

        //boxed() - boxing int to Integer

        System.out.println(integerList);
    }
}
