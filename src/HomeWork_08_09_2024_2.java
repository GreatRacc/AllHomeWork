public class HomeWork_08_09_2024_2 {
    public static void main(String[] args) {
        countingMoney("Диана", 66660, 0.15);
        countingMoney("Андрей", 77770, 0.15);
        countingMoney("Мария", 88880, 0.15);

    }

    public static void countingMoney(String name, int money, double percent) {
        int inYear = money * 12;
        int becomeMoney = (int) Math.round((percent * money) + money);
        int becomeInYear = becomeMoney * 12;
        int difference = becomeInYear - inYear;
        printEnd(name, money, inYear, becomeMoney, becomeInYear, difference);
    }

    public static void printEnd(String name, int moneyBefore, int moneyBeforeInYear, int moneyAfter, int moneyAfterInYear, int difference) {
        System.out.println(name + " получала: " + moneyBefore + ", в год это: "
                + moneyBeforeInYear + '\n' + ". На данный момент " + name + " получает: " + moneyAfter + ", в год это: " + moneyAfterInYear + '\n' + ". Годовая разница составила: " + difference);
    }
}
