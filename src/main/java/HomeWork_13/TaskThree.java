package HomeWork_13;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TaskThree {
    public static void main(String[] args) {
        Map<Integer, String> oneMap = new LinkedHashMap<>();
        oneMap.put(1, "C");
        oneMap.put(2, "B");
        oneMap.put(3, "A");
        Map<String, Integer> invertMap = invertMap(oneMap);
        System.out.println("Исходная мапа: " + oneMap);
        System.out.println("Инвертированная мапа: " + invertMap);
    }

    public static Map<String, Integer> invertMap(Map<Integer, String> originalMap) {
        Map<String, Integer> invertMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : originalMap.entrySet()) {
            invertMap.put(entry.getValue(), entry.getKey());
        }
        return invertMap;
    }
}
