package HomeWork_16;


public class TaskTwo {
    public static void main(String[] args) {
        CarList carList = new CarList();
        try {
            Car car = carList.getCar("Нива", "Гравий");
            System.out.println(car);
        } catch (CarNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
