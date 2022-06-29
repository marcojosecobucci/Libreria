import java.util.ArrayList;
import java.util.List;

public class Author {
    // Attributes
    private final String id;
    private int idN;
    private final String name;
    private final String surname;
    private final List<Book> books;
    // Constructor

    public Author(String name, String surname) {
        id = "L" + idN++;
        this.name = name;
        this.surname = surname;
        this.books = new ArrayList<>();
    }

    // Getter and Setter

    // Methods

    public void addBookInAuthor(Book b) {
        books.add(b);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
