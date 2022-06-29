public class Main {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        Author a1 = Bookshelf.addNewAuthor("Marco", "Cobucci");
        Author a2 = Bookshelf.addNewAuthor("Luigi", "Belluschi");
        Book b1 = new Book("Profondo Blu", "Parla di un giovane hacker", a1);
        Book b2 = new Book("La Volpe", "Parla di un giovane hacker", a1);
        Book b3 = new Book("HackTown", "Hack Town", a2);
        Book b4 = new Book("AAARegole", "Regole della programmazione", a1);

        bookshelf.addNewBook(b1);
        bookshelf.addNewBook(b2);
        bookshelf.addNewBook(b3);
        bookshelf.addNewBook(b4);
        bookshelf.addNewBook(b4);

        bookshelf.searchBookById("b1");
        System.out.println();
        bookshelf.searchBookByTitle("vol");
        System.out.println();
        bookshelf.searchBookByAuthorSurname("CObucci");
        System.out.println();
        bookshelf.searchBookByAuthorSurname("bellu");
        System.out.println();
        System.out.println(bookshelf);
        bookshelf.removeBook(b2);
        System.out.println(bookshelf);
        System.out.println();
        a1.stampaLibri();
    }
}