package HomeWork_5;

import java.util.Arrays;

public class Methods {
    /**
     * Метод для вычисления квадрата из принимаемого числа из другого класса.
     *
     * @param s принимает в себя значение переменной типа String из другого класса.
     * @return возвращает результат вычисления квадрата из принимаемого числа.
     */

    static int square(String s) {
        int number = Integer.parseInt(s);
        return number * number;
    }

    /**
     * Метод для возвращения новой переменной типа String из двух других переменных.
     *
     * @param name    принимает в себя значение переменной типа String из другого класса.
     * @param surname принимает в себя значение переменной типа String из другого класса.
     * @return возвращает новую переменную типа String, состоящую из переменных "name" и "surname".
     */
    static String printFullName(String name, String surname) {
        return name + " " + surname;
    }

    /**
     * Метод для вычисления самой длинной и самой короткой строки из принимаемого значения массива типа String.
     *
     * @param words принимает в себя значение массива типа String из другого класса.
     * @return возвращает новый массив, состоящий из самой длинной и самой короткой строки.
     */
    static String cornerValuesArray(String... words) {
        if (words == null || words.length == 0) {
            System.out.println("Вы ввели пустой массив");
            return Arrays.toString(words);
        }
        String longestWord = words[0];
        String shortestWord = words[0];
        for (String check : words) {
            if (check.length() < shortestWord.length()) {
                shortestWord = check;
            }
            if (check.length() > longestWord.length()) {
                longestWord = check;
            }
        }
        String[] shrAndLng = new String[]{shortestWord, longestWord};
        return Arrays.toString(shrAndLng);
    }

    /**
     * Метод для вычисления самого большого числа и самого малого числа из принимаемого значения массива типа int.
     *
     * @param numbers принимает в себя значение массива типа int из другого класса.
     * @return возвращает новый массив, состоящий из самого большого числа и самого малого числа.
     */
    static String cornerValuesArray(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("Вы ввели пустой массив");
            return Arrays.toString(numbers);
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int i : numbers) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        int[] result = new int[]{min, max};
        return Arrays.toString(result);
    }

    /**
     * Метод для вычисления самого большого символа и самого малого символа (по коду из unicode) из принимаемого значения массива типа char.
     *
     * @param charInput принимает в себя значение массива типа char из другого класса.
     * @return возвращает новый массив, состоящий из самого большого символа и самого малого символа.
     */
    static char[] cornerValuesArray(char... charInput) {
        if (charInput == null || charInput.length == 0) {
            System.out.println("Вы ввели пустой массив");
            return charInput;
        }
        char max = charInput[0];
        char min = charInput[0];
        for (char i : charInput) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return new char[]{min, max};
    }

    /**
     * Метод вычисления факториала от числа.
     *
     * @param number принимает в себя значение переменной типа int из другого класса.
     * @return возвращает либо факториал числа, либо вернет единицу, в случае если принимаемое число было равно 0.
     */
    static int factorialNum(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorialNum(number - 1);
    }
}

