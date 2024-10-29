package HomeWork_8;

public abstract class Animal {
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

    /**
     * Абстрактный метод для "издавания звука животным".
     */
    public abstract void makeSound();

    /**
     * Абстрактный метод для "движения животного".
     */
    public abstract void move();

    /**
     * Абстрактный метод для "принятия еды животным".
     */
    public abstract void eat();

    /**
     * Геттер для имени животного.
     *
     * @return возвращает имя животного.
     */
    public String getNameAnimal() {
        return nameAnimal;
    }
}
