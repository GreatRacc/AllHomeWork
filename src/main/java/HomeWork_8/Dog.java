package HomeWork_8;

public class Dog extends Animal {
    /**
     * Конструктор, принмающий в себя имя животного.
     *
     * @param nameAnimal принимает в себя имя животного
     */
    public Dog(String nameAnimal) {
        super(nameAnimal);
    }

    @Override
    public void makeSound() {
        System.out.print("гавкает.");
    }

    @Override
    public void eat() {
        System.out.println("Кушает косточку.");
    }
}
