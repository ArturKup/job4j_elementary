package ru.job4j.condition;

public class TrgArea {
    public static void main(String[] args) {
        double rsl = area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }

    private static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        rsl = Math.round(rsl * 100.0) / 100.0;
        return rsl;
    }
}