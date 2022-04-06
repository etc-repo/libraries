package com.ptu.library;

import java.util.HashSet;
import java.util.Set;

public class Library {
	private Set<Book> books;

	public Library() {
		this.books = new HashSet<>();
	}

	public void registerBook(Book book) {
		this.books.add(book);
	}

	public void unregisterBook(Book book) {
		this.books.remove(book);
	}

	public void printBooks() {
		this.books.forEach(b -> System.out.println(b + "\n\n"));
	}
}
