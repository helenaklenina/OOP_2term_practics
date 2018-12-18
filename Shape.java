package ru.mirea.prac.klenina.prac3;

public abstract class Shape {

    protected String color;
    protected boolean filled;

    public  Shape(){ }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        System.out.println("Shape{" + "color='" + color + '\'' + ", filled=" + filled + '}');
        return "Shape{" + "color='" + color + '\'' + ", filled=" + filled + '}';
    }

    abstract double getArea();
    abstract double getPerimeter();
}
