package HomeWork_5;

import java.util.Scanner;

public class mainClass {
    private final static Scanner sc = new Scanner(System.in);

    public static String input() {
        return sc.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("Введите целочисленное число для возведение его в квадрат:");
        System.out.println("Квадрат от числа равен: " + Methods.square(input()));
        System.out.println("Введите ваше имя, а потом фамилию: ");
        System.out.println(Methods.printFullName(input(), input()));
        System.out.println("Самая длинная и коротка строка это: ");
        System.out.println(Methods.cornerValuesArray("раз", "два", "три", "четыре", "пять"));
        System.out.println(Methods.cornerValuesArray(new String[]{}));
        System.out.println("Самое малое и большое число это: ");
        System.out.println(Methods.cornerValuesArray(10, -45, 76, 34, 12, -12));
        System.out.println(Methods.cornerValuesArray(new int[]{}));
        System.out.println("Самый малый и большой символ это: ");
        System.out.println(Methods.cornerValuesArray('H', 'a', 'g', 'D', 'v', 'c'));
        System.out.println(Methods.cornerValuesArray(new char[]{}));
        System.out.println("факториал от вашего числа равен: ");
        System.out.println(Methods.factorialNum(0));
        System.out.println(Methods.factorialNum(10));
    }
}