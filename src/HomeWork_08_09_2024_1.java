import java.util.Locale;
import java.util.Scanner;

public class HomeWork_08_09_2024_1 {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите возраст человека");
        AgeAndDestination(inputProcess());
    }

    public static String inputProcess() {
        return sc.nextLine().toLowerCase(Locale.ROOT).replace(" ", "");
    }

    public static void AgeAndDestination(String input) {
        int age = Integer.parseInt(input);
        if ((age >= 2) && (age <= 6)) {
            printEnd(age, "В сад");
        } else if ((age > 6) && (age <= 18)) {
            printEnd(age, "В школу");
        } else if ((age > 18) && (age < 24)) {
            printEnd(age, "В университет");
        } else if (age > 24) {
            printEnd(age, "на работу");
        } else if ((age >= 0) && (age <= 1)) {
            System.out.println("Ваш возраст меньше положенного");
        } else if (age == 24) {
            printEnd(age, "и подумать год");
        } else {
            System.out.println("Вы ввели отрицательное число, попробуйте снова.");
        }
    }

    public static void printEnd(int age, String destination) {
        System.out.println("Если возраст человека равен: " + age + "То ему следует идти: " + destination);
    }
}