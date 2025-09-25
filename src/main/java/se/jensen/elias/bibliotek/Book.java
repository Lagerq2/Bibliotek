package se.jensen.elias.bibliotek;

public class Book {
    public String title;
    public String isbn;

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBook() {
        return title + " " + isbn;
    }

    public String toString() {
        return title + " " + isbn;
    }


}

