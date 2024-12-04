package PT.equals;

import java.util.Objects;

public class Equals {
    public static void main(String[] args) {

        Book book1 = new Book("해리포터");
        Book book2 = new Book("해리포터");

        boolean test1 = book1 == book2;
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
        System.out.println("test1 = " + test1);
        boolean test2 = book1.equals(book2);
        System.out.println("test2 = " + test2);

    }
}

class Book{
    String name;

    public Book(String name) {
        this.name = name;
    }

//    public boolean equals(Object obj) {
//        System.out.println(obj);
//        System.out.println(this.toString());
//        return (this == obj);
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }



//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return Objects.equals(name, book.name);
//    }
}

