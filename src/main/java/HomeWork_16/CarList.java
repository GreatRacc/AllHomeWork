package HomeWork_16;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    private List<Car> cars;

    public CarList() {
        this.cars = new ArrayList<>();
        cars.add(new Car("Лада", "Черный"));
        cars.add(new Car("Нива", "Белый"));
        cars.add(new Car("Опель", "Черный"));
        cars.add(new Car("Мерседес", "Черный"));
    }

    public Car getCar(String model, String color) {
        for (Car car : cars) {
            if (car.getModel().equals(model) && car.getColor().equals(color)) {
                return car;
            }
        }
        throw new CarNotFoundException("Машины с параметрами: " + model + ", " + color + " не найдено.");
    }
}
