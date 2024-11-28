package HomeWork_14;

public class MainForBox {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        Box<Double> box2 = new Box<>();
        Box<Character> box3 = new Box<>();
        Box<String> box4 = new Box<>();
        box1.set(1);
        box2.set(1.1);
        box3.set('f');
        box4.set("Привет");
        System.out.println("Использования метода 'get':");
        System.out.println(box1.get());
        System.out.println(box2.get());
        System.out.println(box3.get());
        System.out.println(box4.get());
        System.out.println(" ");
        System.out.println("Использования метода 'IsEmpty':");
        System.out.println(box1.isEmpty());
        System.out.println(box2.isEmpty());
        System.out.println(box3.isEmpty());
        System.out.println(box4.isEmpty());
        System.out.println(" ");
        System.out.println("Производим очистку контейнеров...");
        box1.clear();
        box2.clear();
        box3.clear();
        box4.clear();
        System.out.println(" ");
        System.out.println("Использования метода 'isEmpty' после очистки:");
        System.out.println(box1.isEmpty());
        System.out.println(box2.isEmpty());
        System.out.println(box3.isEmpty());
        System.out.println(box4.isEmpty());
    }
}
