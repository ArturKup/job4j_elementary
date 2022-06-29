package ru.job4j.calculator;

public class Fit {
    public static void main(String[] args) {
        short height = 187;
        double man = manWeight(height);
        System.out.println("Man 187 is " + man);
        double woman = womanWeight(187);
        System.out.println("Woman 187 is " + woman);
    }

    private static double womanWeight(int height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    private static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }
}
