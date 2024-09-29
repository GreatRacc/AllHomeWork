package HomeWork_4;

import java.util.Arrays;

public class HomeWork_22_09_2024 {
    public static void main(String[] args) {
        System.out.println("Решение первого задания:");
        task_1();
        System.out.println("Решение второго задания:");
        task_2();
        System.out.println("Решение третьего задания:");
        task_3();
        System.out.println("Решение четвертого задания:");
        task_4();
        System.out.println("Решение пятого задания:");
        task_5();


    }

    static void task_1() {
        int[] arrayInt = {10, 20, 30, 40, 50};
        int value = 0;
        int middleValue = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            value = value + arrayInt[i];
        }
        middleValue = value / arrayInt.length;
        System.out.println("Среднее значение: " + middleValue);
    }

    static void task_2() {
        double[] arrayDouble = {3.5, 5.2, -1.4, 7.8, 2.2};
        double max = arrayDouble[0];
        double min = arrayDouble[0];
        for (int i = 0; i < arrayDouble.length; i++) {

            if (arrayDouble[i] > max) {
                max = arrayDouble[i];
            }
            if (arrayDouble[i] < min) {
                min = arrayDouble[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }

    static void task_3() {
        char[] chars = {'a', 'B', 'i', 't', 'E', 'r'};
        int valueVowelLetter = 0;
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toLowerCase(chars[i]);
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' ||
                    chars[i] == 'e' ||
                    chars[i] == 'i' ||
                    chars[i] == 'o' ||
                    chars[i] == 'u') {
                valueVowelLetter++;
            }
        }
        System.out.println("Количество гласных: " + valueVowelLetter);
    }

    static void task_4() {
        String str = "Hello World This Is Java";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                charArray[i] = '_';
            }
        }
        System.out.println(charArray);
    }

    static void task_5() {
        String str1 = "apple,banana,grape,orange";
        String[] strArray = str1.split(",");
        System.out.println(Arrays.toString(strArray));
    }
}
