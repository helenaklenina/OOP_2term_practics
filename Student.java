package prac6;
import java.lang.*;

public class Student {
    private int gpa;
    private int id;

    @Override
    public String toString() {
        return "{" +
                " gpa='" + getGpa() + "'" +
                ", id='" + getId() + "'" +
                "}";
    }

    public int getGpa() {
        return this.gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    Student(int id, int gpa){
        this.id = id;
        this.gpa = gpa;
    }
}
