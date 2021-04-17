package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class EndWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndWith.endsWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndWith.endsWith(word, post);
        Assert.assertFalse(result);
    }
}