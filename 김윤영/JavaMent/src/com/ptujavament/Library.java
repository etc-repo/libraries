package com.ptujavament;

import java.util.HashSet;
import java.util.Set;

/*
# 도서관
- 책 등록
- 책 등록 해제
- 대출
- 반납
- 회원 등록
- 회원 탈퇴


Set<Book> presentBooks;
Set<Book> borrowedBooks;
Set<Person> registeredMember;



# 책
- 제목, 저자, 출판사

String title;
String author;
String publisher;

- 책 등록할 때 title, author, publisher 무조건 써야 책을 등록할 수 있게 하기
Book(title, author, publisher);

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ


# Person
- 이름, 나이, 성별, 주소 

String personName;
int age;
String gender;
String address;

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

## 저자
- 저서
List <Book> onesBook;


ㅡㅡㅡㅡㅡ

## 독자
- 회원/비회원, 대출한 책 목록

List <Book> checkOutBooksList;
boolean MeberStatus;

- 회원 등록할 때 이름, 나이, 성별, 주소를 무조건 써야 회원 등록할 수 있게 하기
super(personName, age, gender, address);



- borrowedbooks를 없애고 boolean 값으로 대출했는지 반납했는지 확인하기


*/

public class Library {
	private Set<Book> presentBooks;
	private Set<Book> borrowedBooks;
	private Set<Reader> registeredMember;

	public Library() {
		this.presentBooks = new HashSet<>();
		this.borrowedBooks = new HashSet<>();
		this.registeredMember = new HashSet<>();
	}

	public Set<Book> getPresentBooks() {

		return this.presentBooks;
	}

	public Set<Book> getBorrowedBooks() {
		return this.borrowedBooks;
	}

	public Set<Reader> getRisteredMember() {
		return this.registeredMember;
	}

	public void registerBook(Book book) {
		this.presentBooks.add(book);
	}

	public void unregisterBook(Book book) {
		this.presentBooks.remove(book);
	}

	public void checkoutBook(Book book, Reader reader) {
		if (this.presentBooks.contains(book)) {
			if (this.borrowedBooks.contains(book)) {
				System.out.println("해당 책은 대출 중입니다");
			}
			this.borrowedBooks.add(book);
			System.out.println(getBorrowedBooks());
			//person.borrowed(book);
		} else
			System.out.println("해당 책은 도서관에 등록되지 않았습니다");
	}

	public void checkoutBook33(String title, Reader reader) {

		for (Book book : getPresentBooks()) {
			if (title.equals(book.getTitle())) {
				this.borrowedBooks.add(book);
				System.out.println(book.getTitle() + "를 대출하셨습니다.");
				reader.printReader();
			}
		}

	}

	public void returnBook(Book book, Reader reader) {
		this.borrowedBooks.remove(book);
		//person.turnIn(book);
	}

	public void printBooks() {
		this.presentBooks.forEach(b -> System.out.println(b + "\n\n"));
	}

	public void registerMember(Reader reader) {
		this.registeredMember.add(reader);
		reader.setMeberStatus(true);
	}

	public void unregisterMember(Reader reader) {
		this.registeredMember.remove(reader);
		reader.setMeberStatus(false);
	}

}
