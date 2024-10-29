package HomeWork_8;

public class Bird extends Animal {
    private boolean canFly;

    /**
     * Конструктор, включающий в себя имя и возможность полёта "птицы".
     *
     * @param nameAnimal определяет имя животного.
     * @param canFly     определяет, летает ли животное.
     */
    public Bird(String nameAnimal, boolean canFly) {
        super(nameAnimal);
        this.canFly = canFly;
    }

    /**
     * Геттер для вывода возможности "полёта" животного.
     *
     * @return возвращает "летает ли животное".
     */
    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println(getNameAnimal() + " чирикает.");
    }

    @Override
    public void eat() {
        System.out.println(getNameAnimal() + " кушает зёрнышки.");
    }

    @Override
    public void move() {
        if (canFly) {
            System.out.println(getNameAnimal() + " летает.");
        } else {
            System.out.println(getNameAnimal() + " бегает.");
        }
    }
}