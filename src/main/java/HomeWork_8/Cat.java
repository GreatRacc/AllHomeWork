package HomeWork_8;

public class Cat extends Animal implements Pet {
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
        System.out.println(getNameAnimal() + " мяукает.");
    }

    @Override
    public void eat() {
        System.out.println(getNameAnimal() + " кушает рыбку.");
    }

    @Override
    public void move() {
        System.out.println(getNameAnimal() + " кувыркается.");
    }

    @Override
    public void play() {
        System.out.println(getNameAnimal() + " играет с клубком ниток.");
    }

    @Override
    public void beFriendly() {
        System.out.println(getNameAnimal() + " мурлычет.");
    }
}
