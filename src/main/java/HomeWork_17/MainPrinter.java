package HomeWork_17;

public class MainPrinter {
    public static void main(String[] args) {
        Printer printer1 = new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };
        printer1.print("Привет, я первый вариант!");
        Printer printer2 = message -> System.out.println(message);
        printer2.print("Привет, я второй вариант!");
        Printer printer3 = message -> {
            System.out.println(message);
            System.out.println("Длина сообщения – " + message.length());
        };
        printer3.print("Привет, я третий вариант!");
    }
}
