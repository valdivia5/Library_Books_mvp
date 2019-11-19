import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest{
    private Library library;
    private Books books;

    @Before
    public void before(){
        library = new Library();
        books = new Books("El Quijote", "Cervantes", "Adventures");

    }
    @Test
    public void bookListIsEmpty(){
        assertEquals(0, library.bookCount());
    }
    @Test
    public void addBookToTheList(){
        library.addBook(books);
        library.addBook(books);
        assertEquals(2, library.bookCount());
    }


}