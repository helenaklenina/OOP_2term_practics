package ru.mirea.lab.klenina.lab4;

public class Car implements Nameable {

    String mark;
    String model;

    public Car(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public String getName(){

        System.out.println(mark + " " + model);
        return model;
    }

}
