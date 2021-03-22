package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP2K3Square0187() {
        double expected = 0.187;
        int p = 2;
        int k = 3;
        double out = SqArea.square(p,  k);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenP2K2Square022() {
        double expected = 0.222;
        int p = 2;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenP1K9Square002() {
        double expected = 0.0247;
        int p = 1;
        int k = 8;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }
}