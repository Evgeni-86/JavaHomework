package Examclouds.StudentAspirant;

public class Main {
    public static void main(String[] args) {
        showScholarship(getArr(20));
    }

    public static Enrollee[] getArr(int number) {
        Enrollee[] enrolleesArr = new Enrollee[number];
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                enrolleesArr[i] = new Student();
            } else {
                enrolleesArr[i] = new Aspirant();
            }
        }
        return enrolleesArr;
    }

    public static void showScholarship(Enrollee[] arr) {
        for (Enrollee elem : arr) {
            System.out.println(elem.getScholarship());
        }
    }
}
