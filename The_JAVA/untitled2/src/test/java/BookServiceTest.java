import org.example.Book;
import org.example.BookService;
import org.example.BookServiceProxy;
import org.example.DefaultBookService;
import org.junit.Test;

public class BookServiceTest {

    BookService bookService = new BookServiceProxy(new DefaultBookService());

    @Test
    public void rentTest(){
        Book book = new Book();
        book.setTitle("spring");
        bookService.rent(book);

    }

}
