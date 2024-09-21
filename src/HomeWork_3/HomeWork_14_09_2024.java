package HomeWork_3;

import java.util.Scanner;

public class HomeWork_14_09_2024 {
    public static void main(String[] args) {
        task_1();
    }

    static void task_1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n:");
        StringBuilder sb = new StringBuilder();
        int numberN = sc.nextInt();
        for (int oddNum = 1; oddNum < numberN; oddNum++) {
            if (oddNum % 2 != 0) {
                sb.append(oddNum).append(" ");
            }
        }
        System.out.println("все нечётные числа от 1 до " + numberN + " это: " + sb);
    }

    static void task_2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число n:");
        int numberN = scan.nextInt();
        int factorial = 1;
        for (int i = 1; i <= numberN; i++) {
            factorial = factorial * i;
        }
        System.out.println("Факториал от числа " + numberN + " равен: " + factorial);
    }

    static void task_3() {
        System.out.println("Таблица умножения с 1 до 10:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "  *  " + j + "  =  " + i * j);
            }
            System.out.println("=====Разделение=====");
        }
    }
}