package HomeWork_13;

import java.util.ArrayList;
import java.util.List;

public class TaskFour {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Наташа", 26));
        people.add(new Person("Андрей", 24));
        people.add(new Person("Александр", 25));
        System.out.println("Оригинальный список:");
        System.out.println(people);
        System.out.println("--------------------------------");
        people.sort(new NameComp());
        System.out.println("Сортировка по имени:");
        System.out.println(people);
        System.out.println("--------------------------------");
        people.sort(new AgeComp());
        System.out.println("Сортировка по возрасту:");
        System.out.println(people);
        System.out.println("--------------------------------");
    }
}

