package ru.job4j.array;

public class Sandbox {
    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = -1; i < array.length ; i++) {
        array[i] = i + 3;

        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}