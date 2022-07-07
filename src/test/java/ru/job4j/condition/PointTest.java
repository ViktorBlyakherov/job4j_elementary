package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when100to100then0() {
        Point a = new Point(10, 0);
        Point b = new Point(10, 0);
        double expected = 0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus30to100then2() {
        Point a = new Point(-3, 0);
        Point b = new Point(10, 0);
        double expected = 13;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when45to1030then25dot7() {
        Point a = new Point(4, 5);
        Point b = new Point(10, 30);
        double expected = 25.70f;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}