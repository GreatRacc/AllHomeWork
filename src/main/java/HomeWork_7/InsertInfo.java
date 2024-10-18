package HomeWork_7;


public class InsertInfo {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Грибоедов");
        Author author2 = new Author("Не Говард", "Не Лавкрафт");

        Book book1 = new Book("Не Горе от ума", author1, 1800);
        Book book2 = new Book("Дагон", author2, 1919);
        Book book3 = new Book("Зов Ктулху", author2, 1928);

        System.out.println("До изменений:");
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(" ");

        book1.setDatePublication(1825);
        book1.setTitle("Горе от ума");
        author2.setName("Говард");
        author2.setSurname("Лавкрафт");
        System.out.println("После изменений:");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(" ");

        System.out.println("Вывод отдельно полей книги:");
        System.out.println("Название книги: " + book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println("Дата публикации: " + book1.getDatePublication());
        System.out.println("Название книги: " + book2.getTitle());
        System.out.println(book2.getAuthor());
        System.out.println("Дата публикации: " + book2.getDatePublication());
        System.out.println("Название книги: " + book3.getTitle());
        System.out.println(book3.getAuthor());
        System.out.println("Дата публикации: " + book3.getDatePublication());
    }
}
