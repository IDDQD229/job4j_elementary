package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + sum(first, second);
    }

    public static double all1(double first, double second) {
        return sub(first, second)
                + div(first, second);
    }

    public static double all2(double first, double second) {
        return sum(first, second)
                + sub(first, second)
                + div(first, second)
                + mul(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + all1(10, 20));
        System.out.println("Результат расчета равен: " + all2(10, 20));
    }
}
