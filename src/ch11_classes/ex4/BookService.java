package ch11_classes.ex4;

import java.util.Scanner;

public class BookService {
    Scanner scanner = new Scanner(System.in);
    Bookespository bookespository = new Bookespository();

    /**
     * 도서등록 메서드
     * name: save
     * BookDTO 객체에 담아서 Repository로 전달하여 저장이 되도록 함
     * 등록 여부를 출력한다.(등록성공 or 등록실패)
     */
    public void save(){
        System.out.println("도서명");
        String bookTitle =scanner.next();
        System.out.println("저자");
        String bookAuthor =scanner.next();
        System.out.println("가격");
        String bookPrice =scanner.next();
        System.out.println("출판사");
        String bookPublisher=scanner.next();
//BookDTO bookDTO=



    }
}
