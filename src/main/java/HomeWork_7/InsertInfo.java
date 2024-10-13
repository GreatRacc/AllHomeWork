package HomeWork_7;


public class InsertInfo {
    public static void main(String[] args) {
        Author author1 = new Author("Не Александр", "Не Грибоедов");
        Author author2 = new Author("Говард", "Лавкрафт");

        Book book1 = new Book("Не Горе от ума", author1, 1800);
        Book book2 = new Book("Дагон", author2, 1919);
        Book book3 = new Book("Зов Ктулху", author2, 1928);

        System.out.println("До изменений:");
        System.out.println(book1.getBookInfo());
        System.out.println(book2.getBookInfo());
        System.out.println(book3.getBookInfo());
        System.out.println(" ");

        author1.setName("Александр");
        author1.setSurname("Грибоедов");
        book1.setDatePublication(1825);
        book1.setTitle("Горе от ума");

        System.out.println("После изменений:");
        System.out.println(book1.getBookInfo());
        System.out.println(book2.getBookInfo());
        System.out.println(" ");

        System.out.println("Вывод отдельно:");
        System.out.println("Имя автора: " + author1.getName());
        System.out.println("Фамилия автора: " + author1.getSurname()+ author1.getName());
        System.out.println("Название книги:" + book1.getTitle());
        System.out.println("Дата публикации: " + book1.getDatePublication());
    }
}
