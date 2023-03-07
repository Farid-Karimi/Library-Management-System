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
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void getRentedBooks() {
        String info;
        for(Book book : ListOfrentedBooks){
            info = book.getISBN() + " / " + book.getName();
            System.out.println(info);
        }
    }
    public boolean isBookRented(String ISBN){
        for (Book book : ListOfrentedBooks){
            if (book.getISBN() == ISBN){
                return true;
            }
        }
        return false;
    }

    public void borrowBook(String ISBN, Library library) {
        Book book = library.searchBook(ISBN);
        if (library.doesBookExist(book.getISBN())){
            ListOfrentedBooks.add(book);
            library.decreaseBook(book);
            System.out.println("Books Has Been Rented.");
        }
        else{
            System.out.println("book doesn't exist!");
        }
    }

    public void returnBook(String ISBN, Library library){
        Book book = library.searchBook(ISBN);
        if(isBookRented(book.getISBN())){
            ListOfrentedBooks.remove(book);
            library.increaseBook(book);
            System.out.println("Books Has Been Returned.");
        }
        else{
            System.out.println("you don't have this book!");
        }
    }
}
