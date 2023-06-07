package ru.lesnyakKA;

class App {
    public static long countUniqChars(String text) {
        return text.chars().distinct().count();
    }
}