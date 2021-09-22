package ru.job4j.array;

public class Cross {
    public static void printCrossEl(int[] left, int[] right) {
        for (int k : left) {
            for (int j = 0; j < right.length; j++) {
                if (k == right[j]) {
                    System.out.println(j);
                }
            }
        }
    }
}