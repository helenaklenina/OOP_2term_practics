package ru.mirea.lab.klenina.lab2;

import ru.mirea.lab.klenina.lab2.Hand;
import ru.mirea.lab.klenina.lab2.Head;
import ru.mirea.lab.klenina.lab2.Leg;
import ru.mirea.lab.klenina.lab2.Human;

import java.lang.*;

public class Main2 {

    public static void main(String[] args) {
        //     HUMAN
        Human h1 = new Human("female", "Ann");
        Human h2 = new Human("male", "Boby");
        Human h3 = new Human("female", "Karen");
        Human h4 = new Human();
        h4.setName("Jhon");
        h4.setSex("male");
        System.out.println(h1);
        System.out.println(h2);
        h3.Man();
        h4.Man();

    }

}