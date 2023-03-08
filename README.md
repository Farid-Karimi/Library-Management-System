# Library Management System

## Introduction

In this assignment, I created an object-oriented Java program that can manage a library. The program allows the users to search for books, borrow and return books, and manage the library inventory. The program is designed using object-oriented programming principles.

## Resources

- https://www.javatpoint.com/
- https://www.w3schools.com/

## Tasks

1. I forked the assignment repository and started programming the class `user`
2. I then completed the following classes by adding the required parameters and implementing the predefined functions: `Book`, `Librarian`, `Library`.
3. I deleted the `runMenu()` function and rewrite the structure of the Main class with into 3 parts:
    - Login menu which takes the username and password and checks of they exist in the memory.
    - `RentAndReturn ` which is the panel for the user to rent or return books and get a list of the rented Books.
    - `Admin Panel` for the librarian to add ,update or remove any of the users, books or other librarians.
4. after this I encountered numerous bugs which such as:
    - problem with input.nextLine();
    - function like `searchUser` didn't work because `return null;` statement , the fix for me was to make object of the same type with empty attributes and return that instead of null.
    - update functions and remove functions in library didn't work properly and the fix for this was to pass the exact object by using search functions instead of making temporary instances of them.
5. surely for finding bugs and issues and also making sure the code is easy to use and runs perfectly I had to test some simple testcases , So a portion of my time was spent doing that.
6. for the last task I have to write this report and push my code to GitHub.

## Notes

- I wasted a big portion of my time making a GUI for this system and I had to leave it incomplete and start making a simpler menu in terminal because finishing the GUI the way I intended took too much time to be able to finish the project in the given period.
- in the future I might complete the GUI and use that for navigating in the system.
- the code has the potential to has a lot less line of codes since you can extend the `user` class and name it `librarian` and make many methods exclusive to the `library` itself.

---

### Farid Karimi   -   401222112

