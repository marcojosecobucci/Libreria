
public class Book{
    // Attributes
    private final String id;
    private static int idN = 0;

    private final String title;
    private final String synopsis;
    private final Author author;

    // Constructor
    public Book(String title, String synopsis, Author author) {
        id = "B" + idN++;
        this.title = title;
        this.synopsis = synopsis;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "\n" + "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", author=" + author.getName() + " " + author.getSurname() +
                '}';
    }
}
