package edu.uaslp.examen;

public class Book {
    private String title;
    private String isbn;
    private String author;
    private short stars;

    public String getTittle() {
        return title;
    }

    public void setTittle(String tittle) {
        this.title = tittle;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public short getStars() {
        return stars;
    }

    public void setStars(short stars) {
        this.stars = stars;
    }
}
