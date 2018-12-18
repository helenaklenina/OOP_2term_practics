package ru.mirea.lab.klenina.lab2;

//laba 2 понятие классов

import java.lang.System;

public class Human {

    private String sex;
    private  String name;

    public Human(String s, String n) {
        sex = s;
        name = n;
    }

    public Human() {

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void  Man(){
        System.out.println("This is a " +sex+ " hows name is " +name+ " ");
    }
}
