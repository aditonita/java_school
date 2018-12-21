package tema2.library;

public class Book {

	private String bookName;
	private int bookPageNumber;

	public Book() {

	}

	public Book(String bookName) {
		this.bookName = bookName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPageNumber() {
		return bookPageNumber;
	}

	public void setBookPageNumber(int bookPageNumber) {
		this.bookPageNumber = bookPageNumber;
	}

}
