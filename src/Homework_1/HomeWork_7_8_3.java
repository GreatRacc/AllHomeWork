package Homework_1;

public class HomeWork_7_8_3 { // Задание 3.
    public static void main(String[] args) {
        long l = 9_999_999_999L; // Данное число явно больше чем 2_147_483_647
        int i = (int) l;
        System.out.println(l + " - Это переменная типа long.");
        System.out.println(i + " - Это переменная типа int с которой произошло переполнение.");
    }
}