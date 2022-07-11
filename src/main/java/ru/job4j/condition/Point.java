package ru.job4j.condition;

public class Point {

    private  int x;
    private  int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point pt = new Point(0, 0);
        Point pt1 = new Point(2, 0);
        double result = pt.distance(pt1);
        Point pt2 = new Point(1, 1);
        Point pt3 = new Point(3, 1);
        double result1 = pt2.distance(pt3);
        Point pt4 = new Point(4, 4);
        Point pt5 = new Point(8, 8);
        double result2 = pt4.distance(pt5);
    }
}