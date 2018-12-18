package ru.mirea.prac.klenina.prac3;

public class Rectangle extends Shape{

    protected double width;
    protected double length;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {

        System.out.println("Rectangle{" + "width=" + width + ", length="
                + length + ", color='" + color + '\'' + ", filled=" + filled);
        return "Rectangle{" + "width=" + width + ", length=" + length + ", color='"
                + color + '\'' + ", filled=" + filled + '}';
    }
}
