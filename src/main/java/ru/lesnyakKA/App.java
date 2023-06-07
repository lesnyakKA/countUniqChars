package ru.lesnyakKA;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

class App {
    public static long countUniqChars(String text) {
        return text.chars().distinct().count();
    }
}