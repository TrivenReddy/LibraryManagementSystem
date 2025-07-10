package com.codegnan.model;

import java.util.Comparator;

public class PopularityComparator implements Comparator<Book> {
	 public int compare(Book book1, Book book2) {
	        return Double.compare(book2.getRating(), book1.getRating());
	    }

	
}
