package HomeWork_5;

import java.util.Arrays;

public class Methods {
    static int square(String s) {
        int number = Integer.parseInt(s);
        return number * number;
    }

    static String printFullName(String name, String surname) {
        String fullName = name + " " + surname;
        return "Ваше имя и фамилия это - " + fullName;
    }

    static String cornerValuesArray(String words) {
        String[] array = words.split(",");
        String longestWord = array[0];
        String shortestWord = array[0];
        for (String check : array) {
            if (check.length() < shortestWord.length()) {
                shortestWord = check;
            }
            if (check.length() > longestWord.length()) {
                longestWord = check;
            }
        }
        String[] shrAndLng = new String[]{shortestWord, longestWord};
        return "Массив из самой короткой строки и самой длинной содержит: " + Arrays.toString(shrAndLng);
    }
}

