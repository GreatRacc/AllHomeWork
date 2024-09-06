import java.util.Random;

public class HomeWork_7_8_2 { // Задание 2.
    public static void main(String[] args) {
        Random r = new Random();
        int z = r.nextInt();
        int c = r.nextInt();
        int m = r.nextInt();
        int n = r.nextInt();
        char convertZ = (char) ('0' + z);
        char convertC = (char) ('0' + c);
        char convertM = (char) ('0' + m);
        char convertN = (char) ('0' + n);
        System.out.println("Полученное слово это - " + convertZ+ convertC + convertM + convertN);
    }
}
