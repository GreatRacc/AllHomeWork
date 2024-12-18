package HomeWork_14;

class CustomMutableClass {
    private int value;

    public CustomMutableClass(int value) {
        this.value = value;
    }

    public CustomMutableClass(CustomMutableClass copyValue) {
        this.value = copyValue.value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
