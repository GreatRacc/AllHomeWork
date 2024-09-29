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
        System.out.println("Введите слова через запятую: ");
        System.out.println(Methods.cornerValuesArray(input()));
    }
}
