package HomeWork_13;

import java.util.HashMap;

public class TaskOne {
    public static void main(String[] args) {
        String text = "java is fun and java is powerful";
        HashMap<Character, Integer> charCounting = countingChar(text);
        System.out.println("Количество вхождений каждого символа: " + charCounting);
        System.out.println("Есть ли уникальные буквы? " + hasUniqueChar(charCounting));
        System.out.println("Среднее количество символов: " + averageAmount(charCounting));
    }

    public static HashMap<Character, Integer> countingChar(String str) {
        HashMap<Character, Integer> charCounting = new HashMap<>();
        for (char i : str.toCharArray()) {
            if (i != ' ') {
                charCounting.put(i, charCounting.getOrDefault(i, 0) + 1);
            }
        }
        return charCounting;
    }

    public static boolean hasUniqueChar(HashMap<Character, Integer> charCounting) {
        for (int i : charCounting.values()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public static double averageAmount(HashMap<Character, Integer> charCounting) {
        double totalChars = 0;
        int totalCount = 0;
        for (int i : charCounting.values()) {
            totalChars += i;
            totalCount++;
        }
        return totalCount == 0 ? 0 : totalChars / totalCount;
    }
}
