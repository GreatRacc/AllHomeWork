package HomeWork_3;

import java.util.Scanner;

public class HomeWork_15_09_2024 {
    public static void main(String[] args) {
        task_1();
    }

    static void task_1() {
        String text = "FGjk6h384df32g96D7T456Th123";
        int lettersCount = 0, numberCount = 0, numberCount0_4 = 0,
                numberCount5_9 = 0, upperCaseCount = 0, lowerCaseCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char s = text.charAt(i);
            if (Character.isLetter(s)) {
                lettersCount++;
            }
            if (Character.isDigit(s)) {
                numberCount++;
            }
            if (s >= '0' && s <= '4') {
                numberCount0_4++;
            }
            if (s >= '5' && s <= '9') {
                numberCount5_9++;
            }
            if (Character.isUpperCase(s)) {
                upperCaseCount++;
            }
            if (Character.isLowerCase(s)) {
                lowerCaseCount++;
            }
        }
        System.out.println(numberCount + " - Чисел. " + lettersCount + " - Букв.");
        System.out.println(numberCount0_4 + " числа из диапазана: от 0 до 4");
        System.out.println(numberCount5_9 + " числа из диапазана: от 5 до 9");
        System.out.println(upperCaseCount + " - Заглавных букв. " + lowerCaseCount + " - Малых букв.");
    }

    static void task_2() {
        String text = "I like Java!!!";
        System.out.println("Последний символ строки = " + text.charAt(text.length() - 1));
        System.out.println("Данная строка заканчивается подстрокой “!!!”? - " + text.endsWith("!!!"));
        System.out.println("Данная строка заканчивается подстрокой “!!!”? - " + text.startsWith("I like"));
        System.out.println("Данная строка заканчивается подстрокой “!!!”? - " + text.contains("Java"));
        System.out.println("позиция подстроки “Java” = " + text.indexOf("Java"));
        System.out.println("Замена всех символов “а” на “о” = " + text.replace('a', 'o'));
        System.out.println("Преобразование строки к верхнему регистру. = " + text.toUpperCase());
        System.out.println("Преобразование строки к верхнему регистру. = " + text.toLowerCase());

    }

    static void task_3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше слово чётной длины:");
        String text = scan.nextLine();
        System.out.println("Возврат два средних знака в строке " + text + ". Это: "
                + text.substring(text.length() / 2 - 1, text.length() / 2 + 1));
    }
}