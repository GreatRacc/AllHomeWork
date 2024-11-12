package HomeWork_9;

public class Car extends MotorTransport {
    private String mark;
    private String model;

    public Car(int wheelAmount, int maxSpeed, String engineType, String mark, String model) {
        super(wheelAmount, maxSpeed, engineType);
        this.mark = mark;
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обслужено авто: " + mark + ", " + model + ".");
    }
}
