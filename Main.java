package prac6;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        for (int i = 0; i < 20; i++){
            students.add(new Student(i, (int)(Math.random() * 100)));
            System.out.println(students.get(i).toString());
        }

        Collections.sort(students, new SortingStudentsByGPA());

        for (int i = 0; i < 20; i++){
            System.out.println(students.get(i).toString());
        }
    }
}

