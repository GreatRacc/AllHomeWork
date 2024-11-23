package HomeWork_10;

import java.util.ArrayList;
import java.util.List;

public class MainForHouse {
    public static void main(String[] args) {
        House house1 = new House.Builder()
                .setName("Коттедж")
                .setFloors(2)
                .setRooms(8)
                .setHasGarage(true)
                .build();
        House house2 = new House.Builder()
                .setName("Деревенский дом")
                .setFloors(2)
                .setRooms(8)
                .setHasGarage(false)
                .build();
        House house3 = new House.Builder()
                .setName("Дачный дом")
                .setFloors(3)
                .setRooms(8)
                .setHasGarage(true)
                .build();
        House house4 = new House.Builder()
                .setName("Замок")
                .setFloors(8)
                .setRooms(30)
                .setHasGarage(false)
                .build();
        List<House> houseList = new ArrayList<>();
        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);
        houseList.add(house4);
        System.out.println("Есть ли первый дом? " + houseList.contains(house1));
        System.out.println("Есть ли третий дом? " + houseList.contains(house3));
        System.out.println("Индекс 'house1' = " + houseList.indexOf(house1));
        System.out.println("Индекс 'house4' = " + houseList.indexOf(house4));
        System.out.println(house1.equals(house2)); // Убрал из метода equals имя и гараж.
        System.out.println(house1.equals(house3));
    }
}
