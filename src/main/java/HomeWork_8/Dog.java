package HomeWork_8;

public class Dog extends Animal implements Pet {
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
        System.out.println(getNameAnimal() + " гавкает.");
    }

    @Override
    public void eat() {
        System.out.println(getNameAnimal() + " кушает косточку.");
    }

    @Override
    public void move() {
        System.out.println(getNameAnimal() + " бегает.");
    }

    @Override
    public void play() {
        System.out.println(getNameAnimal() + " играет с косточкой.");
    }

    @Override
    public void beFriendly() {
        System.out.println(getNameAnimal() + " радостно виляет хвостом.");
    }
}