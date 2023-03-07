import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Library library = new Library();

    public static void adminPanel(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Desired Operation:");
        System.out.println("1.Search User");
        System.out.println("2.Search Librarian");
        System.out.println("3.Search Books");
        System.out.println("4.Add User");
        System.out.println("5.Add Librarian");
        System.out.println("6.Add Books");
        System.out.println("7.Remove User");
        System.out.println("8.Remove Librarian");
        System.out.println("9.Remove Books");
        System.out.println("10.Update User");
        System.out.println("11.Update Librarian");
        System.out.println("12.Update Books");
        System.out.println("13.Decrease Books");
        System.out.println("14.Increase Books");

        int operation = input.nextInt();

        String username;
        String password;
        String bookName;
        User tempUser;

        switch(operation) {
            case 1:
                // code for searching user
                System.out.println("Enter Username:");
                username = input.next();
                if(library.doesUserExist(username)) {
                    System.out.println("User Found!");
                }
                else{
                    System.out.println("User Not Found!");
                }
                adminPanel();
                break;
            case 2:
                // code for searching librarian
                System.out.println("Enter Username:");
                username = input.next();
                if(library.doesLibrarianExist(username)) {
                    System.out.println("Librarian Found!");
                }
                else{
                    System.out.println("User Not Found!");
                }
                adminPanel();
                break;
            case 3:
                // code for searching books
                System.out.println("Enter ISBN Of The Book:");
                bookName = input.next();
                if(library.doesBookExist(bookName)) {
                    System.out.println("Book Found!");
                }
                else{
                    System.out.println("Book Not Found!");
                }
                adminPanel();
                break;
            case 4:
                // code for adding user
                System.out.println("Enter Username:");
                username = input.next();
                System.out.println("Enter Password:");
                password = input.next();
                tempUser = new User(username,password);
                library.addUser(tempUser);
                adminPanel();
                break;
            case 5:
                // code for adding librarian
                System.out.println("Enter Username:");
                username = input.next();
                System.out.println("Enter Password:");
                password = input.next();
                Librarian librarian = new Librarian(username,password);
                library.addLibrarian(librarian);
                adminPanel();
                break;
            case 6:
                // code for adding books
                System.out.println("Enter The ISBN:");
                bookName = input.next();
                library.addBook(library.searchBook(bookName),1);
                adminPanel();
                break;
            case 7:
                // code for removing user
                System.out.println("Enter Username:");
                username = input.next();
                library.removeUser(library.searchUser(username));
                adminPanel();
                break;
            case 8:
                //code for removing librarian
                System.out.println("Enter Username:");
                username = input.next();
                library.removeLibrarian(library.searchLibrarian(username));
                adminPanel();
                break;
            case 9:
                // code for removing books
                System.out.println("Enter The ISBN:");
                input.nextLine();
                bookName = input.nextLine();
                library.removeBook(library.searchBook(bookName));
                adminPanel();
                break;
            case 10:
                // code for updating user
                System.out.println("Enter Old Username:");
                username = input.next();
                System.out.println("Enter Old Password:");
                password = input.next();
                System.out.println("Enter New Username:");
                String newUsername = input.next();
                System.out.println("Enter New Password:");
                password = input.next();
                User appointedUser = new User(newUsername , password);
                library.updateUser(library.searchUser(username) , appointedUser);
                adminPanel();
                break;
            case 11:
                // code for updating librarian
                System.out.println("Enter Old Username:");
                username = input.next();
                System.out.println("Enter Old Password:");
                password = input.next();
                System.out.println("Enter New Username:");
                newUsername = input.next();
                System.out.println("Enter New Password:");
                password = input.next();
                Librarian appointedLibrarian = new Librarian(newUsername , password);
                library.updateLibrarian(library.searchLibrarian(username) , appointedLibrarian);
                adminPanel();
                break;
            case 12:
                // code for updating books
                input.nextLine();
                System.out.println("Enter Name Of The New Book:");
                bookName = input.nextLine();
                System.out.println("Enter Name Of The New Author:");
                String author = input.nextLine();
                System.out.println("Enter Year Of New Publish:");
                String YOP = input.nextLine();
                System.out.println("Enter New ISBN:");
                String ISBN = input.nextLine();
                Book book = new Book(bookName,author,YOP,ISBN);
                System.out.println("Enter ISBN Of The Old Book:");
                ISBN = input.nextLine();
                library.updateBook(library.searchBook(ISBN) , book);
                adminPanel();
                break;
            case 13:
                // code for Decreasing books quantity
                System.out.println("Enter ISBN:");
                ISBN = input.nextLine();
                library.decreaseBook(library.searchBook(ISBN));
                adminPanel();
                break;
            case 14:
                // code for Increasing books quantity
                System.out.println("Enter ISBN:");
                ISBN = input.nextLine();
                library.increaseBook(library.searchBook(ISBN));
                adminPanel();
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }

    }
    public static void RentAndReturn(User user){
        System.out.println("\nEnter Your Desired Operation:");
        System.out.println("1.Rent Books");
        System.out.println("2.Return Books");
        System.out.println("3.List Of Rented Books");
        System.out.println("4.Log Out!");

        int choice = input.nextInt();

        String ISBN;
        switch (choice){
            case 1:
                System.out.println("Enter The ISBN Of The Books:");
                ISBN = input.next();
                user.borrowBook(ISBN , library);
                RentAndReturn(user);
                break;
            case 2:
                System.out.println("Enter The ISBN Of The Books:");
                ISBN = input.next();
                user.returnBook(ISBN , library);
                RentAndReturn(user);
                break;
            case 3:
                System.out.println("Here is a list of the Books you rented");
                user.getRentedBooks();
                RentAndReturn(user);
                break;
            case 4:
                main(null);
            default:
                System.out.println("Wrong Input!");
        }
    }
    public static void main(String[] args){

        //----------------------------------------initializing variables------------------------------
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "1954", "978-0547928210");
        Book book2 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "1997", "978-0747532743");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "1960", "978-0446310789");

        library.addBook(book1, 5);
        library.addBook(book2, 3);
        library.addBook(book3, 2);

        User user1 = new User("farid", "karimi");
        User user2 = new User("shayan", "shahrabi");
        User user3 = new User("navid", "ebadi");

        library.addUser(user1);
        library.addUser(user2);
        library.addUser(user3);

        Librarian librarian1 = new Librarian("mohamad", "basouli");
        Librarian librarian2 = new Librarian("rana", "rokni");
        Librarian librarian3 = new Librarian("hooman", "parsaei");

        library.addLibrarian(librarian1);
        library.addLibrarian(librarian2);
        library.addLibrarian(librarian3);

        //-------------------------------------------------------------------------------------------------------
        System.out.println("Please Enter Your Username and Password");
        System.out.print("Username:");
        String username = input.next();
        System.out.print("Password:");
        String password = input.next();

        if(library.doesUserExist(username)){
            if(Objects.equals(library.searchUser(username).getPassword(), password)){
                RentAndReturn(library.searchUser(username));
            }
            else{
                System.out.println("Wrong Password!");
                main(null);
            }

        }
        else if (library.doesLibrarianExist(username)) {
            if (Objects.equals(library.searchLibrarian(username).getPassword(), password)){
                adminPanel();
            }
            else{
                System.out.println("Wrong Password!");
                main(null);
            }
        }
        else{
            System.out.println("User Doesn't Exist!");
            main(null);
        }


    }
}
