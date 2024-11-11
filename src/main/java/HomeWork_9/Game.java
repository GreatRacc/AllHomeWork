package HomeWork_9;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final List<Player> players = new ArrayList<>();
    private static final int MAX_COUNT = 6;
    private static int countPlayers = 0;

    public void addPlayer(String name) {
        if (countPlayers <= MAX_COUNT) {
            Player newPlayer = new Player(name);
            players.add(newPlayer);
            countPlayers++;
            System.out.println("Игрок " + name + " поступил на поле, всего игроков на поле: " + countPlayers);
        } else {
            System.out.println("На поле уже 6 игроков. " + name + " не допускается на поле.");
        }
    }

    public static void info() {
        int NumberPlayer = MAX_COUNT - countPlayers;
        if (countPlayers < MAX_COUNT) {
            System.out.println("Команды неполные. На поле еще есть " + NumberPlayer + " свободных мест.");
        } else {
            System.out.println("На поле нет свободных мест.");
        }
    }

    public boolean hasPlayer(String name) {
        System.out.print("Проверка наличия игрока ");
        for (Player player : players) {
            if (player.getName().equals(name)) {
                System.out.print(name + ": ");
                return true;
            }
        }
        System.out.print(name + ": ");
        return false;
    }

    public void getPlayer() {
        if (players.isEmpty()) {
            System.out.println("На поле нет игроков.");
        } else {
            System.out.println("Игроки, присутствующие на поле:");
            for (Player player : players) {
                System.out.println("Имя: " + player.getName() + ", Выносливость: " + player.getStamina());
            }
        }
    }

    public void removePlayer(Player player) {
        if (players.remove(player)) {
            countPlayers--;
            System.out.println("Удалён игрок " + player.getName() + ". Всего игроков: " + countPlayers);
        } else {
            System.out.println("Игрока " + player.getName() + " не найдено на поле.");
        }
    }

    public void runPlayers(String name, int times) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                System.out.println("Игрок по имени " + name + " выполняет действие 'бег'.");
                for (int i = 0; i < times; i++) {
                    if (!player.run()) {
                        removePlayer(player);
                        break;
                    }
                }
                return;
            }
        }
        System.out.println("Игрока с именем '" + name + "' не существует.");
    }
}