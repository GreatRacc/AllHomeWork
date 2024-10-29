package HomeWork_8;

public class InsertMain {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Шарик");
        Animal dog2 = new Dog("Альфа");
        Animal cat1 = new Cat("Сырок");
        Animal cat2 = new Cat("Чапа");
        Bird bird1 = new Bird("Клава", true);
        Bird bird2 = new Bird("Джонни", true);
        dog1.setNameAnimal("Джек");
        bird2.setCanFly(false);
        Animal[] animals = {dog1, dog2, cat1, cat2, bird1, bird2};
        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
            animal.move();
            if (animal instanceof Pet pet) {
                pet.play();
                pet.beFriendly();
            }
            System.out.println("-------------");
        }
        System.out.println("Может ли летать Клава? " + bird1.canFly());
        System.out.println("Может ли летать Джонни? " + bird2.canFly());
    }
}
