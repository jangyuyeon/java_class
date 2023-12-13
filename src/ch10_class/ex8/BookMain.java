package ch10_class.ex8;

import java.sql.SQLOutput;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
     //   book.bookTitle = "책제목1";
    book.setBookTitle(("책제목1"));
    String title = book.getBookTitle();
        System.out.println("title= " +title);
        System.out.println(book.getBookTitle());

       // book.setBookAuthor();
       // System.out.println(book.setBookAuthor());

    }
}
