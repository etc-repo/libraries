package homework;

public class LibraryMain {
	public static void main(String[] args) {
		// ������ ����
		Library library = new Library();
		
		// å ����
		Book book1 = new Book("A");
		Book book2 = new Book("B");
		Book book3 = new Book("C");
		
		// å ���
		library.registerBook(book1);
		library.registerBook(book2);
		library.registerBook(book3);
		
		
		// ���
		library.printBooks();
		library.printPerson();
	}
}
