package HomeWork_8;

public class Cat extends Animal {
    /**
     * Конструктор, принмающий в себя имя животного.
     *
     * @param nameAnimal принимает в себя имя животного
     */
    public Cat(String nameAnimal) {
        super(nameAnimal);
    }

    @Override
    public void makeSound() {
        System.out.print("мяукает.");
    }

    @Override
    public void eat() {
        System.out.println("Кушает рыбку.");
    }
}
