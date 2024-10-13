package HomeWork_7;

public class Book {
    private String title;
    private Author author;
    private Integer datePublication;

    public Book(String title, Author author, Integer datePublication) {
        this.title = title;
        this.author = author;
        this.datePublication = datePublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Integer datePublication) {
        this.datePublication = datePublication;
    }

    public String getBookInfo() {
        return "Название книги: " + title + ", Год публикации: " + datePublication + ", Автор: " + author.getAuthorInfo();
    }
}