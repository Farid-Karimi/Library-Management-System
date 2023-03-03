import java.util.ArrayList;


public class User {
    private String username;
    private String password;
    private ArrayList<Book> ListOfrentedBooks;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        ListOfrentedBooks = new ArrayList<>();
    }

    public String getUsername() {
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
    public ArrayList<Book> getRentedBooks() {
        return ListOfrentedBooks;
    }
    public boolean isBookRented(String ISBN){
        for (Book book : ListOfrentedBooks){
            if (book.getISBN() == ISBN){
                return true;
            }
        }
        return false;
    }

    public void borrowBook(Book book, Library library) {
        if (library.doesBookExist(book.getISBN())){
            ListOfrentedBooks.add(book);
            library.decreaseBook(book);
        }
        else{
            System.out.println("book doesn't exist!");
        }
    }

    public void returnBook(Book book, Library library){
        if(isBookRented(book.getISBN())){
            ListOfrentedBooks.remove(book);
            library.increaseBook(book);
        }
        else{
            System.out.println("you don't have this book!");
        }
    }
}
