package HomeWork_10;

public class House {
    private final String name;
    private final int floors;
    private final int rooms;
    private final boolean hasGarage;

    public static class Builder {
        private String name;
        private int floors;
        private int rooms;
        private boolean hasGarage;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setFloors(int floor) {
            this.floors = floor;
            return this;
        }

        public Builder setRooms(int room) {
            this.rooms = room;
            return this;
        }

        public Builder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    public House(Builder builder) {
        this.name = builder.name;
        this.floors = builder.floors;
        this.rooms = builder.rooms;
        this.hasGarage = builder.hasGarage;
    }

    @Override
    public String toString() {
        return "Дом типа: " + name + " имеет этажей " + floors +
                ", так же в этом доме " + rooms + " комнат, при этом наличие гаража: " + hasGarage;
    }
}

