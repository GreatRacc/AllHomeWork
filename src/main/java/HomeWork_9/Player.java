package HomeWork_9;

import java.util.Random;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 10;
    public static final int MIN_STAMINA = 0;
    private final String name;
    Random random = new Random();

    public Player(String name) {
        this.name = name;
        this.stamina = random.nextInt(8, MAX_STAMINA + 1);
    }

    public int getStamina() {
        return stamina;
    }

    public String getName() {
        return name;
    }

    public boolean run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            System.out.println(name + " 'бежит', теперь его выносливость: " + stamina);
            return stamina > MIN_STAMINA;
        } else {
            System.out.println(name + " не может бегать, выносливость на минимуме.");
            return false;
        }
    }
}
