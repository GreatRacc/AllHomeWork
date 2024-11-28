package HomeWork_14;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainForImmuntable {
    public static void main(String[] args) {
        CustomMutableClass customMutableClass1 = new CustomMutableClass(123);
        CustomMutableClass customMutableClass2 = new CustomMutableClass(321);
        ImmutableClass immutableClass1 = new ImmutableClass("Привет", List.of(1, 2, 3, 4, 5, 6), customMutableClass1);
        ImmutableClass immutableClass2 = new ImmutableClass("Джава", List.of(1, 2, 3), customMutableClass2);
        customMutableClass1.setValue(676);
        customMutableClass2.setValue(1111);
        System.out.println(immutableClass1.getName());
        System.out.println(immutableClass1.getNumbers());
        System.out.println(immutableClass1.getCustomMutableClass().getValue());
        System.out.println(immutableClass2.getCustomMutableClass().getValue());
        Map<ImmutableClass, String> map = new HashMap<>();
        map.put(immutableClass1, "Я ключ номер 1");
        map.put(immutableClass2, "Я ключ номер 2");
        System.out.println(map.get(immutableClass1));
        System.out.println(map.get(immutableClass2));
    }
}