package ru.mirea.lab.klenina.lab3;

public class Main3 {
    public static void main(String[] args) {

        Drinking glass = new Drinking("Стекло", "Бокал", "Винный");
        Eating plate = new Eating("Керамика", "Тарелка", "Мвленькая");

        glass.info();
        plate.info();
    }
}
