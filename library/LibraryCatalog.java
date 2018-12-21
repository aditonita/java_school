package tema2.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog implements Library {

	private List<Book> bookList = new ArrayList<>();

	public LibraryCatalog(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	@Override
	public void addBook(Book book) {
		bookList.add(book);
	}

	@Override
	public boolean deleteBookByName(String bookName) {
		return bookList.removeIf((Book book) -> book.getBookName() == bookName);
	}

	@Override
	public Book findByName(String bookName) {
		
		Book book = new Book();
		
		for(Book myBook : bookList){
			if(myBook.getBookName() == bookName) {
				book = myBook;
			}
		}
		return book;
	}

	@Override
	public void printAllBooks() {
		for(Book book: bookList) {
			System.out.println(book.getBookName() + ":" + book.getBookPageNumber());
		}
	}

}
