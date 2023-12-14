package ch11_array.ex3;

import ch10_class.ex3.Student;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {


        // Book 객체를 담기위한 bookList 객체 선언
        List<Book> bookList = new ArrayList<>();

        // 기본생성자로 Book 객체(book1) 생성 후 bookList에 추가
        Book book1 = new Book();
        book1.setBookTitle("장수탕 선녀님");
        book1.setBookAuthor("백희나");
        book1.setBookPrice("18000");
        book1.setBookPublisher("책 읽는 곰");
        bookList.add(book1);

        // 매개변수 생성자로 Book 객체(book2) 생성 후 bookList에 추가
        Book book2 = new Book("마음버스", "김유", "19000", "천개의 바람");
        bookList.add(book2);

        Book book3 = new Book("알사탕", "백희나", "16000", "책읽는 곰");
        bookList.add(book3);
        
        // for를 이용하여 bookList의 전체 데이터 출력
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("bookList.get(0) = " + bookList.get(i));
        }

        // for each를 이용하여 bookList의 전체 데이터 출력
        for (Book book : bookList) {
            System.out.println("book = " + book);
        }
        // list의 0번 인덱스에 담긴 책의 가격을 50000으로 변경(덮어쓰기 하면 된다)
        bookList.get(0).setBookPrice("5000");

        // list의 1번 인덱스에 담긴 출판사의 제목을 "안녕출판사"로 변경
        bookList.get(1).setBookPublisher("안녕출판사");
        // for를 이용하여 bookList의 전체 데이터 출력
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("bookList.get(0) = " + bookList.get(i));
        }
        // for each를 이용하여 bookList의 전체 데이터 출력
        for (Book book : bookList) {
            System.out.println("book = " + book);
        }
    }
}
