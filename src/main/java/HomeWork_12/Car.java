package HomeWork_12;

class Car implements Comparable<Car> {
    private String model;
    private int year;
    private String color;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'';
    }

    @Override
    public int compareTo(Car o) {
        int sortModel = this.model.compareTo(o.model);
        int sortYear = Integer.compare(o.year, this.year);
        int sortColor = this.color.compareTo(o.color);
        if (sortModel != 0) {
            return sortModel;
        }
        if (sortYear != 0) {
            return sortYear;
        }
        return sortColor;
    }
}
