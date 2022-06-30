package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenX10Y10X22y20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double result = Point.distance(x1, y1, x2, y2);
        double eps = 0.001;
        Assert.assertEquals(expected, result, eps);
    }

    @Test
    public void whenX11Y11X23y21Then2() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 1;
        double expected = 2;
        double result = Point.distance(x1, y1, x2, y2);
        double eps = 0.001;
        Assert.assertEquals(expected, result, eps);
    }

    @Test
    public void whenX14Y14X28y28Then5dot656() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 8;
        int y2 = 8;
        double expected = 5.656;
        double result = Point.distance(x1, y1, x2, y2);
        double eps = 0.001;
        Assert.assertEquals(expected, result, eps);
    }
}