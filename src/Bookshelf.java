

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bookshelf {

    private final List<Book> books;

    public Bookshelf() {
        books = new ArrayList<>();
    }

    public void addNewBook(Book book) {
        books.add(book);
        book.getAuthor().addBookInAuthor(book);
    }

    public static Author addNewAuthor(String n, String s) {
        return new Author(n, s);
    }

    public void removeBook(Book b) {
        books.remove(b);
    }


    public void searchBookById(String id) {
        for (Book book : books) {
            if (book.getId().equals(id.toUpperCase())) {
                System.out.println("Libro trovato= " + book);
                return;
            }
        }
        System.out.println("Libro non trovato!");
    }

    public void searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println("Libro trovato= " + book);
                return;
            }
        }
        System.out.println("Libro non trovato!");
    }

    public void searchBookByAuthorSurname(String surname) {
        List<Book> bookList = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().getSurname().toLowerCase().contains(surname.toLowerCase())) {
                bookList.add(book);
            }
        }
        if (bookList.size() != 0) {
            Collections.sort(bookList, new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    return o1.getTitle().compareTo(o2.getTitle());
                }
            });
            System.out.println("Libri trovati= " + bookList);
            return;
        }
        System.out.println("Autore non trovato!");
    }

    @Override
    public String toString() {
        return "Bookshelf{" +
                "books=" + books +
                '}';
    }
}
