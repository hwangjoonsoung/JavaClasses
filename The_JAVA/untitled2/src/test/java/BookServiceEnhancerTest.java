import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.example.Book;
import org.example.BookService;
import org.example.BookServiceProxy;
import org.example.DefaultBookService;
import org.junit.Test;
import org.objectweb.asm.Handle;

import java.lang.reflect.Method;
import java.util.logging.Handler;

public class BookServiceEnhancerTest {


    @Test
    public void rentTest(){
        MethodInterceptor handler = new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                /*DefaultBookService bookService = new DefaultBookService();
                System.out.println("start");
                Object invoke = method.invoke(bookService, args);
                System.out.println("end");
                return invoke;*/

                Object invoke = null;
                if (method.getName().equals("rent")) {
                    DefaultBookService bookService = new DefaultBookService();
                    System.out.println("start");
                    invoke = method.invoke(bookService, args);
                    System.out.println("end");
                }
                return invoke;
            }
        };
        BookService bookService = (BookService) Enhancer.create(DefaultBookService.class, handler);
        Enhancer.create(DefaultBookService.class, handler);

        Book book = new Book();
        book.setTitle("spring");
        bookService.rent(book);
        bookService.returnBook(book);

    }

}
