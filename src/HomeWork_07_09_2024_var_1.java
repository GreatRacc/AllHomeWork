import java.util.Scanner;

public class HomeWork_07_09_2024_var_1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Грязная ли у вас голова и тело? Напишите что-то из предложенного: Да/Нет.");
                String firstBranch = sc.nextLine().toLowerCase().trim();
                if (firstBranch.equals("да")) {
                    System.out.println("Вы идёте мыться.");
                    System.out.println("У вас Душ или ванная? Напишите что-то из предложенного: Душ/Ванная.");
                    String secondBranch = sc.nextLine().toLowerCase().trim();
                    if (secondBranch.equals("душ")) {
                        System.out.println("Вы заходите в душ.");
                    } else if (secondBranch.equals("ванная")) {
                        System.out.println("Вы заходите в ванную.");
                    } else {
                        System.out.println("Вы выбрали что-то не из предложенного, начнем всё с самого начала.");
                    }
                    System.out.println("Работает ли у вас горячая вода? Напишите что-то из предложенного: Да/Нет");
                    String thirdBranch = sc.nextLine().toLowerCase().trim();
                    if (thirdBranch.equals("да")) {
                        System.out.println("Вы настраиваете тёплую воду.");
                    } else if (thirdBranch.equals("нет")) {
                        System.out.println("Вы включаете холодную воду.");
                    } else {
                        System.out.println("Вы выбрали что-то не из предложенного, начнем всё с самого начала.");
                    }
                    System.out.println("Вы споласкиваете свою голову.");
                    System.out.println("Есть ли у вас шампунь? Напишите что-то из предложенного: Да/Нет.");
                    String fourthBranch = sc.nextLine().toLowerCase().trim();
                    if (fourthBranch.equals("да")) {
                        System.out.println("Вы мылите голову шампунем.");
                    } else if (fourthBranch.equals("нет")) {
                        System.out.println("Есть ли у вас мыло или гель для душа? Напишите что-то из предложенного: Мыло/Гель.");
                        String fourthBranchOne = sc.nextLine().toLowerCase().trim();
                        if (fourthBranchOne.equals("мыло")) {
                            System.out.println("Вы мылите голову мылом.");
                        } else if (fourthBranchOne.equals("гель")) {
                            System.out.println("Вы мылите голову гелем для душа.");
                        } else {
                            System.out.println("Вы выбрали что-то не из предложенного, начнем всё с самого начала.");
                        }
                    }
                    System.out.println("Вы споласкиваете голову водой.");
                    System.out.println("Есть ли у вас тёрка? Напишите что-то из предложенного: Да/Нет.");
                    String fifthBranch = sc.nextLine().toLowerCase().trim();
                    if (fifthBranch.equals("да")) {
                        System.out.println("Вы споласкиваете тёрку водой.");
                        System.out.println("Есть ли у вас мыло или гель для душа? Напишите что-то из предложенного: Мыло/Гель");
                        String fifthBranchOne = sc.nextLine().toLowerCase().trim();
                        if (fifthBranchOne.equals("мыло")) {
                            System.out.println("Вы мылите тёрку мылом.");
                        } else if (fifthBranchOne.equals("гель")) {
                            System.out.println("Вы мылите тёрку гелем для душа.");
                        } else {
                            System.out.println("Вы выбрали что-то не из предложенного, начнем всё с самого начала.");
                        }
                        System.out.println("Вы трёте тело намыленной тёркой.");
                    } else if (fifthBranch.equals("нет")) {
                        System.out.println("Вы споласкиваете тело водой.");
                        System.out.println("Есть ли у вас мыло или гель для душа? Напишите что-то из предложенного: Мыло/Гель");
                        String fifthBranchTwo = sc.nextLine().toLowerCase().trim();
                        if (fifthBranchTwo.equals("мыло")) {
                            System.out.println("Вы мылите тело мылом.");
                        } else if (fifthBranchTwo.equals("гель")) {
                            System.out.println("Вы мылите тело гелем для душа.");
                        } else {
                            System.out.println("Вы выбрали что-то не из предложенного, начнем всё с самого начала.");
                        }
                        System.out.println("Вы споласкиваете тело водой.");
                    }
                    System.out.println("Чистое ли ваше тело? Напишите что-то из предложенного: Да/Нет.");
                    String sixthBranch = sc.nextLine().toLowerCase().trim();
                    if (sixthBranch.equals("да")) {
                        System.out.println("Поздравляю, вы теперь чистый человек!");
                        break;
                    } else if (sixthBranch.equals("нет")) {
                        System.out.println("Это плохо! Начнем сначала.");
                    } else {
                        System.out.println("Вы выбрали что-то не из предложенного, начнем всё с самого начала.");
                    }
                } else if (firstBranch.equals("нет")) {
                    System.out.println("Поздравляю, вы чистый человек, вернитесь сюда когда станете грязным человеком.");
                    break;
                } else {
                    System.out.println("Вы выбрали что-то не из предложенного, начнем с начала.");
                }
            }
        }
    }
