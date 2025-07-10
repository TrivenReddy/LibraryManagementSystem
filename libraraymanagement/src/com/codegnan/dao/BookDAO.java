package com.codegnan.dao;


import java.util.TreeSet;

import com.codegnan.model.Book;
import com.codegnan.model.PopularityComparator;

public class BookDAO {
	private TreeSet<Book> books = new TreeSet<>(new PopularityComparator());
//adding book
    public void addBook(Book book) {
        books.add(book);
    }
//update 
    public void updateBookRating(int ISBN, double rating) {
        for (Book book : books) {
            if (book.getISBN()==(ISBN)) {
                book.setRating(rating);
                //break;
            }
        }
    }

    public TreeSet<Book> getAllBooks() {
        return books;
    }
//Top Rated Books
   public Book getTopRatedBook() {
        if (books.isEmpty()) {
            return null;
        }
        return books.first();
    }



	

}
