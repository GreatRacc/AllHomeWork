package HomeWork_4;

import java.util.Scanner;

public class HomeWork_21_09_2024 {
    private final static Scanner sc = new Scanner(System.in);

    public static String input() {
        return sc.nextLine().toLowerCase().replace(" ", "");
    }

    public static void main(String[] args) {
        System.out.println("Метод через реверс. Введите ваше слово:");
        bufferReverse(input());
        System.out.println("Метод через посимвольное сравнение. Введите ваше слово:");
        palindromeSymbols(input());

    }

    static void bufferReverse(String text) {
        boolean isPalindrome = text.equals(new StringBuilder(text).reverse().toString());
        System.out.println(isPalindrome ? text + " - это полиндром " : text + " - это не полиндром");
    }

    static void palindromeSymbols(String text) {
        boolean isPalindrome = true;
        for (int i = 0; i < (text.length() / 2); i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? text + " - это полиндром " : text + " - это не полиндром");
    }
}
