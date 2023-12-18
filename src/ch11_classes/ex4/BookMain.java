package ch11_classes.ex4;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNO = 0;

        while (run) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.도서등록 | 2.도서목록 | 3.도서조회(id) | 4.도서조회(제목) | 5.가격수정 | 6.도서삭제 | 7.도서검색 | 0.종료");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            selectNO = scanner.nextInt();
            if (selectNo == 1) {
                // 호출하는 문장 작성
                bookServise.save();
            } else if (selectNo == 2) {
                // 호출하는 문장 작성
            } else if (selectNo == 3) {
                // 호출하는 문장 작성
            } else if (selectNo == 4) {
                // 호출하는 문장 작성
            } else if (selectNo == 5) {
                // 호출하는 문장 작성
            } else if (selectNo == 6) {
                // 호출하는 문장 작성
            } else if (selectNo == 0) {
                run = false;
            }

        }
    }
}
