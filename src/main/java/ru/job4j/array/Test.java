package ru.job4j.array;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {3, 1, 6, 5, 2, 8, 4};
        removeElement(arr, 2);

    }

    public static void removeElement(int[] arr, int index) {
        int[] arrDestination = new int[arr.length - 1];
        int remainingElements = arr.length - (index + 1);
        System.arraycopy(arr, 0, arrDestination, 0, index);
        System.arraycopy(arr, index + 1, arrDestination, index, remainingElements);
        System.out.println("Elements -- " + Arrays.toString(arrDestination));
    }
}
