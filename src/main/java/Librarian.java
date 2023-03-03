
public class Librarian {
    private String username;
    private String password;
    public Librarian(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public User searchUser(String username, Library library){
        return library.searchUser(username);
    }
    public void addUser(User user, Library library){
        library.addUser(user);
    }
    public void removeUser(User user, Library library){
        library.removeUser(user);
    }
    public void updateUser(User oldUser, User newUser, Library library){
        library.updateUser(oldUser, newUser);
    }
    public Librarian searchLibrarian(String username, Library library){
        return library.searchLibrarian(username);
    }
    public void addLibrarian(Librarian librarian, Library library){
        library.addLibrarian(librarian);
    }
    public void removeLibrarian(Librarian librarian, Library library){
        library.removeLibrarian(librarian);
    }
    public void updateLibrarian(Librarian oldLibrarian, Librarian newLibrarian, Library library){
        library.updateLibrarian(oldLibrarian, newLibrarian);
    }
    public Book searchBook(String ISBN, Library library){
        return library.searchBook(ISBN);
    }
    public void addBook(Book book, int quantity, Library library){
        library.addBook(book, quantity);
    }
    public void removeBook(Book book, Library library){
        library.removeBook(book);
    }
    public void updateBook(Book oustedBook, Book appointedBook, Library library){
        library.updateBook(oustedBook, appointedBook);
    }

}
