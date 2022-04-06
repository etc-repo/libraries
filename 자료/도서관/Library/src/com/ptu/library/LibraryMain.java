package com.ptu.library;

public class LibraryMain {
	public static void main(String[] args) {
		// 도서관 생성
		Library library = new Library();
		
		// 책 생성
		Book book1 = new Book("A");
		Book book2 = new Book("B");
		Book book3 = new Book("C");
		
		// 책 등록
		library.registerBook(book1);
		library.registerBook(book2);
		library.registerBook(book3);
		
		// 출력
		library.printBooks();
	}
}
