package HomeWork_17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainTaskFour {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "fig", "date", "kiwi", "grape");
        List<String> result = words.stream()
                .map(String::toUpperCase)
                .filter(word -> word.length() > 4)
                .sorted((o1, o2) -> Integer.compare(o1.length(), o2.length()))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}