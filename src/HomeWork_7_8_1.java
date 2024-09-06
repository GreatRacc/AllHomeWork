import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class HomeWork_7_8_1 { // Задание 1 P.s. Надеюсь не критично что под исходник я взял свою работу с BiDecimal.
    public static void main(String[] args) {
        Scanner ScAllFeed = new Scanner(System.in);
        System.out.println("Введите сколько всего было отзывов.");
        if (ScAllFeed.hasNextInt()) {
            int allFeedInt = ScAllFeed.nextInt();
            Scanner ScGoodFeed = new Scanner(System.in);
            System.out.println("Введите сколько всего было хороших отзывов из " + allFeedInt);
            int goodFeedInt = ScGoodFeed.nextInt();
            if (goodFeedInt <= allFeedInt) {
                int badFeedInt = goodFeedInt - allFeedInt;
                BigDecimal allFeed = new BigDecimal(allFeedInt);
                BigDecimal goodFeed = new BigDecimal(goodFeedInt);
                BigDecimal badFeed = new BigDecimal(badFeedInt);
                BigDecimal multiplyC = new BigDecimal(100);
                BigDecimal bigMulGoodFeed = goodFeed.multiply(multiplyC);
                BigDecimal goodPercent = bigMulGoodFeed.divide(allFeed, 2, RoundingMode.HALF_UP);
                BigDecimal bigMulBadFeed = badFeed.multiply(multiplyC);
                BigDecimal BadPercent = bigMulBadFeed.divide(allFeed, 2, RoundingMode.HALF_UP);
                BigDecimal roundedGood = goodPercent.round(new MathContext(2, RoundingMode.HALF_UP));
                BigDecimal roundedBad = BadPercent.round(new MathContext(2, RoundingMode.HALF_UP));
                int goodFeedIntBi = roundedGood.toBigInteger().intValueExact();
                int badFeedIntBi = roundedBad.toBigInteger().intValueExact();
                System.out.println ("Всего отзывов - " + allFeed +
                        "\nХороших отзывов (double) - " + goodPercent + "%" +
                        "\nПлохих отзывов (double) - " + BadPercent + "%" +
                        "\nХороших отзывов (int) - " + goodFeedIntBi + "%" +
                        "\nПлохих отзывов (int) - " + badFeedIntBi + "%");
            } else {
                System.out.println ("Вы ввели больше чем" + allFeedInt);
            }
        } else {
            System.out.println ("Вы ввели не число, повторите попытку перезапустив приложение.");
        }
    }
}
