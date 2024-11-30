package HomeWork_14;

import java.util.*;

final class ImmutableClass {
    private final String name;
    private final List<Integer> numbers;
    private final CustomMutableClass customMutableClass;

    public ImmutableClass(String name, List<Integer> numbers, CustomMutableClass customMutableClass) {
        this.name = name;
        this.numbers = new ArrayList<>();
        for (Integer i : numbers) {
            this.numbers.add(i);
        }
        this.customMutableClass = new CustomMutableClass(customMutableClass);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }

    public CustomMutableClass getCustomMutableClass() {
        return new CustomMutableClass(customMutableClass);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableClass that = (ImmutableClass) o;
        return name.equals(that.name) && numbers.equals(that.numbers) && customMutableClass.equals(that.customMutableClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numbers, customMutableClass);
    }
}
