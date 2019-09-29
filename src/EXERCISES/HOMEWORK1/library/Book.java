package EXERCISES.HOMEWORK1.library;

public class Book extends Item {

    final int pages;

    final Cover cover;

    public Book(String id, String name, String author, int pages, Cover cover) {
        super(id, name, author);
        this.pages = pages;
        this.cover = cover;
    }
}
