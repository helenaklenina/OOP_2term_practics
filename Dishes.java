package ru.mirea.lab.klenina.lab3;

public abstract class Dishes {

    private  String material;
    private  String name;

    public Dishes(String material, String name) {
        this.material = material;
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void info();

}
