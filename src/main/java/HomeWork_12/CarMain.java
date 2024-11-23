package HomeWork_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Lada", 2024, "Black"));
        carList.add(new Car("Lada", 2024, "White"));
        carList.add(new Car("Lada", 2024, "Red"));
        carList.add(new Car("Lada", 2023, "Gray"));
        carList.add(new Car("Volga", 2024, "Black"));
        carList.add(new Car("Volga", 2023, "White"));
        carList.add(new Car("Volga", 2022, "Red"));
        carList.add(new Car("Audi", 2020, "Red"));

        Collections.sort(carList);
        for (Car car: carList){
            System.out.println(car);
        }
    }
}
