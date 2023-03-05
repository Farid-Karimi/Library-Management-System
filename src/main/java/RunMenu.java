import java.util.Scanner;

public class RunMenu {
    public static void main(String[] args){

        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "1954", "978-0547928210");
        Book book2 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "1997", "978-0747532743");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "1960", "978-0446310789");

        Library library = new Library();

        library.addBook(book1, 5);
        library.addBook(book2, 3);
        library.addBook(book3, 2);

        User user1 = new User("farid", "401222112");
        User user2 = new User("shayan", "401222086");

        library.addUser(user1);
        library.addUser(user2);

        Librarian librarian1 = new Librarian("mohamad", "401222020");
        Librarian librarian2 = new Librarian("rana", "401222066");

        library.addLibrarian(librarian1);
        library.addLibrarian(librarian2);

        //-------------------------------------------------------------------------------------------------------

        input.cin

    }
}
