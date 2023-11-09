package javaRash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private final String[] students = new String[30];

    public void addStudent(String student) {
        int i = 0;
        for (; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
        }
        students[i] = student;
    }

    public static void main(String[] args) {
        String[] array = {"A", null, null, "C", null, "D", null};

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (i == index) {
                    index++;
                    continue;
                }
                String temp = array[i];
                array[i] = array[index];
                array[index++] = temp;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
