package prac6;
import java.util.*;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b){
        return a.getGpa() < b.getGpa() ? -1 : a.getGpa() == b.getGpa() ? 0 : 1;
    }
}
