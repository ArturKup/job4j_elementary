package ru.job4j.array;

import java.util.MissingFormatArgumentException;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Джон Леннон";
        names[1] = "Пол Маккартни";
        names[2] = "Джордж Харрисон";
        names[3] = "Ринго Старр";
        for (String s : names) {
            System.out.println(s);
        }
    }
}
