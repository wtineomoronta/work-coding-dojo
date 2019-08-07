package library;

public class Book {
    protected String author;
    private String isbn;
    String editorial;
    public String titulo;

    public Book() {
    }

    public Book(String author, String isbn, String editorial, String titulo) {
        this.author = author;
        this.isbn = isbn;
        this.editorial = editorial;
        this.titulo = titulo;
    }

    private String formatString() {
        return "Author: " + author + "\nISBN: " + isbn + " \nEditorial: " + editorial +
                " \nTitulo: " + titulo;
    }

    public String description() {
        return formatString();
    }

}

