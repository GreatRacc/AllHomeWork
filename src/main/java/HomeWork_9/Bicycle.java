package HomeWork_9;

public class Bicycle extends WheeledTransport {
    private String type;

    public Bicycle(int wheelAmount, int maxSpeed, String type) {
        super(wheelAmount, maxSpeed);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обслужено навесное оборудование велосипеда типа '" + type + "'.");
    }
}
