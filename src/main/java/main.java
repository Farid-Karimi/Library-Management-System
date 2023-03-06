import java.util.Objects;
import java.util.Scanner;

public class main {
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

        String username = "";
        String password = "";
        String bookName = "";
        User tempUser;
        Librarian tempLibrarian;
        Book tempBook;


        switch(operation) {
            case 1:
                // code for searching user
                username = input.next();
                if(library.doesUserExist(username)) {
                    System.out.println("User Found!");
                }
                else{
                    System.out.println("User Not Found!");
                }
                break;
            case 2:
                // code for searching librarian
                username = input.next();
                if(library.doesLibrarianExist(username)) {
                    System.out.println("Librarian Found!");
                }
                else{
                    System.out.println("User Not Found!");
                }
                break;
            case 3:
                // code for searching books
                bookName = input.next();
                if(library.doesBookExist(bookName)) {
                    System.out.println("Book Found!");
                }
                else{
                    System.out.println("Book Not Found!");
                }
                break;
            case 4:
                // code for adding user
                System.out.println("Enter Username:");
                username = input.next();
                System.out.println("Enter Password:");
                password = input.next();
                tempUser = new User(username,password);
                library.addUser(tempUser);
                break;
            case 5:
                // code for adding librarian
                System.out.println("Enter Username:");
                username = input.next();
                System.out.println("Enter Password:");
                password = input.next();
                Librarian librarian = new Librarian(username,password);
                library.addLibrarian(librarian);
                break;
            case 6:
                // code for adding books
                System.out.println("Enter The ISBN:");
                bookName = input.nextLine();
                library.addBook(library.searchBook(bookName),1);
                break;
            case 7:
                // code for removing user
                System.out.println("Enter Username:");
                username = input.next();
                System.out.println("Enter Password:");
                password = input.next();
                tempUser = new User(username,password);
                library.removeUser(tempUser);
                break;
            case 8:
                // code for removing librarian
                System.out.println("Enter Username:");
                username = input.next();
                System.out.println("Enter Password:");
                password = input.next();
                tempLibrarian = new Librarian(username,password);
                library.removeLibrarian(tempLibrarian);
                break;
            case 9:
                // code for removing books
                System.out.println("Enter The ISBN:");
                bookName = input.nextLine();
                library.removeBook(library.searchBook(bookName));
                break;
            case 10:
                // code for updating user
                System.out.println("Enter Old Username:");
                username = input.next();
                System.out.println("Enter Old Password:");
                password = input.next();
                tempUser = new User(username , password);
                System.out.println("Enter New Username:");
                username = input.next();
                System.out.println("Enter New Password:");
                password = input.next();
                User appointedUser = new User(username , password);
                library.updateUser(tempUser , appointedUser);
                break;
            case 11:
                // code for updating librarian
                System.out.println("Enter Old Username:");
                username = input.next();
                System.out.println("Enter Old Password:");
                password = input.next();
                tempLibrarian = new Librarian(username , password);
                System.out.println("Enter New Username:");
                username = input.next();
                System.out.println("Enter New Password:");
                password = input.next();
                Librarian appointedLibrarian = new Librarian(username , password);
                library.updateLibrarian(tempLibrarian , appointedLibrarian);
                break;
            case 12:
                // code for updating books
                System.out.println("Enter Name Of The Book:");
                bookName = input.nextLine();
                System.out.println("Enter Name Of The Author:");
                String author = input.nextLine();
                System.out.println("Enter Year Of Publish:");
                String YOP = input.nextLine();
                System.out.println("Enter ISBN:");
                String ISBN = input.nextLine();
                Book book = new Book(bookName,author,YOP,ISBN);
                break;
            case 13:
                // code for Decreasing books quantity
                System.out.println("Enter ISBN:");
                ISBN = input.nextLine();
                library.decreaseBook(library.searchBook(ISBN));
                break;
            case 14:
                // code for Increasing books quantity
                System.out.println("Enter ISBN:");
                ISBN = input.nextLine();
                library.increaseBook(library.searchBook(ISBN));
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }

    }
    public static void RentAndReturn(User user){
        System.out.println("Enter  Your Desired Operation:");
        System.out.println("1.Rent Books");
        System.out.println("2.Return Books");
        System.out.println("3.List Of Rented Books");

        int choice = input.nextInt();

        String ISBN = "";
        switch (choice){
            case 1:
                System.out.println("Enter The ISBN Of The Books:");
                ISBN = input.nextLine();
                user.borrowBook(ISBN , library);

                break;
            case 2:
                System.out.println("Enter The ISBN Of The Books:");
                ISBN = input.nextLine();
                user.returnBook(ISBN , library);

                break;
            case 3:
                System.out.println("Here is a list of the Books you rented");
                System.out.println(user.getRentedBooks());

                break;
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

        User user1 = new User("farid", "401222112");
        User user2 = new User("shayan", "401222086");

        library.addUser(user1);
        library.addUser(user2);

        Librarian librarian1 = new Librarian("mohamad", "401222020");
        Librarian librarian2 = new Librarian("rana", "401222066");

        library.addLibrarian(librarian1);
        library.addLibrarian(librarian2);

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
            }

        }
        else if (library.doesLibrarianExist(username)) {
            if (library.searchLibrarian(username).getPassword() == password){
                adminPanel();
            }
            else{
                System.out.println("Wrong Password!");
            }
        }
        else{
            System.out.println("User Doesn't Exist!");
        }


    }
}
