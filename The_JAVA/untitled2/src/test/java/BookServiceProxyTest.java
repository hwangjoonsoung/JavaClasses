import org.example.Book;
import org.example.BookService;
import org.example.BookServiceProxy;
import org.example.DefaultBookService;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BookServiceProxyTest {

    DefaultBookService bookService = (DefaultBookService) Proxy.newProxyInstance(DefaultBookService.class.getClassLoader(), new Class[]{DefaultBookService.class},
            new InvocationHandler() {
                DefaultBookService bookService = new DefaultBookService();
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                  1.리얼 프로젝트만 동작
//                    return method.invoke(bookService, args);

//                  2.프록시 + 리얼 프로젝트만 동작
                    System.out.println("Start");
                    Object invoke = method.invoke(bookService, args);
                    System.out.println("end");

//                  3. 특정 method만 프록시 적용하고 싶은 경우
/*                      if(method.getName().equals("rent")){
                        System.out.println("Start");
                        Object invoke = method.invoke(bookService, args);
                        System.out.println("end");
                    }*/
                    return invoke;
                }
            });

    @Test
    public void rentTest(){
        Book book = new Book();
        book.setTitle("spring");
        bookService.rent(book);
        bookService.returnBook(book);

    }

}
