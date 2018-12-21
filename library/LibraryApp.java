package tema2.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		ArtAlbum artAlbum = new ArtAlbum();
		Novel novel = new Novel();
		
		List<Book> libraryList = new ArrayList<>();
		
		LibraryCatalog libraryCatalog = new LibraryCatalog(libraryList);
		
		artAlbum.setBookName("Arta Antica");
		artAlbum.setBookPageNumber(56);
		artAlbum.setAlbumPapaerQuality(5);
		
		novel.setBookName("Indianul");
		novel.setBookPageNumber(105);
		novel.setNovelType("mystery");
		
		libraryCatalog.addBook(artAlbum);
		libraryCatalog.addBook(novel);
		
		libraryCatalog.printAllBooks();
		
	}

}
