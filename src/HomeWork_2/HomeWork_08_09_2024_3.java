package HomeWork_2;

import java.util.Locale;
import java.util.Scanner;

public class HomeWork_08_09_2024_3 {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите номер вашего месяца. От 1 до 12.");
        season(inputProc());
    }

    public static String inputProc() {
        return sc.nextLine().toLowerCase(Locale.ROOT).replace(" ", "");
    }

    public static void season(String input) {
        int monthNumber = Integer.parseInt(input);
        switch (monthNumber) {
            case 1, 2, 12 -> printEnd(monthNumber, "зиме");
            case 3, 4, 5 -> printEnd(monthNumber, "весне");
            case 6, 7, 8 -> printEnd(monthNumber, "лету");
            case 9, 10, 11 -> printEnd(monthNumber, "осени");
            default -> System.out.println("Вы выбрали число не из списка, повторите попытку");
        }
    }

    public static void printEnd(int monthNumber, String season) {
        String[] month = new String[]{"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};

        System.out.println("Вы выбрали номер: " + monthNumber + "." + '\n' +
                "Этот месяц называется: " + month[monthNumber - 1] + "." + '\n' + "Данный месяц относится к " + season + ".");
    }
}
