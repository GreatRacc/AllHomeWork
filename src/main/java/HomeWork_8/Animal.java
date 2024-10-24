package HomeWork_8;

public class Animal {
    private String nameAnimal;

    /**
     * Конструктор, включающий в себя только имя животного.
     *
     * @param nameAnimal - конструктор включающий в себя имя животного.
     */
    public Animal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    /**
     * Сеттер для имени животного.
     *
     * @param nameAnimal перепределяет имя животного.
     */
    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public void makeSound() {
        System.out.println("Животное издает звук.");
    }

    public void eat() {
        System.out.println("Животное кушает.");
    }

    /**
     * Геттер для имени животного.
     *
     * @return возвращает имя животного.
     */
    public String getNameAnimal() {
        return nameAnimal;
    }


}
