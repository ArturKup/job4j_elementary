package ru.job4j.condition;

public class Max {
    public int max(int first, int second) {
        return first >= second ? first : second;
    }

    public int maxForThreeNumbers(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public int maxForFourNumbers(int first, int second, int third, int fourth) {
        return max(fourth, max(first, max(second, third)));
    }

    public static void main(String[] args) {

    }
}
