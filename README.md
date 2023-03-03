# Library Management System

## Introduction
In this assignment, you will create an object-oriented Java program that can manage a library. The program should allow users to search for books, borrow and return books, and manage the library inventory. The program should be designed using object-oriented programming principles.

## Objectives
- Review the concepts of object-oriented programming (OOP) and utilize them correctly
- Familiarize yourself with the concept of Encapsulation
- Learn the difference between Static and Instance variables
- Use Git for version control and collaborate on a codebase
- Write a report on the assignment

## Tasks
1. Fork this repository and clone the fork to your local machine. Ensure to create a new Git branch before starting your work
2. Complete the following classes by adding the required parameters and implementing the predefined functions: `Book`, `Librarian`, `User`, `Library`
3. In the `runMenu()` function of the Main class, Implement an interactive menu in the command line that allows:
    - Users to login, logout, borrow and return books
    - Librarians to login, logout, add or delete books
4. Your menu should allow new Users to create an account by providing a username and a password. Prevent new users choosing a previously taken username. Authenticate each user before logging in
5. Your program should keep a list of all users (and the books they've borrowed), all librarians, and all books
6. Commit your changes and push them to your own fork on Github

## Notes
- The code provided in this repository gives you a template to work with and build your project. You are allowed to:
    - Add new functions and classes to your code wherever you see fit.
    - Change and swap the predefined functions as you wish, as long as the program satisfies all the requirements.
    
- Your report should focus on the structure you chose for each different class, as well the OOP principles you followed while designing your project. Describe the design of your program, including the classes, objects, methods, and attributes.

- If you implement any bonus features, be sure to include additional details about them in your report. 

## Evaluation
- Your code should compile and run without any errors
- Your code should be well-organized, readable, properly commented and follows clean code principles
- Your code should follow OOP principles and correctly use Java access modifiers
- You should use Git for version control and include meaningful commit messages

**Attention: Using ChatGPT or any other AI generative model for any section of the assignment will result in a score of 0 without any warnings.**

## Bonus Objectives
1. Perform Input Validation: Ensure the data or information entered by a user or system is correct, complete, and appropriate for the intended use. For instance, a user shouldn't be able to borrow the same book twice, or return a book they haven't borrowed yet.

2. Implement Encapsulation in your code to protect the data and ensure that it can only be accessed through the defined setter/getter functions. Describe the difference between the distinct Java access modifiers in your report.

3. Extend the User and Librarian classes to create a more secure login system. Use a hashing algorithm to hash the user's password. Give a brief explanation about the hashing process in your report.

4. Add a simple GUI (Graphical User Interface) to your project using either Swing or JavaFX. This GUI should include all of the options offered by the command line menu you implemented earlier. Displaying pictures or icons is optional.

## Submission
- Push your code to your fork on Github
- Upload your report to your fork on GitHub

The deadline for submitting your code is Wednesday, March 8 (17th of Esfand). Any commit made after this date will not affect your score.

Good luck and happy coding!
