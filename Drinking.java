package ru.mirea.lab.klenina.lab3;

public class Drinking extends Dishes {

    private String type;

    public Drinking(String material, String name, String type) {

        super (material, name);
        this.type = type;
    }

    @Override
    public void info() {

        System.out.println(" Материал: " + getMaterial() + ", Название прибора: " + getName() + ", Тип: " + type);
    }
}
