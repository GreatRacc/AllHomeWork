package HomeWork_10;

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
                .setFloors(1)
                .setRooms(4)
                .setHasGarage(false)
                .build();
        System.out.println(house1);
        System.out.println(house2);
    }
}
