# 📚 Library Book Management System

A simple console-based Java application to manage a small library. This system keeps track of books, borrowers, and the loan status of books using **Core Java and Collections Framework**.

**🔍 Project Overview**
This Library Management System is designed for basic library operations such as adding books, issuing them to borrowers, and viewing their availability. It’s suitable for beginners looking to practice object-oriented programming and Java collections

---

## 🧱 Project Structure


com.codegnan.model
 ├── Book.java
 └── PopularityComparator.java

com.codegnan.dao
 └── BookDAO.java

com.codegnan.service
 └── LibraryService.java

com.codegnan.view
 └── LibraryApp.java


---

## 🚀 Features

- ✅ Add new books with title, author, ISBN, and rating
- ✅ Update book ratings
- ✅ View all books sorted by rating (popularity)
- ✅ Retrieve the top-rated book
- ✅ Use of TreeSet (or optional PriorityQueue) to maintain sorted order

---

## 🧩 Technologies Used

- Java Collections (TreeSet, PriorityQueue)
- Comparator interface
- Layered architecture (MVC-style)
- Console-based user interaction

---

## 📂 Layer Description

### 1. Model Layer (com.codegnan.model)
- Book.java: Represents a book entity.
- PopularityComparator.java: Comparator to sort books by rating (descending).

### 2. DAO Layer (com.codegnan.dao)
- BookDAO.java: Manages the book collection using TreeSet.

### 3. Service Layer (com.codegnan.service)
- LibraryService.java: Business logic, handles interaction between DAO and View.

### 4. View Layer (com.codegnan.view)
- LibraryApp.java: Console interface for users.

---

## 🧪 Sample Input & Output

text
1. Add new Book
2. Update Book Rating
3. Display All Books
4. Display Top-Rated Book
5. Exit

Enter your choice: 1
Enter Book Title: Java Programming
Enter Author: Kisara
Enter ISBN: 123-987654
Enter Rating: 5

Enter your choice: 3
Books Sorted by Popularity:
1. Java Programming by Kathy Sierra (Rating: 5)


---

## 🛠 Optional Advanced Feature

- Switch to PriorityQueue for dynamic book prioritization based on rating updates.

---

## 🏁 How to Run

1. Compile all Java files inside their respective packages.
2. Run LibraryApp.java to start the system.
3. Follow the menu prompts in the console.
4. or U can run application through eclipse any find output in console

---

## 📌 Note

This system is built for educational purposes to demonstrate Java Collections and multi-layered architecture. It can be further enhanced with a GUI or database integration.






<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/d1928393-156a-4cb2-b158-4a17f7974928" />
