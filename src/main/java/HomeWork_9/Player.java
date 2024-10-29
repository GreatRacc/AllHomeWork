package HomeWork_9;

import java.util.Random;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 10;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA) {
                countPlayers--;
            }
        }
    }

    public static void info() {
        int NumberPlayer = 6 - countPlayers;
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + NumberPlayer + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест.");
        }
    }

    public Player() {
        if (countPlayers < 6) {
            Random random = new Random();
            this.stamina = random.nextInt(MAX_STAMINA - 7) + 8;
            countPlayers++;
        } else {
            System.out.println("Игроков на поле уже достаточно, вам нельзя.");
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
}
