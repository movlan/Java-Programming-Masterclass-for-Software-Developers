package com.company;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distance(int a, int b) {
        return Math.sqrt((a-this.x) * (b-this.x) + (a-this.y) * (b-this.y));
    }

    public double distance(Point point) {
        return Math.sqrt((point.getX()-this.x) * (point.getX()-this.x) + (point.getY()-this.y) * (point.getY()-this.y));
    }

    public Point() {
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
}
