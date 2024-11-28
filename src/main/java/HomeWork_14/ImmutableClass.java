package HomeWork_14;

import java.util.*;

final class ImmutableClass {
    private final String name;
    private final List<Integer> numbers;
    private final CustomMutableClass customMutableClass;

    public ImmutableClass(String name, List<Integer> numbers, CustomMutableClass customMutableClass) {
        this.name = name;
        this.numbers = List.copyOf(numbers);
        this.customMutableClass = new CustomMutableClass(customMutableClass.getValue());
    }

    public String getName() {
        return name;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public CustomMutableClass getCustomMutableClass() {
        return new CustomMutableClass(customMutableClass.getValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableClass that = (ImmutableClass) o;
        return Objects.equals(name, that.name)
                && Objects.equals(numbers, that.numbers)
                && Objects.equals(customMutableClass, that.customMutableClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numbers, customMutableClass);
    }
}
