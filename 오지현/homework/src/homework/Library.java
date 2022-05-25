package homework;

import java.util.*;

public class Library {
	private Set<Book> books;
	ArrayList<Reader>readers = new ArrayList<Reader>();
	
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
	public void printPerson() {
		this.readers.forEach(b -> System.out.println(b + "\n\n"));
	}
	
	public void addReader(Reader reader) {
		readers.add(reader);
	}
	
	public void removeReader(String name) {
		for(int i=0;i<readers.size();i++) {
			if(readers.get(i).getName().equals(name))
				readers.remove(i);
		}
	}
}