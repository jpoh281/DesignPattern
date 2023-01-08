import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookShelfTest {

    @Test
    void can_add_books_over_maximum_length() {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Assertions.assertEquals(bookShelf.getLength(), 4);

        bookShelf.appendBook(new Book("Last Books"));
        Assertions.assertEquals(bookShelf.getLength(), 5);
    }
}