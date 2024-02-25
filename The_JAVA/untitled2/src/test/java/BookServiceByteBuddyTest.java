import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.InvocationHandlerAdapter;
import org.example.Book;
import org.example.BookRepository;
import org.example.BookService;
import org.example.DefaultBookService;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static net.bytebuddy.matcher.ElementMatchers.named;
public class BookServiceByteBuddyTest {


    @Test
    public void rentTest() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new DefaultBookService(bookRepository);

        Book book = new Book();
        book.setTitle("spring");
        defaultBookService.rent(book);
        defaultBookService.returnBook(book);

    }

}