package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;
public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int result = (Factorial.calc(5));
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForFZeroThenOne() {
        int result1 = (Factorial.calc(0));
        int expected1 = 1;
        Assert.assertEquals(expected1, result1);
    }
}