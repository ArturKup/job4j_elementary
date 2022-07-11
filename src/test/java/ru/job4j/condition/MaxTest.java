package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int expected = 2;
        Max max = new Max();
        int result = max.max(first, second);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To6Then6() {
        int first = 1;
        int second = 2;
        int third = 6;
        int expected = 6;
        Max max = new Max();
        int result = max.maxForThreeNumbers(first, second, third);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To2To6Then2() {
        int first = 10;
        int second = 2;
        int third = 6;
        int fourth = 8;
        int expected = 10;
        Max max = new Max();
        int result = max.maxForFourNumbers(first, second, third, fourth);
        Assert.assertEquals(result, expected);
    }
}