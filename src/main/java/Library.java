import java.util.*;

public class Library {
    private List<Book> booksList;
    private Map<String, Integer> ISBNsList;
    private List<User> usersList;
    private List<Librarian> librariansList;
    public Library() {
        this.booksList = new ArrayList<>();
        this.ISBNsList = new HashMap<>();
        this.usersList = new ArrayList<>();
        this.librariansList = new ArrayList<>();
    }

    public void addBook(Book book, int quantity){
        booksList.add(book);
        ISBNsList.put(book.getISBN(), quantity);
    }

    public void removeBook(Book book){
        booksList.remove(book);
        ISBNsList.remove(book.getISBN());
    }

    public Book searchBook(String ISBN) {
        for (Book book : booksList) {
            if (Objects.equals(book.getISBN(), ISBN)) {
                return book;
            }
        }
        return new Book("","","","");
    }

    public void updateBook(Book oustedBook, Book appointedBook){
        int index = booksList.indexOf(oustedBook);
        booksList.set(index, appointedBook);
        ISBNsList.put(appointedBook.getISBN(), ISBNsList.get(oustedBook.getISBN()));
        ISBNsList.remove(oustedBook.getISBN());
    }

    public boolean doesBookExist(String ISBN){
        for (Book book : booksList) {
            if (Objects.equals(book.getISBN(), ISBN) && ISBNsList.get(book.getISBN()) > 0) {
                return true;
            }
        }
        return false;
    }

    public void increaseBook(Book book , int quantity){
        ISBNsList.put(book.getISBN() , ISBNsList.get(book.getISBN()) + quantity);
    }
    public void increaseBook(Book book){
        ISBNsList.put(book.getISBN() , ISBNsList.get(book.getISBN()) -1);
    }

    public void decreaseBook(Book book , int quantity){
        int currentQuantity = ISBNsList.getOrDefault(book.getISBN() , 0);
        if (currentQuantity < quantity) {
            System.out.println("Not enough books in inventory");
        }
        ISBNsList.put(book.getISBN(), currentQuantity - quantity);
    }
    public void decreaseBook(Book book){
        int currentQuantity = ISBNsList.getOrDefault(book.getISBN() , 0);
        if (currentQuantity < 1) {
            System.out.println("Not enough books in inventory");
        }
        ISBNsList.put(book.getISBN(), currentQuantity - 1);
    }

    //user related functions

    public void addUser(User user){
        usersList.add(user);
    }

    public void removeUser(User user){
        usersList.remove(user);
    }

    public void updateUser(User oustedUser, User appointedUser){
        if(doesUserExist(oustedUser.getUsername())) {
            int index = usersList.indexOf(oustedUser);
            usersList.set(index, appointedUser);
        }
    }
    public void updateUser(String userDelete, String newUser){
        User oustedUser = searchUser(userDelete);
        User appointedUser = searchUser(newUser);
        usersList.set(usersList.indexOf(oustedUser), appointedUser);
    }

    public User searchUser(String username){
        for (User user : usersList){
            if(Objects.equals(user.getUsername(), username)){
                return user;
            }
        }
        return new User("","");
    }

    public boolean doesUserExist(String username){
        for (User user : usersList){
            if(user.getUsername().equals(username)){
                return true;
            }

        }
        return false;
    }

    //librarian related functions

    public void addLibrarian(Librarian librarian){
        librariansList.add(librarian);
    }

    public void removeLibrarian(Librarian librarian){
        librariansList.remove(librarian);
    }

    public Librarian searchLibrarian(String username) {
        for (Librarian librarian : librariansList) {
            if (Objects.equals(librarian.getUsername(), username)) {
                return librarian;
            }
        }
        return new Librarian("","");
    }

    public void updateLibrarian(Librarian oustedLibrarian, Librarian appointedLibrarian){
        int index = librariansList.indexOf(oustedLibrarian);
        librariansList.set(index, appointedLibrarian);
    }

    public boolean doesLibrarianExist(String username){
        for (Librarian librarian : librariansList) {
            if (Objects.equals(librarian.getUsername(), username)) {
                return true;
            }
        }
        return false;
    }


}
