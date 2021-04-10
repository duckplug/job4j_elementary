package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenarrayHasnt8thenmin1() {
        int[] data = {10, 3, 11, 55, 99, 12, 456, 111};
        int el = 8;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
    }

    @Test
    public void whenarrayHas7then5() {
        int[] data = {10, 3, 11, 55, 7, 99, 12, 456, 111};
        int el = 8;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
    }
}
