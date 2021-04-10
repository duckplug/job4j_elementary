package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 4;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4, 9};
        Assert.assertArrayEquals(expected, result);
    }
}

