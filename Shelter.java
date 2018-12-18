package ru.mirea.prac.klenina.prac1;

import ru.mirea.prac.klenina.prac1.Dog;

import java.lang.*;

public class Shelter {

    public static void main(String[] args) {
        Dog d1 = new Dog("Bull", 4);
        Dog d2 = new Dog("Shiny");

        d2.setAge(5);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();

    }
}
