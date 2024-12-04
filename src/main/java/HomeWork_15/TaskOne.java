package HomeWork_15;

import java.util.HashSet;
import java.util.Set;

public class TaskOne {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 1, 4};
        Set<Integer> result = getUniqueElements(numbers);
        System.out.println(result);
    }

    /**
     * Метод, принимающий массив целых чисел и возвращающий список из уникальных чисел.
     *
     * @param number принимаемый массив чисел.
     * @return возвращает уникальные значения из принимаемого массива.
     */
    public static Set<Integer> getUniqueElements(int[] number) {
        Set<Integer> numbers = new HashSet<>();
        for (Integer i : number) {
            numbers.add(i);
        }
        return numbers;
    }
}
