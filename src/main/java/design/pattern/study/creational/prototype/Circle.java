package design.pattern.study.creational.prototype;

public class Circle extends Shape{

    private int x;
    private int y;
    private int r;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    /**
     * 객체 복제
     * 
     * 외부에서 호출 가능한 형태로 구현하는게 포인트
     */
    public Circle copy() throws CloneNotSupportedException {
        Circle circle = (Circle) clone();
        circle.x = x + 1;
        circle.y = y + 1;
        return circle;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}/////
