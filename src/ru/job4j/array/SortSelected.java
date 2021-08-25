package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = data[i];
            int index = i;

            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[j];
                    index = j;

                }
            }
            if (i != index) {
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
            }
        }
        return data;
    }
}