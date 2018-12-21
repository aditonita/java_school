package tema2.library;

public interface Library {
	public void addBook(Book book);

	public boolean deleteBookByName(String bookName);

	public Book findByName(String bookName);

	public void printAllBooks();
}
