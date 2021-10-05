package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void when3NumbersThenThirdNumber() {
        int first = 4;
        int second = 11;
        int third = 12;
        int result = Max.max(first, second, third);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when4NumbersThenFirstNumber() {
        int first = 33;
        int second = 21;
        int third = 5;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 33;
        Assert.assertEquals(result, expected);
    }
}