package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5Numbers() {
        int[] data = new int[]{61, 63, 65, 62, 64};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{61, 62, 63, 64, 65};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3Numbers() {
        int[] data = new int[]{22, 24, 23};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{22, 23, 24};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort10Numbers() {
        int[] data = new int[]{33, 42, 35, 41, 40, 38, 39, 34, 36, 37};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{33, 34, 35, 36, 37, 38, 39, 40, 41, 42};
        Assert.assertArrayEquals(expected, result);
    }
}
