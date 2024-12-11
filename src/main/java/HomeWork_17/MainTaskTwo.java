package HomeWork_17;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainTaskTwo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Андрей", "Наталья", "Михаил", "Александр", "Алексей");
        Collections.sort(names, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return -1;
            }
        });
        System.out.println(names);
        names = Arrays.asList("Андрей", "Наталья", "Михаил", "Александр", "Алексей");
        names.sort((o1, o2) -> -1);
        System.out.println(names);
    }
}
