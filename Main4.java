package ru.mirea.lab.klenina.lab4;

import ru.mirea.lab.klenina.lab4.Animal;
import ru.mirea.lab.klenina.lab4.Car;
import ru.mirea.lab.klenina.lab4.Nameable;

import  java.lang.*;
import java.util.*;

public class Main4 {

    //     ANIMAL&CAR
    public static void main(String[] args) {
        Animal a1 = new Animal("Rex", 3);
        Car c1 = new Car("bmw", "x5");
        Nameable a2 = new Animal("Comargo", 2);
        Nameable c2 = new Car("chevralet", "comaro");

        a1.getName();
        c1.getName();
        a2.getName();
        c2.getName();
    }

}
