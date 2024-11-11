package HomeWork_9;

public class Truck extends MotorTransport {
    private int capacity;

    public Truck(int wheelAmount, int maxSpeed, String engineType, int capacity) {
        super(wheelAmount, maxSpeed, engineType);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обслужено грузовик с грузоподъемностью '" + capacity + " кг'.");
    }
}
