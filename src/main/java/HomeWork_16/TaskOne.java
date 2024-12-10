package HomeWork_16;

public class TaskOne {
    public static void main(String[] args) {
        try {
            System.out.println(division1(88, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(division2(55, 0));
    }

    public static double division1(int a, int b) {
        if (a == 0 || b == 0) {
            throw new ArithmeticException("Ошибка, делить на ноль нельзя(1).");
        }
        return (double) a / b;
    }

    public static double division2(int a, int b) {
        try {
            if (a == 0 || b == 0) {
                throw new ArithmeticException("Ошибка, делить на ноль нельзя(2).");
            }
            return (double) a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
