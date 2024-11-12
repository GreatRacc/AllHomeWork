package HomeWork_9;

public class YardFootball {
    public static void main(String[] args) {
        Game game = new Game();
        game.addPlayer("Михаил");
        game.addPlayer("Андрей");
        game.addPlayer("Александр");
        Game.info();
        game.addPlayer("Алексей");
        game.addPlayer("Дмитрий");
        game.addPlayer("Наташа");
        System.out.println("--------------------");
        game.addPlayer("Альберт");
        System.out.println("--------------------");
        game.getPlayer();
        System.out.println("--------------------");
        System.out.println(game.hasPlayer("Михаил"));
        System.out.println(game.hasPlayer("Петр"));
        System.out.println("--------------------");
        game.runPlayers("Михаил", 10);
        System.out.println("--------------------");
        Game.info();
        System.out.println("--------------------");
        game.getPlayer();
    }
}