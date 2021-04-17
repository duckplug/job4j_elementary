package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {3, 4, 1, 88, 1234};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4, 88, 1234};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortDouble1() {
        int[] data = new int[] {3, 4, 1, 88, 1234, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 1, 3, 4, 88, 1234};
        Assert.assertArrayEquals(expected, result);
    }
}