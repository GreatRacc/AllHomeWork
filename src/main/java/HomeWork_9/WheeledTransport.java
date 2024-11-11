package HomeWork_9;

public class WheeledTransport {
    private int wheelAmount;
    private int maxSpeed;

    public WheeledTransport(int wheelAmount, int maxSpeed) {
        this.wheelAmount = wheelAmount;
        this.maxSpeed = maxSpeed;
    }

    public int getWheelAmount() {
        return wheelAmount;
    }

    public void setWheelAmount(int wheelAmount) {
        this.wheelAmount = wheelAmount;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void service() {
        System.out.println("Обслужено колёс - " + wheelAmount);
    }
}
