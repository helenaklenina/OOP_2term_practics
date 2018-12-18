package ru.mirea.prac.klenina.prac3;

public final class Circle extends Shape{

    protected double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {

        System.out.println("Shape: circle, radius: "+this.radius+", color: "+this.color);
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }
}
