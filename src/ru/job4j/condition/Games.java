package ru.job4j.condition;

public class Games {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("Я могу пойти в игрвой клуб.");
        } else {
            System.out.println("Я не могу.");
        }
    }

    public static void main(String[] args) {
        Games.permission(true, true);
    }
}