package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class TriangleTest {

    @Test
            public void whenExist () {
            double ab = 2.0;
            double ac = 2.0;
            double bc = 2.0;
            boolean result = Triangle.exist(ab, ac, bc);
            Assert.assertTrue(result);
        }

    @Test
    public void whenExist0 () {
        double ab = 0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenExist1 () {
        double ab = 2.0;
        double ac = 0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenExist2 () {
        double ab = 0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenExist3 () {
        double ab = 0;
        double ac = 2.0;
        double bc = 0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenExist4 () {
        double ab = 0;
        double ac = 0;
        double bc = 0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }
}