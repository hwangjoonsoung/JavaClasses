package org.example;

public class BookServiceProxy implements BookService{

    BookService bookService ;

    public BookServiceProxy(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void rent(Book book) {
        System.out.println("start");
        bookService.rent(book);
        System.out.println("end");
    }

    @Override
    public void returnBook(Book book) {

    }
}
