package ru.mirea.prac.klenina.prac3;

public class MovablePoint implements Movable{

    int x,y;
    int xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {

       /* System.out.println("MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}');
        */
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public void moveUp(){
        y++;
    }
    public void moveDown(){
        y--;
    }
    public void moveLeft(){
        x--;
    }
    public void moveRight(){
        x++;
    }

}
