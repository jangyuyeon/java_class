package ch11_classes.ex2;

public class BookMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        // bookService 클래스 객체 선언
        BookService bookService = new BookService();

        while (run) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.도서등록 | 2.도서목록 | 3.도서조회(id) | 4.도서조회(제목) | 5.가격수정 | 6.도서삭제 | 0.종료");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scan.nextInt();
            if (selectNo == 1) {
                bookService.save();
            } else if (selectNo == 2) {
                bookService.method2();
            } else if (selectNo == 3) {
                bookService.method3();
            } else if (selectNo == 4) {
                bookService.method4();
            } else if (selectNo == 5) {
                bookService.method5();
            } else if (selectNo == 6) {
                bookService.method6();
            } else if (selectNo == 0) {
                run = false;
            }
        }
    }
    }
