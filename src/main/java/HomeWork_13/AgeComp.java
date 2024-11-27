package HomeWork_13;

import java.util.Comparator;

class AgeComp implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return Integer.compare(a.getAge(), b.getAge());
    }
}
