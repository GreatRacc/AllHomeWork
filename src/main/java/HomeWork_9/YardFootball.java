package HomeWork_9;

public class YardFootball {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player.info();
        Player player2 = new Player();
        Player.info();
        Player player3 = new Player();
        Player.info();
        Player player4 = new Player();
        Player.info();
        Player player5 = new Player();
        Player.info();
        Player player6 = new Player();
        Player.info();
        Player player7 = new Player();
        System.out.println("Количество игроков на поле: " + Player.getCountPlayers());
        while (player4.getStamina() > 0) {
            player4.run();
            System.out.println("Выносливость игрока под номером 4: " + player4.getStamina());
        }
        System.out.println("Количество игроков на поле: " + Player.getCountPlayers());
    }
}