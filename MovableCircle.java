package ru.mirea.prac.klenina.prac3;

public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {

        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        /*System.out.println("MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}');
                */
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public void moveUp(){
        center.moveUp();
    }
    public void moveDown(){
        center.moveDown();
    }
    public void moveLeft(){
        center.moveLeft();
    }
    public void moveRight(){
        center.moveRight();
    }


}