package ru.mirea.lab.klenina.lab4;

public class Animal implements Nameable {

    String name;
    int year;

    public Animal(String n, int y) {
        this.name = n;
        this.year = y;
    }

    @Override
    public String getName() {

        System.out.println(name + " " + year);
        return name;
    }
}
