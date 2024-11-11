package HomeWork_9;

public class MotorTransport extends WheeledTransport {
    private String engineType;

    public MotorTransport(int wheelAmount, int maxSpeed, String engineType) {
        super(wheelAmount, maxSpeed);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обслужено двигатель типа '" + engineType + "'.");
    }
}
