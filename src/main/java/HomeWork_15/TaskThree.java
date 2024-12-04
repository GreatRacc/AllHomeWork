package HomeWork_15;

import java.util.Arrays;
import java.util.TreeSet;

public class TaskThree {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 35;
        int[] result = findClosestNumbers(numbers, target);
        System.out.println(Arrays.toString(result));
    }

    /**
     * Метод, принимающий массив чисел и число-цель,
     * возвращающий ближайшие меньший и больший элементы из массива относительно числа-цели.
     *
     * @param numbers принимаемый массив чисел.
     * @param target  принимаемая число-цель.
     * @return возвращает ближайшие меньший и больший элементы из массива относительно числа-цели.
     */
    public static int[] findClosestNumbers(int[] numbers, int target) {
        TreeSet<Integer> setNumbers = new TreeSet<>();
        for (int i : numbers) {
            setNumbers.add(i);
        }
        Integer min = setNumbers.lower(target);
        Integer max = setNumbers.higher(target);
        if (min == null || max == null) {
            return new int[]{};
        }
        return new int[]{min, max};
    }
}
