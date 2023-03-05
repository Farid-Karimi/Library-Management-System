import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

//build upon this

public class Main {
    public static void main(String[] args) {
        // Create some sample data
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "1954", "978-0547928210");
        Book book2 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "1997", "978-0747532743");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "1960", "978-0446310789");

        Library library = new Library();

        library.addBook(book1, 5);
        library.addBook(book2, 3);
        library.addBook(book3, 2);

        User user1 = new User("farid", "karimi");
        User user2 = new User("user2", "password2");
        User user3 = new User("user3", "password3");

        library.addUser(user1);
        library.addUser(user2);
        library.addUser(user3);

        Librarian librarian1 = new Librarian("librarian1", "password1");
        Librarian librarian2 = new Librarian("librarian2", "password2");

        library.addLibrarian(librarian1);
        library.addLibrarian(librarian2);

        // ------------------------------Create the GUI-----------------------------------------------------
        JFrame frame = new JFrame("Library System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(530,350);
        frame.setLocationRelativeTo(null);
        // container to shuffle
        JPanel container = new JPanel();
        CardLayout cardLayout = new CardLayout();
        container.setLayout(cardLayout);
        //------------------------------panel for rent and returning the books------------------------------------
        JPanel RentAndReturn = new JPanel();
        RentAndReturn.setLayout(null);
        // Create the "Rent Book" button
        JButton rentButton = new JButton("Rent Book");
        rentButton.setBounds(45, 250, 200, 30);
        RentAndReturn.add(rentButton);
        // Create the "Return Book" button
        JButton returnButton = new JButton("Return Book");
        returnButton.setBounds(280, 250, 200, 30);
        RentAndReturn.add(returnButton);

        //------------------------------panel for librarian / admin------------------------------------
        JPanel adminPanel = new JPanel();
        adminPanel.setLayout(null);
        // Create the "Rent Book" button
        JButton rentButton = new JButton("Rent Book");
        rentButton.setBounds(45, 250, 200, 30);
        adminPanel.add(rentButton);
        // Create the "Return Book" button
        JButton returnButton = new JButton("Return Book");
        returnButton.setBounds(280, 250, 200, 30);
        adminPanel.add(returnButton);

        // --------------------------------panel for the user and librarian to login----------------------------------
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(100, 100, 80, 25);
        loginPanel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(200, 100, 165, 25);
        loginPanel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(100, 150, 80, 25);
        loginPanel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(200, 150, 165, 25);
        loginPanel.add(passwordText);
        //defining action for the button " login"
        ActionListener login = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                System.out.println(username);
                String password = passwordLabel.getText();
                //user registration
                if (library.doesUserExist(username)){
                    if(Objects.equals(library.searchUser(username).getPassword(), password)){
                        cardLayout.show(container, "RentAndReturn");
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "Wrong Password!");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(frame, "This Username Doesn't Exist!");
                }
                //librarian registration
                if (library.doesLibrarianExist(username)){
                    if(Objects.equals(library.searchLibrarian(username).getPassword(), password)){
                        //shuffle to admin panel
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "Wrong Password!");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(frame, "This Librarian Doesn't Exist!");
                }
            }
        };
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(250, 200, 80, 25);
        loginPanel.add(loginButton);
        loginButton.addActionListener(login);

        //---------------------------this is where I add components-------------------------------------------
        container.add(loginPanel, "Login");
        container.add(adminPanel, "Rent or Return the Books");
        frame.add(container);
        frame.setVisible(true);
    }
}