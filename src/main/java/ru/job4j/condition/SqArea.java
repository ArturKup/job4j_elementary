package ru.job4j.condition;

public class SqArea {
    public static void main(String[] args) {
        double result1 = square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }

    private static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double rsl = h * l;
        return rsl;
    }
}