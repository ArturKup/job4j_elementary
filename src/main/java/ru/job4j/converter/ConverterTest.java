package ru.job4j.converter;

public class ConverterTest {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float in1 = 120;
        float out1 = rubleToDollar(in1);
        boolean passed1 = expected == out;
        System.out.println("120 rubles are 2. Test result : " + passed);
    }
}
