package HomeWork_13;

import java.util.Comparator;

class NameComp implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }
}
