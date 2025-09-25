package se.jensen.elias.bibliotek;

public class Book {
    public String title;
    public String isbn;
    public Author author;

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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String toString() {
        return "Titel: " + title + " skriven av: " + author + " ISBN: " + isbn;
    }


}

