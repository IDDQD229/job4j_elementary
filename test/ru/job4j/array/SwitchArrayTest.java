package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to1() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {2, 1, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to9() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int source = 1;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 10, 3, 4, 5, 6, 7, 8, 9, 2};
        Assert.assertArrayEquals(expected, result);
    }
}
