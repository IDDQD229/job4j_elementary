package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int sum = 1;
        for (int index = 1; index <= n; index++) {
                sum *= index;
            }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calc(5));
        System.out.println(calc(0));
    }
}
