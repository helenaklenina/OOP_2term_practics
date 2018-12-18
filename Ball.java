package ru.mirea.prac.klenina.prac2;

public class Ball {

    private double x = 0.0, y = 0.0;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() { }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setXYSpeed(){

    }

    public void move(double dispX, double dispY) {
        x += dispX;
        y += dispY;
    }

    @Override
    public String toString() {
        System.out.println("Ball{" + "x=" + x + ", y=" + y + '}');
        return "Ball{" + "x=" + x + ", y=" + y + '}';
    }
}
