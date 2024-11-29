package HomeWork_15;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class TaskTwo {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "cherry", "banana"};
        LinkedHashSet<String> result = getOrderedUniqueElements(words);
        System.out.println(result);
    }

    public static LinkedHashSet<String> getOrderedUniqueElements(String[] words) {
        return new LinkedHashSet<>(Arrays.asList(words));
    }
}
