
public class Book {
    private String name;
    private String author;
    private String yearOfPublish;
    private String ISBN;
    public Book(String name, String author, String yearOfPublish, String ISBN){
        this.name = name;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
        this.ISBN = ISBN;
    }
    //getter methods
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public String getYearOfPublish() {
        return yearOfPublish;
    }
    public String getISBN() {
        return ISBN;
    }
    //setter methods
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setYearOfPublish(String yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }
}
