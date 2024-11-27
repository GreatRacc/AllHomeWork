package HomeWork_13;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TaskTwo {
    public static void main(String[] args) {
        String text = "!!! Java is Fun and java IS powerful !!!";
        System.out.println("Количество вхождений каждого слова: " + countWord(text));
    }

    public static Map<String, Integer> countWord(String str) {
        str = str.replaceAll("[^a-zA-Zа-яА-Я\\d\\s]", "").toLowerCase();
        String[] words = str.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        return new TreeMap<>(wordCount);
    }
}
