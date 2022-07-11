package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenX10Y10X22y20Then2() {
        double expected = 2;
        Point pt = new Point(0, 0);
        Point pt1 = new Point(2, 0);
        double result = pt.distance(pt1);
        double eps = 0.001;
        Assert.assertEquals(expected, result, eps);
    }

    @Test
    public void whenX11Y11X23y21Then2() {
        double expected = 2;
        Point pt2 = new Point(1, 1);
        Point pt3 = new Point(3, 1);
        double result = pt2.distance(pt3);
        double eps = 0.001;
        Assert.assertEquals(expected, result, eps);
    }

    @Test
    public void whenX14Y14X28y28Then5dot656() {
        double expected = 5.656;
        Point pt4 = new Point(4, 4);
        Point pt5 = new Point(8, 8);
        double result = pt4.distance(pt5);
        double eps = 0.001;
        Assert.assertEquals(expected, result, eps);
    }

    @Test
    public void whenX11Y11Z11X24Y24Z24Then5dot196() {
        double expected = 5.196;
        Point pt1 = new Point(1, 1, 1);
        Point pt2 = new Point(4, 4, 4);
        double result = pt1.distance3d(pt2);
        double eps = 0.001;
        Assert.assertEquals(expected, result, eps);
    }
}