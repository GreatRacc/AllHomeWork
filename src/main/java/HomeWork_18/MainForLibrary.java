package HomeWork_18;

import java.util.Comparator;

public class MainForLibrary {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book(1, "книга1", "Андрей", true);
        Book book2 = new Book(2, "книга2", "Наташа", false);
        Book book3 = new Book(3, "книга3", "Александр", true);
        Book book4 = new Book(4, "книга4", "Андрей", false);
        Book book5 = new Book(5, "книга5", "Алексей", true);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        System.out.println("Все книги:");
        library.getBooks().forEach(System.out::println);
        System.out.println("----------------------------");
        System.out.println("Доступные книги:");
        library.getBooks(true).forEach(System.out::println);
        System.out.println("----------------------------");
        System.out.println("Недоступные книги:");
        library.getBooks(false).forEach(System.out::println);
        System.out.println("----------------------------");
        System.out.println("Книга по индексу 1 = " + library.getBookById(1));
        System.out.println("----------------------------");
        System.out.println("Количество всех книг: " + library.countBooks());
        System.out.println("Количество доступных книг: " + library.countBooks(true));
        System.out.println("Количество недоступных книг: " + library.countBooks(false));
        System.out.println("----------------------------");
        System.out.println("Авторы (без дубликатов):");
        library.getAuthors().forEach(System.out::println);
        System.out.println("----------------------------");
        System.out.println("Тест с компаратором по названию:");
        library.getBooks(Comparator.comparing(Book::getTitle)).forEach(System.out::println);
    }
}
