package ru.mirea.lab.klenina.lab3;

public class Eating extends Dishes {

    public String size;

    public Eating(String material, String name, String size) {

        super(material, name);
        this.size = size;
    }

    @Override
    public void info() {

        System.out.println(" Материал: " + getMaterial() + ", Название прибора: " + getName() + ", Размер: " + size);

    }
}
