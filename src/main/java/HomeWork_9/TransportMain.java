package HomeWork_9;

public class TransportMain {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle(2, 30, "горный");
        Bicycle bicycle2 = new Bicycle(2, 40, "шоссейный");
        Car car1 = new Car(4, 140, "бензиновый", "Шевроле", "Нива");
        Car car2 = new Car(4, 160, "бензиновый", "АвтоВАЗ", "ВАЗ-2114");
        Truck truck1 = new Truck(6, 120, "дизельный", 15000);
        Truck truck2 = new Truck(6, 160, "дизельный", 10000);
        ServiceStation station = new ServiceStation();
        System.out.println("Обслуживание велосипедов:");
        station.service(bicycle1);
        System.out.println("**************************");
        station.service(bicycle2);
        System.out.println("-------------------------");
        System.out.println("Обслуживание автомобиля:");
        station.service(car1);
        System.out.println("**************************");
        station.service(car2);
        System.out.println("-------------------------");
        System.out.println("Обслуживание грузовика:");
        station.service(truck1);
        System.out.println("**************************");
        station.service(truck2);
        System.out.println("-------------------------");
    }
}
