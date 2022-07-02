package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        percent = percent / 100;
        amount = amount + amount * percent;
        while (amount - salary > 0) {
            amount -= salary;
            amount = amount + amount * percent;
            year++;
        }
        return year;
    }
}
