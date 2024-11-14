package HomeWork_11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayAndLinked {
    private static final int numElements = 1000000;
    private static final int numAttempts = 100000;
    static Random random = new Random();

    public static void main(String[] args) {
        testList(new ArrayList<>(), "ArrayList");
        testList(new LinkedList<>(), "LinkedList");
    }

    public static void testList(List<Integer> list, String typeList) {
        long startTime = System.currentTimeMillis();
        fill(list);
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Время заполнения списка типа " + typeList + ": " + elapsedTime);
        startTime = System.currentTimeMillis();
        RandomSelect(list);
        elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Время затраченное на выбор элементов" +
                "из списка типа " + typeList + ": " + elapsedTime);
    }

    private static void fill(List<Integer> list) {
        for (int i = 0; i < numElements; i++) {
            list.add(i);
        }
    }

    private static void RandomSelect(List<Integer> list) {
        for (int i = 0; i < numAttempts; i++) {
            list.get(random.nextInt(numElements));
        }
    }
}
