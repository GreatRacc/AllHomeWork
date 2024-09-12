import java.util.Scanner;

public class HomeWork_07_09_24_var_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Грязная ли у вас голова и тело? Напишите что-то из предложенного: Да/Нет.");
            String firstBranch = sc.nextLine().toLowerCase().trim();
            switch (firstBranch) {
                case "да" -> {
                    System.out.println("Вы идёте мыться.");
                    System.out.println("У вас Душ или ванная? Напишите что-то из предложенного: Душ/Ванная.");
                    String secondBranch = sc.nextLine().toLowerCase().trim();
                    switch (secondBranch) {
                        case "душ" -> System.out.println("Вы заходите в душ.");
                        case "ванная" -> System.out.println("Вы заходите в ванную.");
                        default -> {
                            System.out.println("Вы выбрали что-то не из предложенного, начнем всё с самого начала.");
                            continue;
                        }
                    }
                    System.out.println("Работает ли у вас горячая вода? Напишите что-то из предложенного: Да/Нет.");
                    String thirdBranch = sc.nextLine().toLowerCase().trim();
                    switch (thirdBranch) {
                        case "да" -> System.out.println("Вы настраиваете тёплую воду.");
                        case "нет" -> System.out.println("Вы включаете холодную воду.");
                        default -> {
                            System.out.println("Вы выбрали что-то не из предложенного, начнем всё с самого начала.");
                            continue;
                        }
                    }
                    System.out.println("Вы споласкиваете свою голову.");
                    System.out.println("Есть ли у вас шампунь? Напишите что-то из предложенного: Да/Нет.");
                    String fourthBranch = sc.nextLine().toLowerCase().trim();
                    switch (fourthBranch) {
                        case "да" -> System.out.println("Вы мылите голову шампунем.");
                        case "нет" -> {
                            System.out.println("Есть ли у вас мыло или гель для душа? Напишите что-то из предложенного: Мыло/Гель.");
                            String fourthOneBranch = sc.nextLine().toLowerCase().trim();
                            switch (fourthOneBranch) {
                                case "мыло" -> System.out.println("Вы мылите голову мылом.");
                                case "гель" -> System.out.println("Вы мылите голову гелем для душа.");
                                default -> {
                                    System.out.println("Вы выбрали что-то не из предложенного, начнем всё с самого начала.");
                                    continue;
                                }
                            }
                        }
                        default -> {
                            System.out.println("Вы выбрали что-то не из предложенного, начнем всё с самого начала.");
                            continue;
                        }
                    }
                    System.out.println("Вы споласкиваете голову водой.");
                    System.out.println("Есть ли у вас тёрка? Напишите что-то из предложенного: Да/Нет.");
                    String fifthBranch = sc.nextLine().toLowerCase().trim();
                    switch (fifthBranch) {
                        case "да" -> {
                            System.out.println("Вы споласкиваете тёрку водой.");
                            System.out.println("Есть ли у вас мыло или гель для душа? Напишите что-то из предложенного: Мыло/Гель.");
                            String fifthOneBranch = sc.nextLine().toLowerCase().trim();
                            switch (fifthOneBranch) {
                                case "мыло" -> System.out.println("Вы мылите тёрку мылом.");
                                case "гель" -> System.out.println("Вы мылите тёрку гелем для душа.");
                                default -> {
                                    System.out.println("Вы выбрали что-то не из предложенного, начнем всё с самого начала.");
                                    continue;
                                }
                            }
                            System.out.println("Вы трёте тело намыленной тёркой.");
                        }
                        case "нет" -> {
                            System.out.println("Вы споласкиваете тело водой.");
                            System.out.println("Есть ли у вас мыло или гель для душа? Напишите что-то из предложенного: Мыло/Гель.");
                            String fifthTwoBranch = sc.nextLine().toLowerCase().trim();
                            switch (fifthTwoBranch) {
                                case "мыло" -> System.out.println("Вы мылите тело мылом.");
                                case "гель" -> System.out.println("Вы мылите тело гелем для душа.");
                                default -> {
                                    System.out.println("Вы выбрали что-то не из предложенного, начнем всё с самого начала.");
                                    continue;
                                }
                            }
                            System.out.println("Вы споласкиваете тело водой.");
                        }
                        default -> {
                            System.out.println("Вы выбрали что-то не из предложенного, перезапустите программу.");
                            continue;
                        }
                    }
                    System.out.println("Чистое ли ваше тело? Напишите что-то из предложенного: Да/Нет.");
                    String sixthBranch = sc.nextLine().toLowerCase().trim();
                    switch (sixthBranch) {
                        case "да":
                            System.out.println("Поздравляю, вы теперь чистый человек!");
                            System.exit(0);
                        case "нет":
                            System.out.println("Это плохо! Начнем процедуру заново.");
                        default:
                            System.out.println("Вы выбрали что-то не из предложенного, начнем всё с самого начала.");
                    }
                }
                case "нет" -> {
                    System.out.println("Поздравляю, вы чистый человек, вернитесь сюда когда станете грязным человеком.");
                    System.exit(0);
                }
                default -> System.out.println("Вы выбрали что-то не из предложенного, начнем всё с самого начала.");
            }
        }
    }
}