package io.hexlet;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

class App {
    public static int countUniqChars(String text) {
        char[] chars = text.toCharArray();
        char[] result = new char[chars.length];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (ArrayUtils.contains(chars, chars[i]) &&
                    !ArrayUtils.contains(result, chars[i])) {
                result[index] = chars[i];
                index++;
            }
        }
        return index;
    }
}