package ch10_class.ex5;

import java.sql.SQLOutput;

public class BookMain {
    public static void main(String[] args) {
        // 책 정보는 시중에 있는 실제 책으로 해보기

        //기본생성자로 객체 만들고 필드값 채우기
        Book book1 = new Book();
        book1.bookTitle = "알사탕";
        book1.bookAuthor = "백희나";
        book1.bookPublisher = "책읽는 곰";
        book1.isbn = "563";
        book1.bookPrice = 10800;

        //매개변수 2개 있는 생성자로 객체 만들고 필드값 채우기
        Book book2 = new Book("구름빵","백희나");
        book2.bookPublisher = "책읽는 곰";
        book2.isbn = "563";
        book2.bookPrice = 15000;

        //모든 매개변수 있는 생성자로 객체 만들고 필드값 채우기
        Book book3 = new Book("오싹오싹 편의점", "김영진", "책 읽는 곰", "897", 15000);


    }
}